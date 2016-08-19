package form;

import com.vaadin.ui.CheckBox;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

public class AdditionalDealConsiderationsForm extends GridLayout {
	
	private Label isCountryResidentialLabel = new Label("is Country Residential:");
	final CheckBox isCountryResidential = new CheckBox();

	private Label isConstructionMortgageLabel = new Label("Is Construction Mortgage:");
	final CheckBox isConstructionMortgage = new CheckBox();
	
	private Label isCondoLabel = new Label("Is Condo:");
	final CheckBox isCondo = new CheckBox();
	
	private Label isLifeLeasedPropertyLabel = new Label("Is Life Leased Property:");
	final CheckBox isLifeLeasedProperty = new CheckBox();

	private Label isAgriculturalLessThan10AcresLabel = new Label("Is Agricultural < 10 Acres:");
	final CheckBox isAgriculturalLessThan10Acres = new CheckBox();
	
	private Label isLeasedLandLabel = new Label("Is Leased Land:");
	final CheckBox isLeasedLand = new CheckBox();
	
	private Label isAgriculturalLabel = new Label("Is Agricultural:");
	final CheckBox isAgricultural = new CheckBox();
	
	private Label  isRawLandLabel = new Label("Is Raw Land:");
	final CheckBox  isRawLand = new CheckBox();
	
	private Label isCommercialLabel = new Label("Is Commercial:");
	final CheckBox isCommercial = new CheckBox();
	
	private Label isMobileHomesLabel = new Label("Is Mobile Homes:");
	final CheckBox isMobileHomes = new CheckBox();

	private Label isFractionalInterestsLabel = new Label("is Country Residential:");
	final CheckBox isFractionalInterests = new CheckBox();
	
	private Label isModularHomesLabel = new Label("Is Fractional Interests:");
	final CheckBox isModularHomes = new CheckBox();
	
	private Label isCoOperativeHousingLabel = new Label("Is Co-Operative Housing:");
	final CheckBox isCoOperativeHousing = new CheckBox();
	
	private Label isFloatingHomesLabel = new Label("Is Floating Homes:");
	final CheckBox isFloatingHomes = new CheckBox();
	
	private Label isGrowOpsLabel = new Label("Is Grow Ops:");
	final CheckBox isGrowOps = new CheckBox();
	
	private Label isBoardingHousesLabel = new Label("Is Boarding Houses:");
	final CheckBox isBoardingHouses = new CheckBox();
	
	private Label isRentalPoolsLabel = new Label("Is Rental Pools:");
	final CheckBox isRentalPools = new CheckBox();
	
	private Label isRoomingHousesLabel = new Label("Is Rooming Houses:");
	final CheckBox isRoomingHouses = new CheckBox();
	
	private Label isAgeRestrictedLabel = new Label("Is Age Restricted:");
	final CheckBox isAgeRestricted = new CheckBox();
	
	
	private Label isNonConvConstructionLabel = new Label("Is Non-Conv Construction:");
	final CheckBox isNonConvConstruction = new CheckBox();

	private Label isDuplexLabel = new Label("Is Duplex:");
	final CheckBox isDuplex = new CheckBox();
	
	private Label isCottageOrRecPropertyLabel = new Label("Is Cottage/Rec Property:");
	final CheckBox isCottageOrRecProperty = new CheckBox();

	private Label isFourPlexLabel = new Label("Is Four-Plex:");
	final CheckBox isFourPlex = new CheckBox();
	
	private Label isRentalPropertyLabel = new Label("Is Rental Propertyl:");
	final CheckBox isRentalProperty = new CheckBox();
	
	private Label isSixPlexLabel = new Label("Is Six-Plex:");
	final CheckBox isSixPlex = new CheckBox();

	private Label isHighRatio2ndHomeLabel = new Label("Is High Ratio 2nd Home:");
	final CheckBox isHighRatio2ndHome = new CheckBox();
	
	private Label isEightPlexLabel = new Label("Is Eight-Plex");
	final CheckBox isEightPlex = new CheckBox();
	
	private Label isUninsuredConv2ndHomeLabel = new Label("Is Uninsured Conv 2nd Home:");
	final CheckBox isUninsuredConv2ndHome = new CheckBox();

	private Label isASmallCentreLabel = new Label("Is A Small Centre:");
	final CheckBox isASmallCentre = new CheckBox();

	private Label isMilitaryLabel = new Label("Is Military:");
	final CheckBox isMilitary = new CheckBox();
	
	

	
	public AdditionalDealConsiderationsForm() {
		super(4, 15);
		setSpacing(true);
		addComponent(isCountryResidentialLabel);
		addComponent(isCountryResidential);
		
		addComponent(isConstructionMortgageLabel);
		addComponent(isConstructionMortgage);
		
		addComponent(isCondoLabel);
		addComponent(isCondo);
		
		addComponent(isLifeLeasedPropertyLabel);
		addComponent(isLifeLeasedProperty);

		addComponent(isAgriculturalLessThan10AcresLabel);
		addComponent(isAgriculturalLessThan10Acres);
		
		addComponent(isLeasedLandLabel);
		addComponent(isLeasedLand);
		
		addComponent(isAgriculturalLabel);
		addComponent(isAgricultural);
		
		addComponent(isRawLandLabel);
		addComponent(isRawLand);
		
		addComponent(isCommercialLabel);
		addComponent(isCommercial);
		
		addComponent(isMobileHomesLabel);
		addComponent(isMobileHomes);

		addComponent(isFractionalInterestsLabel);
		addComponent(isFractionalInterests);
		
		addComponent(isModularHomesLabel);
		addComponent( isModularHomes);
		
		addComponent(isCoOperativeHousingLabel);
		addComponent( isCoOperativeHousing);
		
		addComponent(isFloatingHomesLabel);
		addComponent( isFloatingHomes);
		
		addComponent(isGrowOpsLabel);
		addComponent( isGrowOps);
		
		addComponent(isBoardingHousesLabel);
		addComponent( isBoardingHouses);
		
		addComponent(isRentalPoolsLabel);
		addComponent( isRentalPools);
		
		addComponent(isRoomingHousesLabel);
		addComponent( isRoomingHouses);
		
		addComponent(isAgeRestrictedLabel);
		addComponent( isAgeRestricted);
		
		
		addComponent(isNonConvConstructionLabel);
		addComponent( isNonConvConstruction);

		addComponent(isDuplexLabel);
		addComponent( isDuplex);
		
		addComponent(isCottageOrRecPropertyLabel);
		addComponent( isCottageOrRecProperty);

		addComponent(isFourPlexLabel);
		addComponent( isFourPlex);
		
		addComponent(isRentalPropertyLabel);
		addComponent( isRentalProperty);
		
		addComponent(isSixPlexLabel);
		addComponent( isSixPlex);

		addComponent(isHighRatio2ndHomeLabel);
		addComponent( isHighRatio2ndHome);
		
		addComponent(isEightPlexLabel);
		addComponent( isEightPlex);
		
		addComponent(isUninsuredConv2ndHomeLabel);
		addComponent( isUninsuredConv2ndHome);

		addComponent(isASmallCentreLabel);
		addComponent( isASmallCentre);

		addComponent(isMilitaryLabel);
		addComponent( isMilitary);
		
	}
}
