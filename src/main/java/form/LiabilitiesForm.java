package form;

import java.util.Date;

import com.vaadin.ui.Grid;

public class LiabilitiesForm extends Grid{
	
	
	
	public LiabilitiesForm() {
		setVisible(true);
		setSizeFull();
		setColumns("name","business","status","credit_limit","credit_balance","monthly_payment","opened","reported","dla","type","rating","pay_off");
		}
}
