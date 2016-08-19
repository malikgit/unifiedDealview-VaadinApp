/**
 * DAOI.java
 */
package postgresdao;

import java.util.List;

import model.Applicant;
import model.ApplicantAddresses;
import model.ApplicantAsset;
import model.ApplicantCollections;
import model.ApplicantIncomeTable;
import model.Liabilities;
import model.Mortgages;
import model.Opportunity;
import model.Properties;
import model.Property;

/**
 * 
 * @author bizruntime.
 *
 */
public interface PostgresDAOI{
	
	
	//TO READ THE OPPORTUNITY DETAILS
	public Opportunity getOpportunityDetails(String opportunityId) ;
	public int createLead(Opportunity opportunity);
	public List<Applicant> getApplicantIds(String opportunityId);
	public Applicant getApplicantDetailsByID(String applicantId);
	public  List<ApplicantAddresses> getApplicantAddresses(int applicantId);
	public List<ApplicantIncomeTable> getApplicantIncomes(int applicantId);
	public List<Liabilities> getLiabilities(int applicantId);
	public List<String> getApplicantCollection(String applicantId);
	public List<ApplicantCollections> getApplicantCollections(int applicantId);
	public List<Property> getApplicantProperties(String applicantId);
	public List<Properties> getApplicantProperties(int applicantId);
	public List<Mortgages> getApplicantMortgagesProperties(int applicantId);
	public List<ApplicantAsset> getApplicantAssets(int applicantId);
}
