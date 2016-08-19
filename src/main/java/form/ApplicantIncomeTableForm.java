package form;

import com.vaadin.ui.Grid;

public class ApplicantIncomeTableForm extends Grid{
	
	public ApplicantIncomeTableForm() {
		setVisible(true);
		setSizeFull();
//		setColumns("type","business","jobTitle","industry","annualIncome","months","historical","supplementary","propertyId");
		setColumns("income_type","business","position","industry","annual_income","month","historical","supplementary","property_id");
	}
}
