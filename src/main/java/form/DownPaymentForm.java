package form;

import java.util.Arrays;
import java.util.List;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.TextField;

public class DownPaymentForm extends GridLayout implements Property.ValueChangeListener{
	private static final List<String> cities = Arrays.asList(new String[] {
            "Berlin", "Brussels", "Helsinki", "Madrid", "Oslo", "Paris",
            "Stockholm" });

	private Label downPaymentAmountLabel = new Label("Down Payment Amount");
	private TextField downPaymentAmount = new TextField();
	
	private Label borrowedLabel = new Label("Borrowed");
	private TextField borrowed = new TextField();
	
	private Label downPaymtComFromLabel = new Label("Down Payment Coming From");
	//private TextField downPaymentComingFrom = new TextField();
	NativeSelect downPaymentComingFrom = new NativeSelect();
	
	private Label sourceOfBorrowingLabel = new Label("Source Of Borrowing");
//	private TextField sourceOfBorrowing = new TextField();
	NativeSelect sourceOfBorrowing = new NativeSelect();
	
	private Label bankAccCheqSaveLabel = new Label("Bank Acct Chequing/Saving");
	private TextField bankAcChequingSaving = new TextField();
	
	private Label saleOfExistLabel = new Label("Sale Of Exist");
	private TextField saleOfExisting = new TextField();
	
	private Label personalCashLabel = new Label("Personal Cash");
	private TextField personalCash = new TextField();
	
	private Label sweatEquityLabel = new Label("Sweat Equity");
	private TextField sweatEquity = new TextField();
	
	private Label rrspLabel = new Label("RRSP");
	private TextField rrsp = new TextField();
	
	private Label secondaryFinanceLabel = new Label("Secondary Financing");
	private TextField secondaryFinancing = new TextField();
	
	private Label giftedLabel = new Label("Gifted");
	private TextField gifted = new TextField();
	
	private Label otherVendorTakeBackLabel = new Label("Other/Vendor TakeBack");
	private TextField otherVendorTakeBack = new TextField();
	
	public DownPaymentForm(){
		
		super(4,7);
		 setSpacing(true);

		 // 'Shorthand' constructor - also supports data binding using Containers
		 	
		 	
		 downPaymentComingFrom.addItem("Bank Account Chequing/Savings");
		 downPaymentComingFrom.addItem("RRSPs or Investments");
		 downPaymentComingFrom.addItem("Borrowed(e.g LOC)");
		 downPaymentComingFrom.addItem("Sale of Asset/Sale of Existing Property");
		 downPaymentComingFrom.addItem("Gift");
		 downPaymentComingFrom.addItem("Other");
		 downPaymentComingFrom.setNullSelectionAllowed(false);
		 downPaymentComingFrom.setValue(2);
		 downPaymentComingFrom.setImmediate(true);
	        
		 downPaymentComingFrom.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		 
		 sourceOfBorrowing.addItem(" ");
		 sourceOfBorrowing.addItem("Secured LOC");
		 sourceOfBorrowing.addItem("Other");	        
		 sourceOfBorrowing.setNullSelectionAllowed(false);
		 sourceOfBorrowing.setValue(2);
		 sourceOfBorrowing.setImmediate(true);
	        
		 sourceOfBorrowing.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
	        
	        /*
	        citySelect.setRows(7); // perfect length in out case
	        citySelect.setNullSelectionAllowed(false); // user can not 'unselect'
	        citySelect.select("Berlin"); // select this by default
	        citySelect.setImmediate(true); // send the change to the server at once
	        citySelect.addListener(this); // react when the user selects something
*/
	    
		addComponent(downPaymentAmountLabel);
		addComponent(downPaymentAmount);
		
		addComponent(borrowedLabel);
		addComponent(borrowed);
		
		addComponent(downPaymtComFromLabel);
		addComponent(downPaymentComingFrom);
		//addComponent(downPaymentComingFrom);

		addComponent(sourceOfBorrowingLabel);
		addComponent(sourceOfBorrowing);
		
		addComponent(bankAccCheqSaveLabel);
		addComponent(bankAcChequingSaving);
		
		addComponent(saleOfExistLabel);
		addComponent(saleOfExisting);
		
		addComponent(personalCashLabel);
		addComponent(personalCash);
		
		addComponent(sweatEquityLabel);
		addComponent(sweatEquity);
		
		addComponent(rrspLabel);
		addComponent(rrsp);

		addComponent(secondaryFinanceLabel);
		addComponent(secondaryFinancing);

		addComponent(giftedLabel);
		addComponent(gifted);
		
		addComponent(otherVendorTakeBackLabel);
		addComponent(otherVendorTakeBack);
		
	}

	@Override
	public void valueChange(ValueChangeEvent event) {
		System.out.println("Selected city: " + event.getProperty());
		System.out.println("Selected city: " + event.getProperty().toString());
		
	}
	

}
