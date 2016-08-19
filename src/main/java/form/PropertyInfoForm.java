package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Notification.Type;

public class PropertyInfoForm extends GridLayout{
		private Label propertyStyleLabel = new Label("Property Style:");
		private NativeSelect propertyStyle = new NativeSelect();
		
		private Label ageLabel = new Label("Age:");
		private TextField age = new TextField();
		
		private Label propertyTypeLabel = new Label("Property Type:");
		private NativeSelect propertyType = new NativeSelect();
		
		private Label heatingLabel = new Label("Heating:");
		private NativeSelect heating = new NativeSelect();
		
		private Label apartmentStyleLabel = new Label("Apartment Style:");
		private NativeSelect apartmentStyle = new NativeSelect();
		
		private Label waterLabel = new Label("Water:");
		private NativeSelect water = new NativeSelect();
		
		private Label squareFootageLabel = new Label("squareFootage:");
		private TextField squareFootage = new TextField();
		
		private Label sewageLabel = new Label("Sewage:");
		private NativeSelect sewage = new NativeSelect();

		private Label propertyTaxesLabel = new Label("Property Taxes:");
		private TextField propertyTaxes = new TextField();
		
		private Label ofAcresLabel = new Label("# of Acres:");
		private TextField ofAcres = new TextField();
		
		private Label condoFeesLabel = new Label("Condo Fees:");
		private TextField condoFees = new TextField();
		
		private Label lotSizeLabel = new Label("lot Size:");
		private TextField lotSize = new TextField();
		
		private Label livingInPropertyLabel = new Label("Living In Property:");
		private NativeSelect livingInProperty = new NativeSelect();
		
		private Label garageTypeLabel = new Label("Garage Type:");
		private NativeSelect garageType = new NativeSelect();
		
		private Label renterPayHeatingLabel = new Label("Renter Pay Heating:");
		private NativeSelect renterPayHeating = new NativeSelect();
		
		private Label garazeSizeLabel = new Label("Garaze Size:");
		private NativeSelect garazeSize = new NativeSelect();
		
		private Label monthlyRentalIncomeLabel = new Label("Monthly Rental Income:");
		private TextField monthlyRentalIncome = new TextField();
		
		private Label outbuildingsValueLabel = new Label("outbuildings Value:");
		private TextField outbuildingsValue = new TextField();
		
				public PropertyInfoForm() {
					super(4, 9);
					setSpacing(true);
					
					addComponent(propertyStyleLabel);
					propertyStyle.addItem("Bungalow/One Story");
					propertyStyle.addItem("BiLevel");	        
					propertyStyle.addItem("Two Story");
					propertyStyle.addItem("Split Level");
					propertyStyle.addItem("Story and A Half");
					propertyStyle.addItem("Three Story");
					propertyStyle.addItem("Other");
					propertyStyle.setNullSelectionAllowed(false);
					propertyStyle.setValue(2);
					propertyStyle.setImmediate(true);
					propertyStyle.addValueChangeListener(e -> Notification.show("Value changed:",
				                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
					addComponent(propertyStyle);
					addComponent(ageLabel);
					addComponent(age);
					addComponent(propertyTypeLabel);

					propertyType.addItem("House");
					propertyType.addItem("Duplex");
					propertyType.addItem("Four Plex");
					propertyType.addItem("Apartment Style Condo");
					propertyType.addItem("Town house/Raw house");
					propertyType.addItem("Mobile Home/Modular Home");
					propertyType.addItem("Other");
					propertyType.setNullSelectionAllowed(false);
					propertyType.setValue(2);
					propertyType.setImmediate(true);
					propertyType.addValueChangeListener(e -> Notification.show("Value changed:",
				                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
					addComponent(propertyType);
					
					addComponent(heatingLabel);
					heating.addItem("Furnace/Forced Air");
					heating.addItem("Electric Base board");
					heating.addItem("Hot Water Baseboard In Floor Heating");
					heating.addItem("Other");
					heating.setNullSelectionAllowed(false);
					heating.setValue(2);
					heating.setImmediate(true);
					heating.addValueChangeListener(e -> Notification.show("Value changed:",
				                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
					addComponent(heating);
					
					addComponent(apartmentStyleLabel);

					apartmentStyle.addItem("LowRise");
					apartmentStyle.addItem("HighRise");
					apartmentStyle.setNullSelectionAllowed(false);
					apartmentStyle.setValue(2);
					apartmentStyle.setImmediate(true);
					apartmentStyle.addValueChangeListener(e -> Notification.show("Value changed:",
				                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
					addComponent(apartmentStyle);
					
					addComponent(waterLabel);
					water.addItem("Municipality");
					water.addItem("Well");
					water.addItem("Other");
					water.setNullSelectionAllowed(false);
					water.setValue(2);
					water.setImmediate(true);
					water.addValueChangeListener(e -> Notification.show("Value changed:",
				                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
					addComponent(water);
					addComponent(squareFootageLabel);
					addComponent(squareFootage);
					addComponent(sewageLabel);

					sewage.addItem("Municipality");
					sewage.addItem("Septic System");
					sewage.addItem("Holding Tank");
					sewage.addItem("Other");
					sewage.setNullSelectionAllowed(false);
					sewage.setValue(2);
					sewage.setImmediate(true);
					sewage.addValueChangeListener(e -> Notification.show("Value changed:",
				                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
					addComponent(sewage);
					addComponent(propertyTaxesLabel);
					addComponent(propertyTaxes);
					addComponent(ofAcresLabel);
					addComponent(ofAcres);
					addComponent(condoFeesLabel);
					addComponent(condoFees);
					addComponent(lotSizeLabel);
					addComponent(lotSize);
					addComponent(livingInPropertyLabel);
					
					livingInProperty.addItem("Owner (Self)");
					livingInProperty.addItem("Renter");
					livingInProperty.addItem("Owner and Renter");
					livingInProperty.addItem("Second Home/Vacation property");
					livingInProperty.setNullSelectionAllowed(false);
					livingInProperty.setValue(2);
					livingInProperty.setImmediate(true);
					livingInProperty.addValueChangeListener(e -> Notification.show("Value changed:",
				                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
					addComponent(livingInProperty);
					addComponent(garageTypeLabel);

					garageType.addItem("Attached");
					garageType.addItem("Detached");
					garageType.addItem("None");
					
					garageType.setNullSelectionAllowed(false);
					garageType.setValue(2);
					garageType.setImmediate(true);
					garageType.addValueChangeListener(e -> Notification.show("Value changed:",
				                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
					addComponent(garageType);
					addComponent(renterPayHeatingLabel);

					renterPayHeating.addItem("HeatIncluded");
					renterPayHeating.addItem("HeatSeparate");
					
					renterPayHeating.setNullSelectionAllowed(false);
					renterPayHeating.setValue(2);
					renterPayHeating.setImmediate(true);
					renterPayHeating.addValueChangeListener(e -> Notification.show("Value changed:",
				                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
					addComponent(renterPayHeating);
					addComponent(garazeSizeLabel);

					garazeSize.addItem("Single");
					garazeSize.addItem("Double");
					garazeSize.addItem("Triple");
					garazeSize.addItem("Quadruple");
					
					garazeSize.setNullSelectionAllowed(false);
					garazeSize.setValue(2);
					garazeSize.setImmediate(true);
					garazeSize.addValueChangeListener(e -> Notification.show("Value changed:",
				                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
					addComponent(garazeSize);
					addComponent(monthlyRentalIncomeLabel);
					addComponent(monthlyRentalIncome);
					addComponent(outbuildingsValueLabel);
					addComponent(outbuildingsValue);
				}
}
