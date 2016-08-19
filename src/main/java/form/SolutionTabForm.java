package form;

import model.DealInfoSolution;
import model.LenderRelated;
import model.Opportunity;
import model.ProductInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class SolutionTabForm extends CssLayout{
	private static final Logger LOGGER = LoggerFactory.getLogger(SolutionTabForm.class);
	//private PostgresDAOI pdaoi=DAOFactory.getPostgresDAO();
	
	public SolutionTabForm(Opportunity opportunity) {
		setLenderRelatedForm(opportunity);
		setDealInfoSolutionForm(opportunity);
		setDealInfoSolutionForm(opportunity);
		setProductInfoForm(opportunity);
	}
	private void setLenderRelatedForm(Opportunity opportunity) {
		LOGGER.info("inside setLenderRelatedForm of SolutiuonTabForm");
		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label parentHeader = new Label(" Solution ");
		parentHeader.addStyleName("h1");
		Label header = new Label(" Lender Related ");
		header.addStyleName("h2");
		verticallayut.addComponent(parentHeader);
		verticallayut.addComponent(header);
		LenderRelatedForm lenderRelatedForm = new LenderRelatedForm();
		lenderRelatedForm.setMargin(true);
		lenderRelatedForm.setSpacing(true);
		lenderRelatedForm.setStyleName("loppp");
		
		LenderRelated lenderRelated = new LenderRelated();
		/*Opportunity opportunity = null;
		try{
			opportunity = pdaoi.getOpportunityDetails(opportunityId);
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}*/
		
//		property.setCurrentLender(opportunity.getCurrent_lender());
		lenderRelated.setLenderName(opportunity.getLender_name());
		
		if(opportunity.getInsurer() != null && opportunity.getInsurer().equalsIgnoreCase("cmhc"))
		lenderRelated.setInsurer("CMHC");
		else if(opportunity.getInsurer() != null && opportunity.getInsurer().equalsIgnoreCase("ge"))
			lenderRelated.setInsurer("GE");
		else if(opportunity.getInsurer() != null && opportunity.getInsurer().equalsIgnoreCase("aig"))
			lenderRelated.setInsurer("AIG");
		else
			lenderRelated.setInsurer(" ");
		
		lenderRelated.setLenderResponse(opportunity.getLender_response());
		lenderRelated.setInsurerRef(opportunity.getInsurerref());
		lenderRelated.setLenderRef(opportunity.getLender_ref());
		lenderRelated.setInsurerFee(opportunity.getInsurerfee());
		lenderRelated.setFilogixRef(opportunity.getMorweb_filogix());
		
		FieldGroup binder = new FieldGroup();
		//binder.setReadOnly(true);
		BeanItem<LenderRelated> item = new BeanItem<LenderRelated>(lenderRelated);
		binder.setItemDataSource(item);
		binder.bindMemberFields(lenderRelatedForm);
		verticallayut.addComponent(lenderRelatedForm);
		verticallayut.setComponentAlignment(lenderRelatedForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
	}
	private void setDealInfoSolutionForm(Opportunity opportunity) {

		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Deal Info ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		DealInfoSolutionForm dealInfoSolutionForm = new DealInfoSolutionForm();
		dealInfoSolutionForm.setMargin(true);
		dealInfoSolutionForm.setSpacing(true);
		dealInfoSolutionForm.setStyleName("loppp");
		
		DealInfoSolution dealInfoSolution = new DealInfoSolution();
		/*Opportunity opportunity = null;
		try{
			opportunity = pdaoi.getOpportunityDetails(opportunityId);
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}*/
		
		dealInfoSolution.setPurchasePrice(opportunity.getPurchase_price());
		dealInfoSolution.setCommitmentFee(opportunity.getCommitment_fee());
		dealInfoSolution.setDownPayment(opportunity.getDownpayment_amount());
		dealInfoSolution.setLenderFee(opportunity.getLender_fee());
		dealInfoSolution.setTotalMortgageAmount(opportunity.getTotal_mortgage_amount());
		dealInfoSolution.setBrokerFees(opportunity.getBroker_fee());
		dealInfoSolution.setClosingDate(opportunity.getClosing_date());
		dealInfoSolution.setTotalOneTimeFees(opportunity.getTotal_one_time_fees());
		dealInfoSolution.setRenewalDate(opportunity.getRenewaldate());
		
		FieldGroup binder = new FieldGroup();
		//binder.setReadOnly(true);
		BeanItem<DealInfoSolution> item = new BeanItem<DealInfoSolution>(dealInfoSolution);
		binder.setItemDataSource(item);
		binder.bindMemberFields(dealInfoSolutionForm);
		verticallayut.addComponent(dealInfoSolutionForm);
		verticallayut.setComponentAlignment(dealInfoSolutionForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
	
	}
	private void setProductInfoForm(Opportunity opportunity) {

		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Product Info");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		ProductInfoForm productInfoForm = new ProductInfoForm();
		productInfoForm.setMargin(true);
		productInfoForm.setSpacing(true);
		productInfoForm.setStyleName("loppp");
		
		ProductInfo productInfo = new ProductInfo();
		/*Opportunity opportunity = null;
		try{
			opportunity = pdaoi.getOpportunityDetails(opportunityId);
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}*/
		
		productInfo.setProductName(opportunity.getProduct_type());
		productInfo.setAmortization(opportunity.getAmortization());
		productInfo.setRateInPercentage(opportunity.getRate());
		productInfo.setPlusMinusPrime(opportunity.getPlus_minus_prime());
		productInfo.setMortgageType(compareMortgageType(opportunity.getMortgage_type()));
		productInfo.setTerm(compareTerm(opportunity.getTerm()));
		if(opportunity.getOpen_closed() != null && opportunity.getOpen_closed().equalsIgnoreCase("open"))
		productInfo.setOpenClosed("Open");
		else if(opportunity.getOpen_closed() != null && opportunity.getOpen_closed().equalsIgnoreCase("closed"))
			productInfo.setOpenClosed("Closed");
		else
			productInfo.setOpenClosed(" ");
		productInfo.setFrequency(compareFrequency(opportunity.getFrequency()));
		productInfo.setPayment(opportunity.getMonthly_payment());
		productInfo.setCashback(opportunity.getCash_back());
		
		FieldGroup binder = new FieldGroup();
		//binder.setReadOnly(true);
		BeanItem<ProductInfo> item = new BeanItem<ProductInfo>(productInfo);
		binder.setItemDataSource(item);
		binder.bindMemberFields(productInfoForm);
		verticallayut.addComponent(productInfoForm);
		verticallayut.setComponentAlignment(productInfoForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
	
	}

	private String compareMortgageType(String compareValue){
		if(compareValue != null && compareValue.equalsIgnoreCase("1"))
		return "LOC";
		else if(compareValue != null && compareValue.equalsIgnoreCase("2"))
			return "Variable";
		else if(compareValue != null && compareValue.equalsIgnoreCase("3"))
			return "Fixed";
		else if(compareValue != null && compareValue.equalsIgnoreCase("4"))
			return "Cashback";
		else if(compareValue != null && compareValue.equalsIgnoreCase("5"))
			return "Combined";
		else
		return " ";
	}
//	//		1=6m,2=1,3=2,4=3,5=4,6=5,7=6,8=7,9=8,10=9,11=10,open=Open
	private String compareTerm(String compareValue){
		if(compareValue != null && compareValue.equalsIgnoreCase("1"))
			return "6 Month";
		else if(compareValue != null && compareValue.equalsIgnoreCase("2"))
			return "1 Year";
		else if(compareValue != null && compareValue.equalsIgnoreCase("3"))
			return "2 Year";
		else if(compareValue != null && compareValue.equalsIgnoreCase("4"))
			return "3 Year";
		else if(compareValue != null && compareValue.equalsIgnoreCase("5"))
			return "4 Year";
		else if(compareValue != null && compareValue.equalsIgnoreCase("6"))
			return "5 Year";
		else if(compareValue != null && compareValue.equalsIgnoreCase("7"))
			return "6 Year";
		else if(compareValue != null && compareValue.equalsIgnoreCase("8"))
			return "7 Year";
		else if(compareValue != null && compareValue.equalsIgnoreCase("9"))
			return "8 Year";
		else if(compareValue != null && compareValue.equalsIgnoreCase("10"))
			return "9 Year";
		else if(compareValue != null && compareValue.equalsIgnoreCase("11"))
			return "10 Year";
		else if(compareValue != null && compareValue.equalsIgnoreCase("open"))
			return "Open";
		return " ";
	}
	
	private String compareFrequency(String compareValue){
		if(compareValue != null && compareValue.equalsIgnoreCase("1"))
			return "Monthly";
		else if(compareValue != null && compareValue.equalsIgnoreCase("2"))
			return "Semi-Monthly";
		else if(compareValue != null && compareValue.equalsIgnoreCase("3"))
			return "Bi-Weekly";
		else if(compareValue != null && compareValue.equalsIgnoreCase("4"))
			return "Weekly";
		else if(compareValue != null && compareValue.equalsIgnoreCase("5"))
			return "Quarterly";
		else if(compareValue != null && compareValue.equalsIgnoreCase("6"))
			return "Annual";
		else
			return " ";
	}
}
