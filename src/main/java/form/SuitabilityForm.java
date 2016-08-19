package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Notification.Type;

public class SuitabilityForm  extends GridLayout{
	
	private Label job5YearsLabel = new Label("Job-5 Years:");
	private NativeSelect job5Years = new NativeSelect();
	
	private Label lifeStyleChangeLabel = new Label("LifeStyle Change:");
	private NativeSelect lifeStyleChange = new NativeSelect();
	
	private Label incomeDecreasedWorriedLabel = new Label("Income Decreased-Worried:");
	private NativeSelect incomeDecreasedWorried = new NativeSelect();
	
	
	private Label financialRiskTakerLabel = new Label("Financial Risk Taker:");
	private NativeSelect financialRiskTaker = new NativeSelect();
	
	private Label futureFamilyLabel = new Label("Future Family:");
	private NativeSelect futureFamily = new NativeSelect();
	
	private Label propertyLessThan5YearsLabel = new Label("Property < 5 Years:");
	private NativeSelect propertyLessThan5Years = new NativeSelect();
	
	private Label buyNewVehicleLabel = new Label("Buy New Vehicle:");
	private NativeSelect buyNewVehicle = new NativeSelect();
	
	public SuitabilityForm(){
	super(4, 6);
	setSpacing(true);
	
	
	job5Years.addItem("Strongly Disagree");
	job5Years.addItem("Somewhat Disagree");	        
	job5Years.addItem("Not Sure");
	job5Years.addItem("Somewhat Agree");
	job5Years.addItem("Strongly Agree");
	job5Years.addItem("Choose not to Answer");
	job5Years.setNullSelectionAllowed(false);
	job5Years.setValue(2);
	job5Years.setImmediate(true);
	job5Years.addValueChangeListener(e -> Notification.show("Value changed:",
                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
	addComponent(job5YearsLabel);
	addComponent(job5Years);
	
	//1)Strongly Disagree,2)Somewhat Disagree,3)Not Sure,4)Somewhat Agree,5)Strongly Agree,6)Choose not to Answer
	lifeStyleChange.addItem("Strongly Disagree");
	lifeStyleChange.addItem("Somewhat Disagree");	        
	lifeStyleChange.addItem("Not Sure");
	lifeStyleChange.addItem("Somewhat Agree");
	lifeStyleChange.addItem("Strongly Agree");
	lifeStyleChange.addItem("Choose not to Answer");
	lifeStyleChange.setNullSelectionAllowed(false);
	lifeStyleChange.setValue(2);
	lifeStyleChange.setImmediate(true);
        
	lifeStyleChange.addValueChangeListener(e -> Notification.show("Value changed:",
                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
	addComponent(lifeStyleChangeLabel);
	addComponent(lifeStyleChange);
	
	//1)Strongly Disagree,2)Somewhat Disagree,3)Not Sure,4)Somewhat Agree,5)Strongly Agree,6)Choose not to Answer
	incomeDecreasedWorried.addItem("Strongly Disagree");
	incomeDecreasedWorried.addItem("Somewhat Disagree");	        
	incomeDecreasedWorried.addItem("Not Sure");
	incomeDecreasedWorried.addItem("Somewhat Agree");
	incomeDecreasedWorried.addItem("Strongly Agree");
	incomeDecreasedWorried.addItem("Choose not to Answer");
	incomeDecreasedWorried.setNullSelectionAllowed(false);
	incomeDecreasedWorried.setValue(2);
	incomeDecreasedWorried.setImmediate(true);
	incomeDecreasedWorried.addValueChangeListener(e -> Notification.show("Value changed:",
                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
	addComponent(incomeDecreasedWorriedLabel);
	addComponent(incomeDecreasedWorried);
	
	
	financialRiskTaker.addItem("Strongly Disagree");
	financialRiskTaker.addItem("Somewhat Disagree");	        
	financialRiskTaker.addItem("Not Sure");
	financialRiskTaker.addItem("Somewhat Agree");
	financialRiskTaker.addItem("Strongly Agree");
	financialRiskTaker.addItem("Choose not to Answer");
	financialRiskTaker.setNullSelectionAllowed(false);
	financialRiskTaker.setValue(2);
	financialRiskTaker.setImmediate(true);
	financialRiskTaker.addValueChangeListener(e -> Notification.show("Value changed:",
                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
	addComponent(financialRiskTakerLabel);
	addComponent(financialRiskTaker);
	
	futureFamily.addItem("Strongly Disagree");
	futureFamily.addItem("Somewhat Disagree");	        
	futureFamily.addItem("Not Sure");
	futureFamily.addItem("Somewhat Agree");
	futureFamily.addItem("Strongly Agree");
	futureFamily.addItem("Choose not to Answer");
	futureFamily.setNullSelectionAllowed(false);
	futureFamily.setValue(2);
	futureFamily.setImmediate(true);
        
	futureFamily.addValueChangeListener(e -> Notification.show("Value changed:",
                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
	addComponent(futureFamilyLabel);
	addComponent(futureFamily);
	
	
	propertyLessThan5Years.addItem("Strongly Disagree");
	propertyLessThan5Years.addItem("Somewhat Disagree");	        
	propertyLessThan5Years.addItem("Not Sure");
	propertyLessThan5Years.addItem("Somewhat Agree");
	propertyLessThan5Years.addItem("Strongly Agree");
	propertyLessThan5Years.addItem("Choose not to Answer");

	propertyLessThan5Years.setNullSelectionAllowed(false);
	propertyLessThan5Years.setValue(2);
	propertyLessThan5Years.setImmediate(true);
	propertyLessThan5Years.addValueChangeListener(e -> Notification.show("Value changed:",
                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
	addComponent(propertyLessThan5YearsLabel);
	addComponent(propertyLessThan5Years);
	
	buyNewVehicle.addItem("Strongly Disagree");
	buyNewVehicle.addItem("Somewhat Disagree");	        
	buyNewVehicle.addItem("Not Sure");
	buyNewVehicle.addItem("Somewhat Agree");
	buyNewVehicle.addItem("Strongly Agree");
	buyNewVehicle.addItem("Choose not to Answer");
	buyNewVehicle.setNullSelectionAllowed(false);
	buyNewVehicle.setValue(2);
	buyNewVehicle.setImmediate(true);
	buyNewVehicle.addValueChangeListener(e -> Notification.show("Value changed:",
                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
	addComponent(buyNewVehicleLabel);
	addComponent(buyNewVehicle);
}
}
