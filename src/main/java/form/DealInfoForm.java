package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Notification.Type;

public class DealInfoForm extends GridLayout {
	private Label lendingGoalLabel = new Label("Lending Goal");
//	private TextField leadingGoal = new TextField();
	private NativeSelect leadingGoal = new NativeSelect();
	
	private Label propertyValueLabel = new Label("Property Value");
	private TextField propertyValue = new TextField();

	private Label lookingForLabel = new Label("Looking For");
//	private TextField lookingFor = new TextField();
	private NativeSelect lookingFor = new NativeSelect();

	private Label desiredMortgAmtLabel = new Label("Desired Mortgage Amount");
	private TextField desiredMortgageAmount = new TextField();

	private Label desiredMortgTypeLabel = new Label("Desired Mortgage Type");
//	private TextField desiredMortgageType = new TextField();
	private NativeSelect desiredMortgageType = new NativeSelect();

	private Label desiredAmortLabel = new Label("Desired Amortization");
	private TextField desiredAmortization = new TextField();

	private Label desiredTermLabel = new Label("Desired Term");
//	private TextField desiredTerm = new TextField();
	private NativeSelect desiredTerm = new NativeSelect();

	private Label cofDateLabel = new Label("COF Date");
	private TextField cofDate = new TextField();

	private Label expectedCloseDateLabel = new Label("Expected Close Date");
	private TextField expClosingDate = new TextField();
	
	public DealInfoForm() {
		super(4, 5);
		setSpacing(true);
		
		leadingGoal.addItem("Pre-Approved");
		leadingGoal.addItem("Approved");	        
		leadingGoal.addItem("Refinance");
		leadingGoal.setNullSelectionAllowed(false);
		leadingGoal.setValue(2);
		leadingGoal.setImmediate(true);
	        
		leadingGoal.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		 
		addComponent(lendingGoalLabel);
		addComponent(leadingGoal);
		addComponent(propertyValueLabel);
		addComponent(propertyValue);
		addComponent(lookingForLabel);
		
		lookingFor.addItem("Condo/Mobile Home");
		lookingFor.addItem("House/Townhouse/Duplex/Acreage");	        
		lookingFor.addItem("Second Home/Vacation Property");
		lookingFor.addItem("Cottage Property");
		lookingFor.addItem("Rental Property");
		lookingFor.addItem("Raw Land/Leased Land");
		lookingFor.addItem("Not Sure");
		
		lookingFor.setNullSelectionAllowed(false);
		lookingFor.setValue(2);
		lookingFor.setImmediate(true);
	        
		lookingFor.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		
		addComponent(lookingFor);
		addComponent(desiredMortgAmtLabel);
		addComponent(desiredMortgageAmount);
		addComponent(desiredMortgTypeLabel);
		
		desiredMortgageType.addItem("LOC");
		desiredMortgageType.addItem("Variable");	        
		desiredMortgageType.addItem("Fixed");
		desiredMortgageType.addItem("Cashback");
		desiredMortgageType.addItem("Combined");
		desiredMortgageType.addItem("Recommend");
		desiredMortgageType.setNullSelectionAllowed(false);
		desiredMortgageType.setValue(2);
		desiredMortgageType.setImmediate(true);
		desiredMortgageType.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		
		addComponent(desiredMortgageType);
		addComponent(desiredAmortLabel);
		addComponent(desiredAmortization);
		addComponent(desiredTermLabel);

		desiredTerm.addItem("My Best Option");
		desiredTerm.addItem("6 Months");	        
		desiredTerm.addItem("1 Year");
		desiredTerm.addItem("2 Years");
		desiredTerm.addItem("3 Years");
		desiredTerm.addItem("4 Years");
		desiredTerm.addItem("5 Years");
		desiredTerm.addItem("7  Years");
		desiredTerm.addItem("10 Years");
		
		desiredTerm.setNullSelectionAllowed(false);
		desiredTerm.setValue(2);
		desiredTerm.setImmediate(true);
		desiredTerm.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		
		addComponent(desiredTerm);
		addComponent(cofDateLabel);
		addComponent(cofDate);
		addComponent(expectedCloseDateLabel);
		addComponent(expClosingDate);
	}
	

}
