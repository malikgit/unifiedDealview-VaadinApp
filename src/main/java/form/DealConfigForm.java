package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.TextField;

public class DealConfigForm extends GridLayout{
	
	private Label combinedBaseLTVLabel = new Label("Combined base LTV");
	private TextField combinedBaseLTV = new TextField();
	private Label renovationValueLabel = new Label("Renovation Value");
	private TextField renovationValue = new TextField();
	
	private Label chargeOnTitleLabel = new Label("Charge On Title");
	private NativeSelect chargeOnTitle = new NativeSelect();
	
	private Label buildingFundsLabel = new Label("Building Funds");
	private NativeSelect buildingFunds = new NativeSelect();
	
	private Label hasChargesBehindLabel = new Label("Has Charges Behind");
	private TextField hasChargesBehind = new TextField(); //checkbox
	
	private Label drawsRequiredLabel = new Label("Draws Required");
	private TextField drawsRequired = new TextField();
	private Label chargesBehindAmountLabel = new Label("Charges Behind Amount");
	private TextField chargesBehindAmount = new TextField();
	
	private Label lookingToLabel = new Label("Looking To");
	private NativeSelect lookingTo = new NativeSelect();
	
	private Label maxRefinanceAmntLabel = new Label("Max Refinance Amount");
	private TextField maxRefinanceAmnt = new TextField();
	private Label nonIncomQualifierLabel = new Label("Non Income Qualifier");
	private TextField nonIncomQualifier = new TextField();
	private Label lenderRequirInsuranLabel = new Label("Lender Requires Insurance");
	private TextField lenderRequirInsuran = new TextField();
	private Label needsPowerOfAttorneyLabel = new Label("Needs Power Of Attorney");
	private TextField needsPowerOfAttorney = new TextField();
	
	public DealConfigForm() {
		super(4, 6);
		setSpacing(true);
		
		addComponent(combinedBaseLTVLabel);
		addComponent(combinedBaseLTV);
		addComponent(renovationValueLabel);
		addComponent(renovationValue);
		addComponent(chargeOnTitleLabel);
		addComponent(chargeOnTitle);
		addComponent(buildingFundsLabel);
		addComponent(buildingFunds);
		
		addComponent(hasChargesBehindLabel);
		addComponent(hasChargesBehind);
		addComponent(drawsRequiredLabel);
		addComponent(drawsRequired);
		addComponent(chargesBehindAmountLabel);
		addComponent(chargesBehindAmount);
		addComponent(lookingToLabel);
		addComponent(lookingTo);
		
		addComponent(maxRefinanceAmntLabel);
		addComponent(maxRefinanceAmnt);
		addComponent(nonIncomQualifierLabel);
		addComponent(nonIncomQualifier);
		addComponent(lenderRequirInsuranLabel);
		addComponent(lenderRequirInsuran);
		addComponent(needsPowerOfAttorneyLabel);
		addComponent(needsPowerOfAttorney);
	}
}
