package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.TextField;

public class DealInfoSolutionForm extends GridLayout{
	
	private Label purchasePriceLabel = new Label("Purchase Price:");
	private TextField purchasePrice = new TextField();
//	private NativeSelect purchasePrice = new NativeSelect();
	
	private Label commitmentFeeLabel = new Label("Commitment Fee:");
	private TextField commitmentFee = new TextField();
	
	private Label downPaymentLabel = new Label("DownPayment:");
	private TextField downPayment = new TextField();
	
	private Label lenderFeeLabel = new Label("Lender Fee:");
	private TextField lenderFee = new TextField();
	
	private Label brokerFeesLabel = new Label("Broker Fees:");
	private TextField brokerFees = new TextField();
	
	private Label totalMortgageAmountLabel = new Label("Total Mortgage Amount:");
	private TextField totalMortgageAmount = new TextField();
	
	private Label closingDateLabel = new Label("Closing Date:");
	private TextField closingDate = new TextField();
	
	private Label totalOneTimeFeesLabel = new Label("Total One Time Fees:");
	private TextField totalOneTimeFees = new TextField();
	
	private Label renewalDateLabel = new Label("Renewal Date:");
	private TextField renewalDate = new TextField();
	
	public DealInfoSolutionForm() {
		super(4, 5);
		setSpacing(true);
		
		addComponent(purchasePriceLabel);
		addComponent(purchasePrice);
		
		addComponent(commitmentFeeLabel);
		addComponent(commitmentFee);
		
		addComponent(downPaymentLabel);
		addComponent(downPayment);
		
		addComponent(lenderFeeLabel);
		addComponent(lenderFee);
		
		addComponent(brokerFeesLabel);
		addComponent(brokerFees);
		
		addComponent(totalMortgageAmountLabel);
		addComponent(totalMortgageAmount);
		
		addComponent(closingDateLabel);
		addComponent(closingDate);
		
		addComponent(totalOneTimeFeesLabel);
		addComponent(totalOneTimeFees);
		
		addComponent(renewalDateLabel);
		addComponent(renewalDate);
	}
}
