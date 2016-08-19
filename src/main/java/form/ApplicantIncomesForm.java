package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class ApplicantIncomesForm  extends GridLayout{
	
	private Label monthlyChildOrSpousalSupportLabel = new Label("Monthly Child / Spousal Support:");
	//private NativeSelect job5Years = new NativeSelect();
	private TextField monthlyChildOrSpousalSupport = new TextField();
	
	private Label totalRentalIncomeLabel = new Label("Total Rental Income:");
	private TextField totalRentalIncome = new TextField();

	private Label totalEmployedOrIncomeLabel = new Label("Total Employed / Income:");
	private TextField totalEmployedOrIncome = new TextField();
	
	private Label totalOtherIncomeLabel = new Label("Total Other Income:");
	private TextField totalOtherIncome = new TextField();

	private Label totalSelfEmployedIncomeLabel = new Label("Total Self-Employed Income:");
	private TextField totalSelfEmployedIncome = new TextField();
	
	private Label totalIncomeLabel = new Label("Total Income:");
	private TextField totalIncome = new TextField();
	
	public ApplicantIncomesForm() {
		super(4,3);
		
		addComponent(monthlyChildOrSpousalSupportLabel);
		addComponent(monthlyChildOrSpousalSupport);
		
		addComponent(totalRentalIncomeLabel);
		addComponent(totalRentalIncome);
		
		addComponent(totalEmployedOrIncomeLabel);
		addComponent(totalEmployedOrIncome);
		
		addComponent(totalOtherIncomeLabel);
		addComponent(totalOtherIncome);
		
		addComponent(totalSelfEmployedIncomeLabel);
		addComponent(totalSelfEmployedIncome);
		
		addComponent(totalIncomeLabel);
		addComponent(totalIncome);
		
	}
}
