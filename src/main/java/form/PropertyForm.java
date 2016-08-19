package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Notification.Type;

public class PropertyForm extends GridLayout{
	
	private Label addressLabel = new Label("Address:");
	private TextField address = new TextField();
	
	private Label townshipOrPidLabel = new Label("Township / Pid:");
	private TextField townshipOrPid = new TextField();
	
	private Label cityLabel = new Label("Job-5 Years:");
	private TextField city = new TextField();
	
	private Label provinceLabel = new Label("Province:");
	private TextField province = new TextField();
	
	private Label planLabel = new Label("Plan:");
	private TextField plan = new TextField();
	
	private Label blockLabel = new Label("Block:");
	private TextField block = new TextField();
	
	private Label postalCodeLabel = new Label("PostalCode:");
	private TextField postalCode = new TextField();

	private Label lotLabel = new Label("lot:");
	private TextField lot = new TextField();
	
	private Label consideredCitiesLabel = new Label("Considered Cities:");
	private TextField consideredCities = new TextField();

	private Label distanceToMajorCenterLabel = new Label("Distance To Major Center:");
	private TextField distanceToMajorCenter = new TextField();
	
	private Label newHomeWarrantyLabel = new Label("New Home Warranty:");
	private NativeSelect newHomeWarranty = new NativeSelect();

public PropertyForm() {
	super(4, 5);
	setSpacing(true);
	
	addComponent(addressLabel);
	addComponent(address);
	
	addComponent(townshipOrPidLabel);
	addComponent(townshipOrPid);
	
	addComponent(cityLabel);
	addComponent(city);
	
	addComponent(provinceLabel);
	addComponent(province);
	
	addComponent(planLabel);
	addComponent(plan);
	
	addComponent(blockLabel);
	addComponent(block);
	
	addComponent(postalCodeLabel);
	addComponent(postalCode);
	
	addComponent(lotLabel);
	addComponent(lot);
	
	addComponent(consideredCitiesLabel );	
	addComponent(consideredCities);
	
	addComponent(distanceToMajorCenterLabel);	
	addComponent(distanceToMajorCenter);
	
	addComponent(newHomeWarrantyLabel);
	
	setSpacing(true);

	newHomeWarranty.addItem("Yes");
	newHomeWarranty.addItem("No");	        
	newHomeWarranty.addItem("Unsure");
	newHomeWarranty.setNullSelectionAllowed(false);
	newHomeWarranty.setValue(2);
	newHomeWarranty.setImmediate(true);
	newHomeWarranty.addValueChangeListener(e -> Notification.show("Value changed:",
                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
	 
	addComponent(newHomeWarranty);
	
}
}
