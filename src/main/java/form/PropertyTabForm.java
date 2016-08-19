package form;

import model.AdditionalDealConsiderations;
import model.Opportunity;
import model.Property;
import model.PropertyInfo;

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

public class PropertyTabForm extends CssLayout{
	private static final Logger LOGGER = LoggerFactory.getLogger(PropertyTabForm.class);
	private PostgresDAOI pdaoi=DAOFactory.getPostgresDAO();
	
	public PropertyTabForm(Opportunity opportunity) {
		setPropertyForm(opportunity);
		setPropertyInfoForm(opportunity);
		setAdditionalDealConsiderationsForm(opportunity);
	}
	private void setPropertyForm(Opportunity opportunity) {
		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label parentHeader = new Label(" Property ");
		parentHeader.addStyleName("h1");
		Label header = new Label(" Address ");
		header.addStyleName("h2");
		verticallayut.addComponent(parentHeader);
		verticallayut.addComponent(header);
		PropertyForm propertyForm = new PropertyForm();
		propertyForm.setMargin(true);
		propertyForm.setSpacing(true);
		propertyForm.setStyleName("loppp");
		
		Property property = new Property();
		/*Opportunity opportunity = null;
		try{
			opportunity = pdaoi.getOpportunityDetails(opportunityId);
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}*/
		
//		property.setCurrentLender(opportunity.getCurrent_lender());
		property.setAddress(opportunity.getAddress());
		property.setTownshipOrPid(opportunity.getTownship_PID());
		property.setCity(opportunity.getCity());
		property.setPlan(opportunity.getPlan());
		property.setProvince(opportunity.getProvince());
		property.setBlock(opportunity.getBlock());
		property.setPostalCode(opportunity.getPostal_code());
		property.setLot(opportunity.getLot());
		property.setConsideredCities(opportunity.getMls());
		property.setDistanceToMajorCenter(opportunity.getDistance_to_major_center());
		property.setNewHomeWarranty(compareNewHomeWarrantyValue(opportunity.getNew_home_warranty()));
		
		FieldGroup binder = new FieldGroup();
		//binder.setReadOnly(true);
		BeanItem<Property> item = new BeanItem<Property>(property);
		binder.setItemDataSource(item);
		binder.bindMemberFields(propertyForm);
		verticallayut.addComponent(propertyForm);
		verticallayut.setComponentAlignment(propertyForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
	}
	
	private void setPropertyInfoForm(Opportunity opportunity){

		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Property Info ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		PropertyInfoForm propertyInfoForm = new PropertyInfoForm();
		propertyInfoForm.setMargin(true);
		propertyInfoForm.setSpacing(true);
		propertyInfoForm.setStyleName("loppp");
		
		PropertyInfo propertyInfo = new PropertyInfo();
		/*Opportunity opportunity = null;
		try{
			opportunity = pdaoi.getOpportunityDetails(opportunityId);
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}*/
		
		propertyInfo.setPropertyStyle(comparePropertyStyle(opportunity.getProperty_style()));
		propertyInfo.setAge(opportunity.getAge());
		propertyInfo.setPropertyType(comparePropertyType(opportunity.getProperty_type()));
		propertyInfo.setHeating(compareHeating(opportunity.getHeating()));

		if(opportunity.getApartment_style() != null && opportunity.getApartment_style().equalsIgnoreCase("1"))
		propertyInfo.setApartmentStyle("LowRise");
		else if(opportunity.getApartment_style() != null && opportunity.getApartment_style().equalsIgnoreCase("2"))
			propertyInfo.setApartmentStyle("HighRise");
		else
			propertyInfo.setApartmentStyle(" ");

		if(opportunity.getWater() != null && opportunity.getWater().equalsIgnoreCase("1"))
		propertyInfo.setWater("Municipality");
		if(opportunity.getWater() != null && opportunity.getWater().equalsIgnoreCase("2"))
			propertyInfo.setWater("Well");
		if(opportunity.getWater() != null && opportunity.getWater().equalsIgnoreCase("1"))
			propertyInfo.setWater("Other");
		else 
			propertyInfo.setWater(" ");
		propertyInfo.setSquareFootage(opportunity.getSquare_footage());
		propertyInfo.setSewage(compareSewage(opportunity.getSewage()));
		propertyInfo.setPropertyTaxes(opportunity.getProperty_taxes());
		propertyInfo.setOfAcres(opportunity.getAcres());
		propertyInfo.setCondoFees(opportunity.getCondo_fees());
		propertyInfo.setLotSize(opportunity.getLot_size());
		propertyInfo.setLivingInProperty(compareLivingInProperty(opportunity.getLiving_in_property()));
		propertyInfo.setGarageType(compareGarageType(opportunity.getGarage_type()));

		if(opportunity.getRenter_pay_heating() != null && opportunity.getRenter_pay_heating().equalsIgnoreCase("1"))
		propertyInfo.setRenterPayHeating("HeatIncluded");
		else if(opportunity.getRenter_pay_heating() != null && opportunity.getRenter_pay_heating().equalsIgnoreCase("2"))
			propertyInfo.setRenterPayHeating("HeatSeparate");
		else 
			propertyInfo.setRenterPayHeating(" ");
		
		propertyInfo.setGarazeSize(compareGarageSize(opportunity.getGarage_size()));
		propertyInfo.setMonthlyRentalIncome(opportunity.getMonthly_rental_income());
		propertyInfo.setOutbuildingsValue(opportunity.getOutbuildings_value());
		
		FieldGroup binder = new FieldGroup();
		//binder.setReadOnly(true);
		BeanItem<PropertyInfo> item = new BeanItem<PropertyInfo>(propertyInfo);
		binder.setItemDataSource(item);
		binder.bindMemberFields(propertyInfoForm);
		verticallayut.addComponent(propertyInfoForm);
		verticallayut.setComponentAlignment(propertyInfoForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
	}
	private void setAdditionalDealConsiderationsForm(Opportunity opportunity){

		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label("Additional Deal Considerations");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		AdditionalDealConsiderationsForm additionalDealConsiderationsForm = new AdditionalDealConsiderationsForm();
		additionalDealConsiderationsForm.setMargin(true);
		additionalDealConsiderationsForm.setSpacing(true);
		additionalDealConsiderationsForm.setStyleName("loppp");
		
		AdditionalDealConsiderations additionalDealConsiderations = new AdditionalDealConsiderations();
		/*Opportunity opportunity = null;
		try{
			opportunity = pdaoi.getOpportunityDetails(opportunityId);
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}*/
		additionalDealConsiderations.setIsCountryResidential(opportunity.getIs_country_residential());
		additionalDealConsiderations.setIsConstructionMortgage(opportunity.getIs_construction_mortgage());
		additionalDealConsiderations.setIsCondo(opportunity.getIs_condo());
		additionalDealConsiderations.setIsLifeLeasedProperty(opportunity.getIs_life_leased_property());
		additionalDealConsiderations.setIsAgriculturalLessThan10Acres(opportunity.getIs_agricultural_less_10_acres());
		additionalDealConsiderations.setIsLeasedLand(opportunity.getIs_leased_land());
		additionalDealConsiderations.setIsAgricultural(opportunity.getIs_agricultural());
		additionalDealConsiderations.setIsRawLand(opportunity.getIs_raw_land());
		additionalDealConsiderations.setIsCommercial(opportunity.getIs_commercial());
		additionalDealConsiderations.setIsMobileHomes(opportunity.getIs_mobile_homes());
		additionalDealConsiderations.setIsFractionalInterests(opportunity.getIs_fractional_interests());
		additionalDealConsiderations.setIsModularHomes(opportunity.getIs_modular_homes());
		additionalDealConsiderations.setIsCoOperativeHousing(opportunity.getIs_co_operative_housing());
		additionalDealConsiderations.setIsFloatingHomes(opportunity.getIs_floating_homes());
		additionalDealConsiderations.setIsGrowOps(opportunity.getIs_grow_ops());
		additionalDealConsiderations.setIsBoardingHouses(opportunity.getIs_boarding_houses());
		additionalDealConsiderations.setIsRentalPools(opportunity.getIs_rental_pools());
		additionalDealConsiderations.setIsRoomingHouses(opportunity.getIs_rooming_houses());
		additionalDealConsiderations.setIsAgeRestricted(opportunity.getIs_age_restricted());
		additionalDealConsiderations.setIsNonConvConstruction(opportunity.getIs_non_conv_construction());
		additionalDealConsiderations.setIsDuplex(opportunity.getIs_duplex());
		additionalDealConsiderations.setIsCottageOrRecProperty(opportunity.getIs_cottage_rec_property());
		additionalDealConsiderations.setIsFourPlex(opportunity.getIs_four_plex());
		additionalDealConsiderations.setIsRentalProperty(opportunity.getIs_rental_property());
		additionalDealConsiderations.setIsSixPlex(opportunity.getIs_six_plex());
		additionalDealConsiderations.setIsHighRatio2ndHome(opportunity.getIs_high_ratio_2nd_home());
		additionalDealConsiderations.setIsEightPlex(opportunity.getIs_eight_plex());
		additionalDealConsiderations.setIsUninsuredConv2ndHome(opportunity.getIs_uninsured_conv_2nd_home());
		additionalDealConsiderations.setIsASmallCentre(opportunity.getIs_a_small_centre());
		additionalDealConsiderations.setIsMilitary(opportunity.getIs_military());
		
		FieldGroup binder = new FieldGroup();
		//binder.setReadOnly(true);
		BeanItem<AdditionalDealConsiderations> item = new BeanItem<AdditionalDealConsiderations>(additionalDealConsiderations);
		binder.setItemDataSource(item);
		binder.bindMemberFields(additionalDealConsiderationsForm);
		verticallayut.addComponent(additionalDealConsiderationsForm);
		verticallayut.setComponentAlignment(additionalDealConsiderationsForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
	
	}

	public String comparePropertyStyle(String compareValue){
		if(compareValue != null && compareValue.equalsIgnoreCase("1"))
			return "Bungalow/One";
		else if(compareValue != null && compareValue.equalsIgnoreCase("2"))
			return "BiLevel";
		else if(compareValue != null && compareValue.equalsIgnoreCase("3"))
			return "Two Story";
		else if(compareValue != null && compareValue.equalsIgnoreCase("4"))
			return "Split Level";
		else if(compareValue != null && compareValue.equalsIgnoreCase("5"))
			return "Story and A Half";
		else if(compareValue != null && compareValue.equalsIgnoreCase("6"))
			return "Three Story";
		else if(compareValue != null && compareValue.equalsIgnoreCase("7"))
			return "Other";
		else 
		return " ";
	}
	
	public String comparePropertyType(String compareValue){
		if(compareValue != null && compareValue.equalsIgnoreCase("1"))
			return "House";
		else if(compareValue != null && compareValue.equalsIgnoreCase("2"))
			return "Duplex";
		else if(compareValue != null && compareValue.equalsIgnoreCase("3"))
			return "Four Plex";
		else if(compareValue != null && compareValue.equalsIgnoreCase("4"))
			return "Apartment Style Condo";
		else if(compareValue != null && compareValue.equalsIgnoreCase("5"))
			return "Town house/Raw house";
		else if(compareValue != null && compareValue.equalsIgnoreCase("6"))
			return "Mobile Home/Modular Home";
		else if(compareValue != null && compareValue.equalsIgnoreCase("7"))
			return "Other";
		else 
		return " ";
	}

	public String compareHeating(String compareValue){
		if(compareValue != null && compareValue.equalsIgnoreCase("1"))
			return "Furnace/Forced Air";
		else if(compareValue != null && compareValue.equalsIgnoreCase("2"))
			return "Electric Base board";
		else if(compareValue != null && compareValue.equalsIgnoreCase("3"))
			return "Hot Water Baseboard In Floor Heating";
		else if(compareValue != null && compareValue.equalsIgnoreCase("4"))
			return "Other";
		else 
		return " ";
	}
	public String compareNewHomeWarrantyValue(String compareValue){
		if(compareValue != null && compareValue.equalsIgnoreCase("1"))
		return "Yes";
		else if(compareValue != null && compareValue.equalsIgnoreCase("2"))
			return "No";
		else if(compareValue != null && compareValue.equalsIgnoreCase("3"))
			return "Unsure";
		else 
			return " ";
	}
	public String compareSewage(String compareValue){
		if(compareValue != null && compareValue.equalsIgnoreCase("1"))
			return "Municipality";
		else if(compareValue != null && compareValue.equalsIgnoreCase("2"))
			return "Septic System";
		else if(compareValue != null && compareValue.equalsIgnoreCase("3"))
			return "Holding Tank";
		else if(compareValue != null && compareValue.equalsIgnoreCase("4"))
			return "Other";
		else 
		return " ";
	}

	public String compareLivingInProperty(String compareValue){
		if(compareValue != null && compareValue.equalsIgnoreCase("1"))
			return "Owner (Self)";
		else if(compareValue != null && compareValue.equalsIgnoreCase("2"))
			return "Renter";
		else if(compareValue != null && compareValue.equalsIgnoreCase("3"))
			return "Owner and Renter";
		else if(compareValue != null && compareValue.equalsIgnoreCase("4"))
			return "Second Home/Vacation property";
		else 
		return " ";
	}

	public String compareGarageType(String compareValue){
		if(compareValue != null && compareValue.equalsIgnoreCase("1"))
			return "Attached";
		else if(compareValue != null && compareValue.equalsIgnoreCase("2"))
			return "Detached";
		else if(compareValue != null && compareValue.equalsIgnoreCase("3"))
			return "None";
		else 
		return " ";
	}

	public String compareGarageSize(String compareValue){
		if(compareValue != null && compareValue.equalsIgnoreCase("1"))
			return "Single";
		else if(compareValue != null && compareValue.equalsIgnoreCase("2"))
			return "Double";
		else if(compareValue != null && compareValue.equalsIgnoreCase("3"))
			return "Triple";
		else if(compareValue != null && compareValue.equalsIgnoreCase("4"))
			return "Quadruple";
		else 
		return " ";
	}
}
