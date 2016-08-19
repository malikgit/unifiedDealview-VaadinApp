/**
 * Testing DAO
 */
package postgresdao.testdao;

import java.util.List;

import model.ApplicantAsset;

import org.codehaus.jettison.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import postgresdao.PostgresDAOI;
import postgresdao.factory.DAOFactory;

/**
 * 
 * @author bizruntime
 *
 */
public class TestDao {
	static final Logger LOGGER = LoggerFactory.getLogger(TestDao.class);

	public static void main(String[] args) throws JSONException {
		PostgresDAOI postgresDao = DAOFactory.getPostgresDAO();

		/*
		 * ApplicantDocument ap = new RequiredDocumentBuilder()
		 * .RequiredDocumentBuilderMethod(opportunity); new
		 * PostgresDAO().getApplicantProperties("2894");
		 * System.out.println("opporunity data " + ap);
		 * System.out.println(employeeDao); employeeDao.updateEmployee(104,
		 * "Ram");
		 */

		/*
		 * Opportunity opportunity=new Opportunity();
		 * opportunity.setName("Stephen_Ammells");
		 * opportunity.setWork_phone("8765432123");
		 * opportunity.setEmail_work("akhandalmani.malik@bizruntime.com");
		 * postgresDao.createLead(opportunity);
		 */

		// Opportunity opportunity = postgresDao.getOpportunityDetails("4475");
		// LOGGER.debug("opportunity "+opportunity);
		// LOGGER.debug("Name >>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<"+opportunity.getName()+"ss "+opportunity.getApplication_no());

		// Fetching Applicants Data
		/*
		 * System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		 * List<Applicant> applicants=postgresDao.getApplicantIds("3584");
		 * System.out.println(applicants.size()); 
		 * for(Applicant applicant:applicants){
		 * //System.out.println(applicant.getApplicant_name());
		 * System.out.println(applicant.getId());
		 * System.out.println(applicant.getApplicant_last_name()); }
		 * System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		 */

		// System.out.println(postgresDao.getApplicantDetailsByID("2129"));

		// Fetching Applicant Addresses
		/*
		 * System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"); 
		 * List<ApplicantAddresses> applAddress=postgresDao.getApplicantAddresses(2129);
		 * System.out.println(applAddress.size()); for(ApplicantAddresses
		 * applAddr:applAddress){
		 * System.out.println(applAddr.getApplicant_id());
		 * System.out.println(applAddr.getName()); } System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<;'");
		 */

		// Fetching Incomes
		/*
		 * System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		 * List<ApplicantIncomeTable> listOfIncomes = postgresDao.getApplicantIncomes(2129);
		 * System.out.println(listOfIncomes.size()); for (ApplicantIncomeTable
		 * applAddr : listOfIncomes) {
		 * System.out.println(applAddr.getIncome_type());
		 * System.out.println(applAddr.getBusiness());
		 * System.out.println(applAddr.getPosition()); } System.out.println( ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		 */

		// Fetching Liabilites
		/*
		 * System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		 * List<Liabilities> listOfLiabilities = postgresDao.getLiabilities(2129); for(Liabilities
		 * liability:listOfLiabilities){
		 * System.out.println("\n Testing name of liability "+liability.getName()+"\n "+liability.getBusiness()); }
		 * System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		 */
		
		//Fetching Collections
		/*System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		List<ApplicantCollections> collections = postgresDao.getApplicantCollections(2129);
		 for(ApplicantCollections collection:collections){
			 System.out.println(collection.getName()+"\n "+collection.getAmount()+"\n balance "+collection.getBalance());
		 }
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");*/
		
		//Fetching Properties
		/*System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		List<Properties> properties = postgresDao.getApplicantProperties(2129);
		 for(Properties property:properties){
			 System.out.println("address name "+property.getName()+"\n value "+property.getValue()+"\n owed "+property.getOwed());
		 }
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");*/
		
//		Fetching Mortgages
		/*System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		List<Mortgages> mortgages = postgresDao.getApplicantMortgagesProperties(2129);
		 for(Mortgages mortgage:mortgages){
			 System.out.println("address name "+mortgage.getName()+"\n value "+mortgage.getInterest_rate()+"\n owed "+mortgage.getMonthly_payment());
		 }
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");*/
		
		/*System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		List<Applicant> applicants = postgresDao.getApplicantIds("3584");
		System.out.println(applicants.get(0).getApplicant_name());
		Applicant applicant=postgresDao.getApplicantDetailsByID("2129");
		System.out.println(applicant.getApplicant_name());
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");*/
		
		// Fetching Applicant Asset
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		List<ApplicantAsset> applicantAssets = postgresDao.getApplicantAssets(2129);
		for (ApplicantAsset applicantAsset : applicantAssets) {
			System.out.println("address name " + applicantAsset.getAsset_type()
					+ "\n value " + applicantAsset.getName() + "\n owed "
					+ applicantAsset.getValue());
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
	}

}