package form;

import java.util.Date;

import com.vaadin.ui.Grid;

public class CollectionsForm extends Grid {
	
	public CollectionsForm() {
		setVisible(true);
		setSizeFull();
		setColumns("name","amount","balance","date","status","pay_off");
		
		}
}
