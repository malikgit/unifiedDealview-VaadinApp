/**
 * EmployeeDAO.java
 */
package postgresdao.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.Applicant;
import model.ApplicantAddresses;
import model.ApplicantAsset;
import model.ApplicantCollections;
import model.ApplicantIncomeTable;
import model.Income;
import model.Liabilities;
import model.Mortgages;
import model.Opportunity;
import model.Properties;
import model.Property;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import postgresdao.PostgresDAOI;
import postgresdao.factory.DBConnectionFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * 
 * @author bizruntime.
 *
 */
public class PostgresDAO implements PostgresDAOI {
	private static final Logger LOGGER = LoggerFactory.getLogger(PostgresDAO.class);

	public static final String SELECT_OPPORTUNITY_DETAILS_SQL = "select row_to_json(crm_lead) as crm_lead from crm_lead where id =?";
	public static final String SELECT_APPLICANT_DETAILS_SQL = "select row_to_json(applicant_record) as applicant_record from applicant_record where id =?";
	public static final String SELECT_APPLICANTRELATION_DETAILS_SQL = "select row_to_json(opportunity_applicant_rel) as opportunity_applicant_rel from opportunity_applicant_rel where opp_id =?";
	public static final String SELECT_APPLICANT_PROPERTIES_SQL = "select row_to_json(applicant_property) as applicant_property from applicant_property where applicant_id =?";
	public static final String SELECT_APPLICANT_MORTGAGE_SQL = "select row_to_json(applicant_mortgage) as applicant_mortgage from applicant_mortgage where property_id =? and applicant_id =?";
	public static final String SELECT_APPLICANT_INCOME_SQL = "select row_to_json(income_employer) as income_employer from income_employer where applicant_id =?";
	public static final String SELECT_APPLICANT_COLLECTION_SQL = "select row_to_json(applicant_collection) as applicant_collection from applicant_collection where applicant_id =?";
	public static final String SELECT_APPLICANT_PAYMENT_SQL = "select row_to_json(applicant_payment) as applicant_payment from applicant_payment where applicant_id =?";
	public static final String CREATE_NEW_LEAD_SQL = "select row_to_json(crm_lead) as crm_lead from crm_lead where id =?";
	public static final String SELECT_APPLICANT_ADDRESSES_SQL = "select row_to_json(applicant_address) as applicant_address from applicant_address where applicant_id =?";
	public static final String SELECT_APPLICANT_INCOMES_SQL = "select row_to_json(income_employer) as income_employer from income_employer where applicant_id =?";
	public static final String SELECT_APPLICANT_LIABILITIES_SQL = "select row_to_json(applicant_liabilities) as applicant_liabilities from applicant_liabilities where applicant_id =?";
	public static final String SELECT_APPLICANT_CREDIT_REPORT_SQL = "select row_to_json(applicant_liabilities) as applicant_liabilities from applicant_liabilities where applicant_id =?";
	public static final String SELECT_APPLICANT_MORTGAGES_SQL = "select row_to_json(applicant_mortgage) as applicant_mortgage from applicant_mortgage where applicant_id =?";
	public static final String SELECT_CRM_ASSET_SQL = "select row_to_json(crm_asset) as crm_asset from crm_asset where opportunity_id =?";
			
	
	ObjectMapper ObjectMapper = new ObjectMapper();

	@Override
	public Opportunity getOpportunityDetails(String opportunityId) {

		LOGGER.debug("Inside getOpportunityDetails method of PostgresDAO");
		Opportunity oppurtunityDetails = null;
		Connection connection = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String aliasName = "crm_lead";
		try {
			connection = DBConnectionFactory.getConnection();
			st = connection.prepareStatement(SELECT_OPPORTUNITY_DETAILS_SQL);
			st.setInt(1, new Integer(opportunityId));
			rs = st.executeQuery();

			String opporunityData = getResult(rs, aliasName);
			oppurtunityDetails = ObjectMapper.readValue(opporunityData,
					Opportunity.class);

			LOGGER.debug("Opportunity Details retrieved Successfully."
					+ opporunityData);
		} catch (SQLException | IOException sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);

		}

		List<Applicant> listApplicants = getApplicantIds(opportunityId);

		// SHOULD BE UNCOMMENT OF APPLICANT LISTS
		// oppurtunityDetails.setApplicants(lisApplicants);

		return oppurtunityDetails;
	}// read opportunity details

	//Creating New CRM lead in postgressDB
	public int createLead(Opportunity opportunity) {
		LOGGER.debug("inside createLead method of PostgresDAO");
		Opportunity oppurtunityDetails = null;
		Connection connection = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String aliasName = "crm_lead";
		int result = 0;
		try {
			connection = DBConnectionFactory.getConnection();
			LOGGER.debug("name " + opportunity.getName());

			final String CREATE_NEW_LEAD_SQL1 = "INSERT INTO crm_lead (name) VALUES ('"
					+ opportunity.getName() + "')";
			st = connection.prepareStatement(CREATE_NEW_LEAD_SQL1);
			result = st.executeUpdate();
			LOGGER.debug("Opportunity Details Iserted  Successfully." + result);
		} catch (SQLException sqle) {
			LOGGER.error("Error when Creating New Lead in postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);

		}
		// oppurtunityDetails.setApplicants(lisApplicants);
		return result;
	}// read opportunity details
		
	public Applicant getApplicantDetailsByID(String applicantId) {

		Applicant applicants = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Connection connection = null;

		String aliasName = "applicant_record";
		try {
			connection = DBConnectionFactory.getConnection();

			st = connection.prepareStatement(SELECT_APPLICANT_DETAILS_SQL);
			st.setInt(1, new Integer(applicantId));
			rs = st.executeQuery();
			while (rs.next()) {
				applicants = ObjectMapper.readValue(rs.getString(aliasName),
						Applicant.class);

			}

		} catch (SQLException | IOException sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);

		}

		applicants.setIncomes(getApplicantIncomes(applicantId));
		applicants.setProperties(getApplicantProperties(applicantId));
		applicants.setCollections(getApplicantCollection(applicantId));
		applicants.setPayment(getApplicantLatePayment(applicantId));
		return applicants;

	}
	
	
	public List<Applicant> getApplicantIds(String opportunityId) {

		List<Applicant> listOfApplicant = new ArrayList<Applicant>();
		Connection connection = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String aliasName = "opportunity_applicant_rel";
		try {
			connection = DBConnectionFactory.getConnection();
			st = connection
					.prepareStatement(SELECT_APPLICANTRELATION_DETAILS_SQL);
			st.setInt(1, new Integer(opportunityId));
			rs = st.executeQuery();
			while (rs.next()) {
				LOGGER.info("applicant data before assinging to jsonBject "
						+ rs.getString(aliasName));

				JSONObject applicantJSon = new JSONObject(
						rs.getString(aliasName));
				LOGGER.info("applicant data in json format " + applicantJSon);
				listOfApplicant.add(getApplicantDetailsByID(applicantJSon
						.getString("app_id")));
			}

		} catch (SQLException | JSONException sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);

		}
		return listOfApplicant;

	}
	
	
	public List<Property> getApplicantProperties(String applicantId) {

		List<Property> listOfApplicantPropertys = new ArrayList<Property>();
		ObjectMapper objectMapper = new ObjectMapper();
		PreparedStatement st = null;
		ResultSet rs = null;
		Connection connection = null;
		Property pertProperty = null;
		String aliasName = "applicant_property";
		try {
			connection = DBConnectionFactory.getConnection();

			st = connection.prepareStatement(SELECT_APPLICANT_PROPERTIES_SQL);
			st.setInt(1, new Integer(applicantId));
			rs = st.executeQuery();
			while (rs.next()) {

				pertProperty = objectMapper.readValue(rs.getString(aliasName),
						Property.class);
				String mortagageExsist = getApplicantMortgageProperties(
						pertProperty.getProperty_id(), applicantId, connection);
				pertProperty.setMortgageYesNo(mortagageExsist);
				listOfApplicantPropertys.add(pertProperty);
			}
		} catch (Exception sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);
		}
		return listOfApplicantPropertys;

	}
	
	
	public String getApplicantMortgageProperties(String property_id,
			String applicantId, Connection connection) {

		String mortgageExist = "No";

		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = connection.prepareStatement(SELECT_APPLICANT_MORTGAGE_SQL);
			st.setString(1, property_id);
			st.setInt(2, new Integer(applicantId));

			rs = st.executeQuery();
			while (rs.next()) {

				mortgageExist = "Yes";
			}

		} catch (Exception sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(st, rs);

		}
		return mortgageExist;

	}

	private List<Income> getApplicantIncomes(String applicantId) {

		Connection connection = null;

		List<Income> listOfApplicantIncomes = new ArrayList<Income>();
		ObjectMapper objectMapper = new ObjectMapper();
		PreparedStatement st = null;
		ResultSet rs = null;
		Income income = null;
		String aliasName = "income_employer";
		try {
			connection = DBConnectionFactory.getConnection();

			st = connection.prepareStatement(SELECT_APPLICANT_INCOME_SQL);
			st.setInt(1, new Integer(applicantId));
			rs = st.executeQuery();
			while (rs.next()) {
				LOGGER.info("Applicant income data " + rs.getString(aliasName));
				income = objectMapper.readValue(rs.getString(aliasName),
						Income.class);

				listOfApplicantIncomes.add(income);
			}
		} catch (Exception sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);

		}
		return listOfApplicantIncomes;

	}

	public List<String> getApplicantCollection(String applicantId) {

		Connection connection = null;
		List<String> listOfCollection = new ArrayList<String>();
		PreparedStatement st = null;
		ResultSet rs = null;
		String aliasName = "applicant_collection";
		try {
			connection = DBConnectionFactory.getConnection();

			st = connection.prepareStatement(SELECT_APPLICANT_COLLECTION_SQL);
			st.setInt(1, new Integer(applicantId));
			rs = st.executeQuery();
			while (rs.next()) {
				listOfCollection.add(new JSONObject(rs.getString(aliasName))
						.getString("name"));
			}
		} catch (Exception sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);

		}
		return listOfCollection;

	}

	private int getApplicantLatePayment(String applicantId) {

		int payment = 0;
		Connection connection = null;

		PreparedStatement st = null;
		ResultSet rs = null;
		String aliasName = "applicant_payment";
		try {
			connection = DBConnectionFactory.getConnection();

			st = connection.prepareStatement(SELECT_APPLICANT_PAYMENT_SQL);
			st.setInt(1, new Integer(applicantId));
			rs = st.executeQuery();
			while (rs.next()) {
				try {
					int days = 0;
					Calendar calendar1 = Calendar.getInstance();
					Calendar calendar2 = Calendar.getInstance();
					SimpleDateFormat formatter = new SimpleDateFormat(
							"yy/MM/dd");

					@SuppressWarnings("deprecation")
					Date dateString = new Date(new JSONObject(
							rs.getString(aliasName)).getString("date"));
					calendar1.setTime(dateString);
					String date2 = formatter.format(calendar2.getTime());
					String date1 = formatter.format(calendar1.getTime());
					// System.out.println("date 1"+ date2 +"dat3 "+ date1);
					days = (int) ((formatter.parse(date2).getTime() - formatter
							.parse(date1).getTime()) / (1000 * 60 * 60 * 24));

					if (days <= 730 || days <= 731) {
						++payment;
						break;
					}
				} catch (Exception e) {
					LOGGER.error("error in parsing date");
				}
			}
		} catch (Exception sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);

		}
		return payment;

	}

	private void closeUp(Connection con, PreparedStatement st, ResultSet rs) {

		try {
			con.close();
			st.close();
			rs.close();
			LOGGER.info("Connection closed Successfully.");
		} catch (Exception sqle2) {
			LOGGER.error("Failed to Close Connection." + sqle2);
		}

	}

	public void closeUp(Connection con, PreparedStatement st) {

		try {
			con.close();
			st.close();

			LOGGER.info("Connection closed Successfully.");
		} catch (Exception sqle2) {
			LOGGER.error("Failed to Close Connection." + sqle2);
		}

	}
	private void closeUp( PreparedStatement st, ResultSet rs) {

		try {
			
			st.close();
			rs.close();
			LOGGER.info("Connection closed Successfully.");
		} catch (Exception sqle2) {
			LOGGER.error("Failed to Close Connection." + sqle2);
		}

	}
	

	private String getResult(ResultSet rs, String aliasName) throws SQLException {
		String resultData = null;
		while (rs.next()) {
			resultData = rs.getString(aliasName);
		}
		return resultData;
	}

	public List<ApplicantAddresses> getApplicantAddresses(int applicantId) {

		ApplicantAddresses applicantAddresses = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Connection connection = null;
		List<ApplicantAddresses> listOfAddress=new ArrayList<ApplicantAddresses>();
		String aliasName = "applicant_address";
		try {
			connection = DBConnectionFactory.getConnection();

			st = connection.prepareStatement(SELECT_APPLICANT_ADDRESSES_SQL);
			st.setInt(1, new Integer(applicantId));
			rs = st.executeQuery();
			while (rs.next()) {
				applicantAddresses = ObjectMapper.readValue(rs.getString(aliasName),ApplicantAddresses.class);
				//System.out.println(rs.getString(1));
				listOfAddress.add(applicantAddresses);
			}

		} catch (SQLException | IOException sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);

		}

		/*applicants.setIncomes(getApplicantIncomes(applicantId));
		applicants.setProperties(getApplicantProperties(applicantId));
		applicants.setCollections(getApplicantCollection(applicantId));
		applicants.setPayment(getApplicantLatePayment(applicantId));*/
		return listOfAddress;
	}
	public List<ApplicantIncomeTable> getApplicantIncomes(int applicantId) {
		ApplicantIncomeTable applicantAddresses = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Connection connection = null;
		List<ApplicantIncomeTable> listOfIncomes=new ArrayList<ApplicantIncomeTable>();
		String aliasName = "income_employer";
		try {
			connection = DBConnectionFactory.getConnection();

			st = connection.prepareStatement(SELECT_APPLICANT_INCOMES_SQL);
			st.setInt(1, new Integer(applicantId));
			rs = st.executeQuery();
			while (rs.next()) {
				applicantAddresses = ObjectMapper.readValue(rs.getString(aliasName),ApplicantIncomeTable.class);
				//System.out.println(rs.getString(1));
				listOfIncomes.add(applicantAddresses);
			}

		} catch (SQLException | IOException sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);

		}
		return listOfIncomes;
	}

	@Override
	public List<Liabilities> getLiabilities(int applicantId) {
		Liabilities liabilities = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Connection connection = null;
		List<Liabilities> listOfLiabilities=new ArrayList<Liabilities>();
		String aliasName = "applicant_liabilities";
		try {
			connection = DBConnectionFactory.getConnection();

			st = connection.prepareStatement(SELECT_APPLICANT_LIABILITIES_SQL);
			st.setInt(1, new Integer(applicantId));
			rs = st.executeQuery();
			while (rs.next()) {
				liabilities = ObjectMapper.readValue(rs.getString(aliasName),Liabilities.class);
				//System.out.println(rs.getString(1)+"\n");
				listOfLiabilities.add(liabilities);
			}

		} catch (SQLException | IOException sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);

		}
		return listOfLiabilities;
	}
	
	public List<ApplicantCollections> getApplicantCollections(int applicantId) {

		Connection connection = null;
		List<ApplicantCollections> listOfCollection = new ArrayList<ApplicantCollections>();
		ApplicantCollections applicantCollections = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String aliasName = "applicant_collection";
		try {
			connection = DBConnectionFactory.getConnection();

			st = connection.prepareStatement(SELECT_APPLICANT_COLLECTION_SQL);
			st.setInt(1, new Integer(applicantId));
			rs = st.executeQuery();
			while (rs.next()) {
//				listOfCollection.add(new JSONObject(rs.getString(aliasName)).getString("name"));
				applicantCollections= ObjectMapper.readValue(rs.getString(aliasName),ApplicantCollections.class);
				listOfCollection.add(applicantCollections);
			}
		} catch (Exception sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);

		}
		return listOfCollection;

	}
	
	public List<Properties> getApplicantProperties(int applicantId) {

		List<Properties> listOfApplicantProperties = new ArrayList<Properties>();
		ObjectMapper objectMapper = new ObjectMapper();
		PreparedStatement st = null;
		ResultSet rs = null;
		Connection connection = null;
		Properties pertProperty = null;
		String aliasName = "applicant_property";
		try {
			connection = DBConnectionFactory.getConnection();

			st = connection.prepareStatement(SELECT_APPLICANT_PROPERTIES_SQL);
			st.setInt(1, new Integer(applicantId));
			rs = st.executeQuery();
			while (rs.next()) {

				pertProperty = objectMapper.readValue(rs.getString(aliasName),Properties.class);
				listOfApplicantProperties.add(pertProperty);
			}
		} catch (Exception sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);
		}
		return listOfApplicantProperties;

	}
	
	public List<Mortgages> getApplicantMortgagesProperties(int applicantId) {

		List<Mortgages> listOfMortgages = new ArrayList<Mortgages>();
		ObjectMapper objectMapper = new ObjectMapper();
		PreparedStatement st = null;
		ResultSet rs = null;
		Connection connection = null;
		Mortgages mortgages = null;
		String aliasName = "applicant_mortgage";
		try {
			connection = DBConnectionFactory.getConnection();

			st = connection.prepareStatement(SELECT_APPLICANT_MORTGAGES_SQL);
			st.setInt(1, new Integer(applicantId));
			rs = st.executeQuery();
			while (rs.next()) {

				mortgages = objectMapper.readValue(rs.getString(aliasName),Mortgages.class);
				listOfMortgages.add(mortgages);
			}
		} catch (Exception sqle) {
			LOGGER.error("Error when connecting to the postgress db ", sqle);
		} finally {
			closeUp(connection, st, rs);
		}
		return listOfMortgages;

	}
	
	public List<ApplicantAsset> getApplicantAssets(int applicantId) {

		List<ApplicantAsset> listOfApplicantAsset = new ArrayList<ApplicantAsset>();
		ObjectMapper objectMapper = new ObjectMapper();
		PreparedStatement st = null;
		ResultSet rs = null;
		Connection connection = null;
		ApplicantAsset mortgages = null;
		String aliasName = "crm_asset";
		try {
			connection = DBConnectionFactory.getConnection();
			st = connection.prepareStatement(SELECT_CRM_ASSET_SQL);
			st.setInt(1, new Integer(applicantId));
			rs = st.executeQuery();
			while (rs.next()) {
				mortgages = objectMapper.readValue(rs.getString(aliasName),ApplicantAsset.class);
				listOfApplicantAsset.add(mortgages);
			}
		} catch (SQLException |IOException sqle) {
			LOGGER.error("Error when retrieving crm_assets from DB ", sqle);
		} finally {
			closeUp(connection, st, rs);
		}
		return listOfApplicantAsset;

	}
}