package form;

import model.CurrentSituation;
import model.DealConfig;
import model.Opportunity;
import model.Suitability;

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

public class DealConfigurationTabForm extends CssLayout{
	private static final Logger LOGGER = LoggerFactory.getLogger(DealConfigurationTabForm.class);

	private PostgresDAOI pdaoi=DAOFactory.getPostgresDAO();
	
	public DealConfigurationTabForm(Opportunity opportunity) {
		setCurrentSituationTabForm(opportunity);
		setDealConfigTabForm(opportunity);
		setSuitabilityTabForm(opportunity);
	}
	private void setCurrentSituationTabForm(Opportunity opportunity) {
		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label parentHeader = new Label(" Deal Configuration ");
		parentHeader.addStyleName("h1");
		Label header = new Label(" Current Situation ");
		header.addStyleName("h2");
		verticallayut.addComponent(parentHeader);
		verticallayut.addComponent(header);
		CurrentSituationForm infoForm = new CurrentSituationForm();
		infoForm.setMargin(true);
		infoForm.setSpacing(true);
		infoForm.setStyleName("loppp");
		
		CurrentSituation currentSituation =new CurrentSituation();
		/*Opportunity opportunity = null;
		try{
			opportunity = pdaoi.getOpportunityDetails(opportunityId);
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}
		*/
		currentSituation.setCurrentLender(opportunity.getCurrent_lender());
		currentSituation.setCurrentInterestRate(opportunity.getCurrent_interest_rate());
		currentSituation.setCurrentMortgageAmount(opportunity.getCurrent_mortgage_amount());
		currentSituation.setRate(opportunity.getRate());
		currentSituation.setCurrentMonthlyPayment(opportunity.getCurrent_monthly_payment());
		currentSituation.setCurrentRenewalDate(opportunity.getRenewaldate());
		currentSituation.setExistingPayoutPenalty(opportunity.getExisting_payout_penalty());
		currentSituation.setCurrentMortgageType(opportunity.getCurrent_mortgage_type());
		
		FieldGroup binder = new FieldGroup();
		binder.setReadOnly(true);
		BeanItem<CurrentSituation> item = new BeanItem<CurrentSituation>(currentSituation);
		binder.setItemDataSource(item);
		binder.bindMemberFields(infoForm);
		verticallayut.addComponent(infoForm);
		verticallayut.setComponentAlignment(infoForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
		
	
	}
	private void setDealConfigTabForm(Opportunity opportunity) {
		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		
		Label header = new Label(" Deal Configuration ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		DealConfigForm dealConfigForm = new DealConfigForm();
		dealConfigForm.setMargin(true);
		dealConfigForm.setSpacing(true);
		dealConfigForm.setStyleName("loppp");
		
		DealConfig dealConfig =new DealConfig();
		/*Opportunity opportunity = null;
		try{
			opportunity = pdaoi.getOpportunityDetails(opportunityId);
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}*/
		
		dealConfig.setCombinedBaseLTV(opportunity.getLtv());
		dealConfig.setRenovationValue(opportunity.getRenovation_value());
		dealConfig.setChargeOnTitle(opportunity.getCharge_on_title());	//Select option fields
		dealConfig.setBuildingFunds(opportunity.getBuilding_funds());	//Select option fields
		dealConfig.setHasChargesBehind(opportunity.getHas_charges_behind());//check box
		dealConfig.setDrawsRequired(opportunity.getDraws_required());
		dealConfig.setChargesBehindAmount(opportunity.getCharges_behind_amount());
		dealConfig.setLookingTo(opportunity.getLooking_to());	//Select option fields
		//dealConfig.setMaxRefinanceAmnt(opportunity.getM); Not found in Opportunity details
		dealConfig.setNonIncomQualifier(opportunity.getNon_income_qualifer());	//check box
		dealConfig.setLenderRequirInsuran(opportunity.getLender_requires_insurance());
		dealConfig.setNeedsPowerOfAttorney(opportunity.getNeeds_power_attorney());
		
		FieldGroup binder = new FieldGroup();
		binder.setReadOnly(true);
		BeanItem<DealConfig> item = new BeanItem<DealConfig>(dealConfig);
		binder.setItemDataSource(item);
		binder.bindMemberFields(dealConfigForm);
		verticallayut.addComponent(dealConfigForm);
		verticallayut.setComponentAlignment(dealConfigForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
	}
	private void setSuitabilityTabForm(Opportunity opportunity) {

		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		
		Label header = new Label(" Suitability ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		SuitabilityForm suitabilityForm = new SuitabilityForm();
		suitabilityForm.setMargin(true);
		suitabilityForm.setSpacing(true);
		suitabilityForm.setStyleName("loppp");
		
		Suitability suitability =new Suitability();
		/*Opportunity opportunity = null;
		try{
			opportunity = pdaoi.getOpportunityDetails(opportunityId);
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}*/
		suitability.setJob5Years(compareSuitability(opportunity.getJob_5_years()));
		suitability.setLifeStyleChange(compareSuitability(opportunity.getLifestyle_change()));
		suitability.setIncomeDecreasedWorried(compareSuitability(opportunity.getIncome_decreased_worried()));
		suitability.setFinancialRiskTaker(compareSuitability(opportunity.getFinancial_risk_taker()));
		suitability.setFutureFamily(compareSuitability(opportunity.getFuture_family()));
		suitability.setPropertyLessThan5Years(compareSuitability(opportunity.getProperty_less_then_5_years()));
		suitability.setBuyNewVehicle(compareSuitability(opportunity.getBuy_new_vehicle()));
		
		FieldGroup binder = new FieldGroup();
		//binder.setReadOnly(true);
		BeanItem<Suitability> item = new BeanItem<Suitability>(suitability);
		binder.setItemDataSource(item);
		binder.bindMemberFields(suitabilityForm);
		verticallayut.addComponent(suitabilityForm);
		verticallayut.setComponentAlignment(suitabilityForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
	}
	
	public String compareSuitability(String suitableOption){
		if(suitableOption.equalsIgnoreCase("1"))
		return "Strongly Disagree";
		else if(suitableOption.equalsIgnoreCase("2"))
			return "Somewhat Disagree";
		else if(suitableOption.equalsIgnoreCase("3"))
			return "Not Sure";
		else if(suitableOption.equalsIgnoreCase("4"))
			return "Somewhat Agree";
		else if(suitableOption.equalsIgnoreCase("5"))
			return "Strongly Agree";
		else if(suitableOption.equalsIgnoreCase("6"))
			return "Choose not to Answer";
		else
			return " ";
	}
}
