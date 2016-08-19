package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class CreditLiabilitiesForm extends GridLayout{
	
	private Label beacon5StoreLabel = new Label("Beacon5 Store:");
	private TextField beacon5Store = new TextField();
	
	private Label orderlyDebtPaymentLabel = new Label("Orderly Debt Payment:");
	private TextField orderlyDebtPayment = new TextField();
	
	private Label bankruptcyLabel = new Label("Bankruptcy:");
	private TextField bankruptcy = new TextField();
	
	private Label odpDischargeDateLabel = new Label("odpDischargeDate:");
	private TextField odpDischargeDate = new TextField();
	
	private Label bankruptyDischargeLabel = new Label("Bankrupty Discharge:");
	private TextField bankruptyDischarge = new TextField();
	
	private Label monthlySupportPaymentLabel = new Label("Monthly Support Payment:");
	private TextField monthlySupportPayment = new TextField();
	
	public CreditLiabilitiesForm() {
		super(4,3);
		
		addComponent(beacon5StoreLabel);
		addComponent(beacon5Store);
		
		addComponent(orderlyDebtPaymentLabel);
		addComponent(orderlyDebtPayment);
		
		addComponent(bankruptcyLabel);
		addComponent(bankruptcy);
		
		addComponent(odpDischargeDateLabel);
		addComponent(odpDischargeDate);
		
		addComponent(bankruptyDischargeLabel);
		addComponent(bankruptyDischarge);
		
		addComponent(monthlySupportPaymentLabel);
		addComponent(monthlySupportPayment);
	}
}
