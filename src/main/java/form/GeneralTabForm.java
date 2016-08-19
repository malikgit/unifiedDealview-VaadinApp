package form;

import model.Applicant;
import model.DealInfo;
import model.Downpayment;
import model.Information;
import model.Opportunity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import postgresdao.PostgresDAOI;
import postgresdao.factory.DAOFactory;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class GeneralTabForm extends CssLayout{
	private static final Logger LOGGER = LoggerFactory.getLogger(GeneralTabForm.class);
	private PostgresDAOI pdaoi=DAOFactory.getPostgresDAO();
	
	public GeneralTabForm(Opportunity opportunity) {
//		opportunityId="3584";
		setInformationTabForm(opportunity);
		setApplicantsTabForm(opportunity);
		setDealInfoTabForm(opportunity);
		setDownPaymentTabForm(opportunity);
	}

	private void setInformationTabForm(Opportunity opportunity) {
		
		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Information ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		InformationForm infoForm = new InformationForm();
		infoForm.setMargin(true);
		infoForm.setSpacing(true);
		infoForm.setStyleName("loppp");
		
		Information information =new Information();
		/*Opportunity opportunity = null;
		try{
			opportunity = pdaoi.getOpportunityDetails(opportunityId);
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}*/
		
		information.setOpportunityName(opportunity.getName());
		information.setReferralSource(opportunity.getReferred_source());
		information.setApplication(opportunity.getApplication_no());
//		information.setReferralSourceEmail(opportunity.getref);
		information.setProposal(opportunity.getProperty_type());
//		information.setReferralSourcePhone(opportunity.getRef);
//		information.setBypassProposal(opportunity.getb)
		information.setCompany(opportunity.getCompany_id());
//		information.setTeam(opportunity.getT);
		information.setRealtor(opportunity.getRealtor()+"");
//		information.setBdo(opportunity.getBdo());
		information.setLawyer(opportunity.getLawyer());
		
		FieldGroup binder = new FieldGroup();
		binder.setReadOnly(true);
		BeanItem<Information> item = new BeanItem<Information>(information);
		binder.setItemDataSource(item);
		binder.bindMemberFields(infoForm);
		verticallayut.addComponent(infoForm);
		verticallayut.setComponentAlignment(infoForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
		
	}
	//ApplicantsTabForm
	private void setApplicantsTabForm(Opportunity opportunity) {
		
		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Applicants ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		
		ApplicantsForm applicantForm = new ApplicantsForm();
		applicantForm.setMargin(true);
		applicantForm.setSpacing(true);
		applicantForm.setStyleName("loppp");
		
		Applicant applicant =new Applicant();
		/*Opportunity opportunity = null;
		try{
			opportunity = pdaoi.getOpportunityDetails(opportunityId);
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}*/
		
//		applicant.setApplicant_name(opportunity.get
		//List<Applicant> 
//		applicant.setApplicant_last_name(opportunity.getApplicant_last_name());
		

		FieldGroup binder = new FieldGroup();
		binder.setReadOnly(true);
		BeanItem<Applicant> item = new BeanItem<Applicant>(applicant);
		binder.setItemDataSource(item);
		binder.bindMemberFields(applicantForm);
		verticallayut.addComponent(applicantForm);
		verticallayut.setComponentAlignment(applicantForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
		
	}//End of Applicants
	//DealInfoForm
	private void setDealInfoTabForm(Opportunity opportunity) {

		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Deal Info ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		
		DealInfoForm dealInfoForm = new DealInfoForm();
		dealInfoForm.setMargin(true);
		dealInfoForm.setSpacing(true);
		dealInfoForm.setStyleName("loppp");
		
		DealInfo dealInfo =new DealInfo();
		/*Opportunity opportunity = null;
		try{
			opportunity = pdaoi.getOpportunityDetails(opportunityId);
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}*/
		LOGGER.debug("\n >>Lender_name<<< "+opportunity.getLender_name()+"\n"+"Property_value "+opportunity.getProperty_value()+
				"\n Looking_for "+opportunity.getLooking_fora()+"\n"+opportunity.getDesired_mortgage_amount()+"\n Desired_mortgage_type"+opportunity.getDesired_mortgage_type()
				+"\n Desired_amortization "+opportunity.getDesired_amortization()+"\n Desired_term"+opportunity.getDesired_term()+"\n Condition_of_financing_date "+
				opportunity.getCondition_of_financing_date()+"\n Expected_closing_date"+opportunity.getExpected_closing_date());

		if(opportunity.getLender_name() != null && opportunity.getLender_name().equalsIgnoreCase("1"))
		dealInfo.setLeadingGoal("Pre-Approved");
		else if(opportunity.getLender_name() != null && opportunity.getLender_name().equalsIgnoreCase("2"))
			dealInfo.setLeadingGoal("Approved");
		else if(opportunity.getLender_name() != null && opportunity.getLender_name().equalsIgnoreCase("3"))
			dealInfo.setLeadingGoal("Refinance");
		
		dealInfo.setPropertyValue(opportunity.getProperty_value());
		
		dealInfo.setLookingFor(compareLookingFor(opportunity.getLooking_fora()));
		dealInfo.setDesiredMortgageAmount(opportunity.getDesired_mortgage_amount());
		dealInfo.setDesiredMortgageType(compareDesireMortGType(opportunity.getDesired_mortgage_type()));
		dealInfo.setDesiredAmortization(opportunity.getDesired_amortization());

		dealInfo.setDesiredTerm(compareDesiredTerm(opportunity.getDesired_term()));
		dealInfo.setCofDate(opportunity.getCondition_of_financing_date());
		dealInfo.setExpClosingDate(opportunity.getExpected_closing_date());
		
//		applicant.setApplicant_name(opportunity.get
		//List<Applicant> 
//		applicant.setApplicant_last_name(opportunity.getApplicant_last_name());
		FieldGroup binder = new FieldGroup();
		//binder.setReadOnly(true);
		BeanItem<DealInfo> item = new BeanItem<DealInfo>(dealInfo);
		binder.setItemDataSource(item);
		binder.bindMemberFields(dealInfoForm);
		verticallayut.addComponent(dealInfoForm);
		verticallayut.setComponentAlignment(dealInfoForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
	}//End of DealInfoForm
	
	//DownPaymentTabForm
	private void setDownPaymentTabForm(Opportunity opportunity) {


		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Down Payment ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		
		DownPaymentForm downPaymentForm = new DownPaymentForm();
		downPaymentForm.setMargin(true);
		downPaymentForm.setSpacing(true);
		downPaymentForm.setStyleName("loppp");
		
		Downpayment downPayment =new Downpayment();
		/*Opportunity opportunity = null;
		try{
			opportunity = pdaoi.getOpportunityDetails(opportunityId);
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}*/
		 
		downPayment.setDownPaymentAmount(opportunity.getDown_payment_amount());
		downPayment.setBorrowed(opportunity.getBorrowed_amount());
		downPayment.setDownPaymentComingFrom(compareDownPaymentCommingFrom(opportunity.getDown_payment_coming_from()));
		
		if(opportunity.getSource_of_borrowing() != null && opportunity.getSource_of_borrowing().equalsIgnoreCase("1"))
		downPayment.setSourceOfBorrowing("Secured LOC");
		else if(opportunity.getSource_of_borrowing() != null && opportunity.getSource_of_borrowing().equalsIgnoreCase("2"))
			downPayment.setSourceOfBorrowing("Other");
		else
			downPayment.setSourceOfBorrowing(" ");
		
		//HARDCODING CHANGEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
		downPayment.setBankAcChequingSaving(null);
		downPayment.setSaleOfExisting(opportunity.getSale_of_existing_amount());
		downPayment.setPersonalCash(opportunity.getPersonal_cash_amount());
		downPayment.setSweatEquity(opportunity.getSweat_equity_amount());
		downPayment.setRrsp(opportunity.getRrsp_amount());
		downPayment.setSecondaryFinancing(opportunity.getSecondary_financing_amount());
		downPayment.setGifted(opportunity.getGifted_amount());
		downPayment.setOtherVendorTakeBack(opportunity.getOther_amount());
		downPayment.setExistingEquity(opportunity.getExisting_equity_amount());
		
		FieldGroup binder = new FieldGroup();
		//binder.setReadOnly(true);
		BeanItem<Downpayment> item = new BeanItem<Downpayment>(downPayment);
		binder.setItemDataSource(item);
		binder.bindMemberFields(downPaymentForm);
		verticallayut.addComponent(downPaymentForm);
		verticallayut.setComponentAlignment(downPaymentForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
	}//End of DownPayment

	private String compareLookingFor(String compareValue){
		if (compareValue != null && compareValue.equalsIgnoreCase("1"))
			return "Condo/Mobile Home";
		else if (compareValue != null && compareValue.equalsIgnoreCase("2"))
			return "House/Townhouse/Duplex/Acreage";
		else if (compareValue != null && compareValue.equalsIgnoreCase("5"))
			return "Second Home/Vacation Property";
		else if (compareValue != null && compareValue.equalsIgnoreCase("7"))
			return "Cottage Property";
		else if (compareValue != null && compareValue.equalsIgnoreCase("3"))
			return "Rental Property";
		else if (compareValue != null && compareValue.equalsIgnoreCase("4"))
			return "Raw Land/Leased Land";
		else if (compareValue != null && compareValue.equalsIgnoreCase("6"))
			return "Not Sure";
		else
			return " ";
		
	}
	private String compareDesireMortGType(String compareValue){
		if (compareValue != null && compareValue.equalsIgnoreCase("0"))
			return "LOC";
		else if (compareValue != null && compareValue.equalsIgnoreCase("2"))
			return "Variable";
		else if (compareValue != null && compareValue.equalsIgnoreCase("1"))
			return "Fixed";
		else if (compareValue != null && compareValue.equalsIgnoreCase("3"))
			return "Cashback";
		else if (compareValue != null && compareValue.equalsIgnoreCase("5"))
			return "Combined";
		else if (compareValue != null && compareValue.equalsIgnoreCase("4"))
			return "Recommend";
		else
			return " ";
	}
	private String compareDesiredTerm(String compValue) {
		if (compValue != null && compValue.equalsIgnoreCase("1"))
			return "My Best Option";
		else if (compValue != null && compValue.equalsIgnoreCase("2"))
			return "6 Months";
		else if (compValue != null && compValue.equalsIgnoreCase("3"))
			return "1 Year";
		else if (compValue != null && compValue.equalsIgnoreCase("4"))
			return "2 Years";
		else if (compValue != null && compValue.equalsIgnoreCase("5"))
			return "3 Years";
		else if (compValue != null && compValue.equalsIgnoreCase("6"))
			return "4 Years";
		else if (compValue != null && compValue.equalsIgnoreCase("7"))
			return "5 Years";
		else if (compValue != null && compValue.equalsIgnoreCase("8"))
			return "7 Years";
		else if (compValue != null && compValue.equalsIgnoreCase("9"))
			return "10 Years";
		else
			return " ";
	}
	
	private String compareDownPaymentCommingFrom(String compValue) {
		if (compValue != null && compValue.equalsIgnoreCase("1"))
			return "Bank Account Chequing/Savings";
		else if (compValue != null && compValue.equalsIgnoreCase("2"))
			return "RRSPs or Investments";
		else if (compValue != null && compValue.equalsIgnoreCase("3"))
			return "Borrowed(e.g LOC)";
		else if (compValue != null && compValue.equalsIgnoreCase("4"))
			return "Sale of Asset/Sale of Existing Property";
		else if (compValue != null && compValue.equalsIgnoreCase("5"))
			return "Gift";
		else if (compValue != null && compValue.equalsIgnoreCase("6"))
			return "Other";
		else
			return " ";
	}
}





