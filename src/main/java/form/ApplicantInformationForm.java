package form;

import com.vaadin.ui.CheckBox;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Notification.Type;

public class ApplicantInformationForm extends GridLayout {
	
	private Label firstNameLabel = new Label("First Name:");
	private TextField firstName = new TextField();

	private Label dobLabel = new Label("Date Of Birth:");
	private TextField dob = new TextField();
	
	private Label lastNameLabel = new Label("Last Name:");
	private TextField lastName = new TextField();
	
	private Label socialInsuranceLabel = new Label("Social Insurance #:");
	private TextField socialInsurance = new TextField();
	
	private Label emailLabel = new Label("Email:");
	private TextField email = new TextField();
	
	private Label passportNonResLabel = new Label("Passport(non-res):");
	private TextField passportNonRes = new TextField();
	
	private Label cellLabel = new Label("Cell:");
	private TextField cell = new TextField();
	
	private Label nonResidentLabel = new Label("Non-Resident:");
//	private TextField nonResident = new TextField();
	final CheckBox nonResident = new CheckBox();
	
	private Label workLabel = new Label("Work:");
	private TextField work = new TextField();
	
	private Label immigrationDateLabel = new Label("Immigration Date:");
	private TextField immigrationDate = new TextField();
	
	private Label homeLabel = new Label("Home:");
	private TextField home = new TextField();
	
	private Label relationshipStatusLabel = new Label("Relationship Status:");
	private NativeSelect relationshipStatus = new NativeSelect();
	
	private Label bestNumberLabel = new Label("Best Number:");
	private NativeSelect bestNumber = new NativeSelect();
	
public ApplicantInformationForm() {
	super(4, 7);
	setSpacing(true);
	
	addComponent(firstNameLabel);
	addComponent(firstName);
	
	addComponent(dobLabel);
	addComponent(dob);
	
	addComponent(lastNameLabel);
	addComponent(lastName);
	
	addComponent(socialInsuranceLabel);
	addComponent(socialInsurance);
	
	addComponent(emailLabel);
	addComponent(email);
	
	addComponent(passportNonResLabel);
	addComponent(passportNonRes);
	
	addComponent(cellLabel);
	addComponent(cell);
	
	addComponent(nonResidentLabel);
	addComponent(nonResident);
	
	addComponent(workLabel);
	addComponent(work);
	
	addComponent(immigrationDateLabel);
	addComponent(immigrationDate);
	
	addComponent(homeLabel);
	addComponent(home);
	
	addComponent(relationshipStatusLabel);
	relationshipStatus.addItem("Single");
	relationshipStatus.addItem("Married");
	relationshipStatus.addItem("Common-Law");	
	relationshipStatus.addItem("Divorced");
	relationshipStatus.addItem("Separated");
	relationshipStatus.addItem("Other");	      
	relationshipStatus.setNullSelectionAllowed(false);
	relationshipStatus.setValue(2);
	relationshipStatus.setImmediate(true);
	relationshipStatus.addValueChangeListener(e -> Notification.show("Value changed:",
               String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
	addComponent(relationshipStatus);
	addComponent(bestNumberLabel);
	bestNumber.addItem("Mobile");
	bestNumber.addItem("Work");
	bestNumber.addItem("Home");	        
	bestNumber.setNullSelectionAllowed(false);
	bestNumber.setValue(2);
	bestNumber.setImmediate(true);
	bestNumber.addValueChangeListener(e -> Notification.show("Value changed:",
               String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
	addComponent(bestNumber);
	
}	
}
