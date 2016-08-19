package form;

import com.vaadin.ui.Grid;

public class PropertiesForm extends Grid {

	public PropertiesForm() {
		setVisible(true);
//		setSizeFull();
		setSizeUndefined();
		setColumns("name", "value", "owed", "annual_tax", "mo_condo_fees",
				"property_id", "selling");
	}
}
