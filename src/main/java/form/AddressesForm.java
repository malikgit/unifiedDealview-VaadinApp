package form;

import com.google.gwt.user.client.ui.Grid;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class AddressesForm extends GridLayout {
	
	// unit,street,city,province,postalCode,date
	private Label unitLabel = new Label("Unit");
	private Label streetLabel = new Label("Street");
	private Label cityLabel = new Label("City");
	private Label provinceLabel = new Label("Province");
	private Label postalCodeLabel = new Label("Postal Code");
	private Label dateLabel = new Label("Date");

	private TextField unit = new TextField();
	private TextField street = new TextField();
	private TextField city = new TextField();
	private TextField province = new TextField();
	private TextField postalCode = new TextField();
	private TextField date = new TextField();

	private TextField unit2 = new TextField();
	private TextField street2 = new TextField();
	private TextField city2 = new TextField();
	private TextField province2 = new TextField();
	private TextField postalCode2 = new TextField();
	private TextField date2 = new TextField();

	public AddressesForm() {
		//super(6, 7);
		setSpacing(true);

		addComponent(unitLabel);
		addComponent(streetLabel);
		addComponent(cityLabel);
		addComponent(provinceLabel);
		addComponent(postalCodeLabel);
		addComponent(dateLabel);
		
		addComponent(unit);
		addComponent(street);
		addComponent(city);
		addComponent(province);
		addComponent(postalCode);
		addComponent(date);
		
		addComponent(unit2);
		addComponent(street2);
		addComponent(city2);
		addComponent(province2);
		addComponent(postalCode2);
		addComponent(date2);
	}

}
