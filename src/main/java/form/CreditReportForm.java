package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TextArea;

public class CreditReportForm extends GridLayout {
	private TextArea creditReport = new TextArea();
	public CreditReportForm(){
		setSizeFull();
		addComponent(creditReport);
	}
}
