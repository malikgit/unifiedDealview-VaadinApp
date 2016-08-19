package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class TotalValueForm extends GridLayout {
	
	Label totalHeatLabel = new Label("Total Heat:");
	
	Label gdsAmountLabel = new Label("GDS Amount:");
	Label totalPropTaxeslabel = new Label("Total Prop Taxes:");
	
	Label tdsAmountLabel = new Label("TDS Amount:");
	Label totalCondoFessLabel = new Label("Total Condo Fees:");
	
	
	TextField totalHeat= new TextField();
	
	TextField gdsAmount = new TextField();
	TextField  totalPropTaxes= new TextField();
	
	TextField tdsAmount = new TextField();
	TextField totalCondoFees = new TextField();
	
	public TotalValueForm() {
		super(4, 3);
	
		setSpacing(true);
		setMargin(true);
		
		
		/*propertyValue.setStyleName("borderless");
		propertyValue.setReadOnly(true);
		amortization.setStyleName("borderless");
		amortization.setReadOnly(true);
		downpaymentEquity.setStyleName("borderless");
		downpaymentEquity.setReadOnly(true);
		mortgageType.setStyleName("borderless");
		mortgageType.setReadOnly(true);
		mortgageAmount.setStyleName("borderless");
		mortgageAmount.setReadOnly(true);
		mortgageTerm.setStyleName("borderless");
		mortgageTerm.setReadOnly(true);
		insuranceAmount.setStyleName("borderless");
		insuranceAmount.setReadOnly(true);*/
		
		
		addComponent(totalHeatLabel);
		addComponent(totalHeat);
		addComponent(gdsAmountLabel);
		addComponent(gdsAmount);
		
		
		
		
		addComponent(totalPropTaxeslabel);
		addComponent(totalPropTaxes);
		addComponent(tdsAmountLabel);
		addComponent(tdsAmount);
		
		
		
		addComponent(totalCondoFessLabel);
		addComponent(totalCondoFees);
		
		
		
		
		
		
	}
	
	
	
	
	

}
