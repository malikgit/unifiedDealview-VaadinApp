/**
 * DBConnectionFactory
 */
package postgresdao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import postgresdao.testdao.TestDao;

/**
 * 
 * @author bizruntime
 *
 */
public class DBConnectionFactory {
	static final Logger LOGGER = LoggerFactory
			.getLogger(DBConnectionFactory.class);
	// Properties file instance.
	private static Properties properties;
	// Underlying Database url name.
	public static Connection getdBConnection() {
		Connection connection = null;
		try {
			properties = new Properties();
			Class.forName("org.postgresql.Driver");
			try {
				// getting connection parameter
				properties.load(DBConnectionFactory.class.getClassLoader()
						.getResourceAsStream("config.properties"));

			} catch (Exception e) {

			}

			String url = properties.getProperty("postgresURL");
			String userName = properties.getProperty("postgresUserName");
			String userPassword = properties.getProperty("postgresPassword");

			connection = DriverManager.getConnection(url, userName,
					userPassword);
			LOGGER.info("postgress connection is done");
		} catch (Exception e) {
			LOGGER.error("Failed to Connect Postgress DB ",e);
			throw new RuntimeException("failed to load DBConnection factory");
		}
		return connection;
	}// static

	// Provides the Connection to the requested Database.
	public synchronized static Connection getConnection() throws SQLException {

		return getdBConnection();

	}// getConnection
	public static void main(String[] args) {
		/*try {
			System.out.println("dddd");
			System.out.println(getConnection());
			System.out.println("eee");
			LOGGER.debug("Cooming::");
			System.out.println("fff");
		} catch (SQLException e) {
			LOGGER.error("Error when connecting to Postgres DB",e);
			
		}*/
	}

}
