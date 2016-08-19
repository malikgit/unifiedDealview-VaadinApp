package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Notification.Type;

public class CurrentSituationForm extends GridLayout{
	private Label currentLenderLabel = new Label("Current Lender:");
	private TextField currentLender = new TextField();
	
	private Label currentInterestRateLabel = new Label("Current Interest:");
	private TextField currentInterestRate = new TextField();
	
	private Label currentMortgageAmountLabel = new Label("Current Mortgage Amount:");
	private TextField currentMortgageAmount = new TextField();
	
	private Label rateLabel = new Label("Rate:");
	private TextField rate = new TextField();
	
	private Label currentMonthlyPaymentLabel = new Label("Current Monthly Payment:");
	private TextField currentMonthlyPayment = new TextField();
	
	private Label currentRenewalDateLabel = new Label("Current Renewal Date:");
	private TextField currentRenewalDate = new TextField();
	
	private Label existingPayoutPenaltyLabel = new Label("Existing Payout Penalty:");
	private TextField existingPayoutPenalty = new TextField();
	
	private Label currentMortgageTypeLabel = new Label("Current Mortgage Type:");
	private TextField currentMortgageType = new TextField();
	
	public CurrentSituationForm() {
		super(4, 4);
		 
		addComponent(currentLenderLabel);
		addComponent(currentLender);
		addComponent(currentInterestRateLabel);
		addComponent(currentInterestRate);
		addComponent(currentMortgageAmountLabel);
		addComponent(currentMortgageAmount);
		addComponent(rateLabel);
		addComponent(rate);
		addComponent(currentMonthlyPaymentLabel);
		addComponent(currentMonthlyPayment);
		addComponent(currentRenewalDateLabel);
		addComponent(currentRenewalDate);
		addComponent(existingPayoutPenaltyLabel);
		addComponent(existingPayoutPenalty);
		addComponent(currentMortgageTypeLabel);
		addComponent(currentMortgageType);
	}
}
