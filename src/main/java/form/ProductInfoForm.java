package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Notification.Type;

public class ProductInfoForm  extends GridLayout{
	private Label product0 = new Label();
	private Label product1 = new Label("Product1");
	private Label product3 = new Label();
	private Label product2 = new Label("Product2");
	
	private Label productNameLabel = new Label("Product Name:");
	private TextField productName = new TextField();
	private Label productNameLabel2 = new Label("Product Name:");
	private TextField productName2 = new TextField();

	private Label amortizationLabel = new Label("Amortization:");
	private TextField amortization = new TextField();
	private Label amortizationLabel2 = new Label("Amortization:");
	private TextField amortization2 = new TextField();
	
	private Label rateInPercentageLabel = new Label("Rate In Percentage:");
	private TextField rateInPercentage = new TextField();
	private Label rateInPercentageLabel2 = new Label("Rate In Percentage:");
	private TextField rateInPercentage2 = new TextField();
	
	private Label plusMinusPrimeLabel = new Label("Plus Minus Prime:");
	private TextField plusMinusPrime = new TextField();
	private Label plusMinusPrimeLabel2 = new Label("Plus Minus Prime:");
	private TextField plusMinusPrime2 = new TextField();
	
	private Label mortgageTypeLabel = new Label("Mortgage Type");
	private NativeSelect mortgageType = new NativeSelect();
	private Label mortgageTypeLabel2 = new Label("Mortgage Type");
	private NativeSelect mortgageType2 = new NativeSelect();
	
	
	private Label termLabel = new Label("Term:");
	private NativeSelect term = new NativeSelect();
	private Label termLabel2 = new Label("Term:");
	private NativeSelect term2 = new NativeSelect();
	
	private Label openClosedLabel = new Label("Open Closed:");
	private NativeSelect openClosed = new NativeSelect();
	private Label openClosedLabel2 = new Label("Open Closed:");
	private NativeSelect openClosed2 = new NativeSelect();
	
	private Label frequencyLabel = new Label("Frequency:");
	private NativeSelect frequency = new NativeSelect();
	private Label frequencyLabel2 = new Label("Frequency:");
	private NativeSelect frequency2 = new NativeSelect();
	
	private Label paymentLabel = new Label("Payment:");
	private TextField payment = new TextField();
	private Label paymentLabel2 = new Label("Payment:");
	private TextField payment2 = new TextField();
	
	private Label cashbackLabel = new Label("Payment:");
	private TextField cashback = new TextField();
	private Label cashbackLabel2 = new Label("Payment:");
	private TextField cashback2 = new TextField();
	public ProductInfoForm() {
		super(4, 5);
		setSpacing(true);
		addComponent(product0);
		addComponent(product1);
		addComponent(product3);
		addComponent(product2);
		
		addComponent(productNameLabel);
		addComponent(productName);
		addComponent(productNameLabel2);
		addComponent(productName2);
		
		addComponent(amortizationLabel);
		addComponent(amortization);
		addComponent(amortizationLabel2);
		addComponent(amortization2);
		
		addComponent(rateInPercentageLabel);
		addComponent(rateInPercentage);
		addComponent(rateInPercentageLabel2);
		addComponent(rateInPercentage2);
		
		addComponent(plusMinusPrimeLabel);
		addComponent(plusMinusPrime);
		addComponent(plusMinusPrimeLabel2);
		addComponent(plusMinusPrime2);
		
		addComponent(mortgageTypeLabel);
		mortgageType.addItem("LOC");
		mortgageType.addItem("Variable");	        
		mortgageType.addItem("Fixed");
		mortgageType.addItem("Cashback");
		mortgageType.addItem("Combined");
		
		mortgageType.setNullSelectionAllowed(false);
		mortgageType.setValue(2);
		mortgageType.setImmediate(true);
		mortgageType.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		addComponent(mortgageType);
		
		addComponent(mortgageTypeLabel2);
		mortgageType2.addItem("LOC");
		mortgageType2.addItem("Variable");	        
		mortgageType2.addItem("Fixed");
		mortgageType2.addItem("Cashback");
		mortgageType2.addItem("Combined");
		
		mortgageType2.setNullSelectionAllowed(false);
		mortgageType2.setValue(2);
		mortgageType2.setImmediate(true);
		mortgageType2.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		addComponent(mortgageType2);
		
		addComponent(termLabel);
		term.addItem("6 Month");
		term.addItem("1 Year");	        
		term.addItem("2 Year");
		term.addItem("3 Year");
		term.addItem("4 Year");
		term.addItem("5 Year");
		term.addItem("6 Year");	        
		term.addItem("7 Year");
		term.addItem("8 Year");
		term.addItem("9 Year");
		term.addItem("10 Year");
		term.addItem("Open");
		
		term.setNullSelectionAllowed(false);
		term.setValue(2);
		term.setImmediate(true);
		term.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		addComponent(term);
		
		addComponent(termLabel2);
		term2.addItem("6 Month");
		term2.addItem("1 Year");	        
		term2.addItem("2 Year");
		term2.addItem("3 Year");
		term2.addItem("4 Year");
		term2.addItem("5 Year");
		term2.addItem("6 Year");	        
		term2.addItem("7 Year");
		term2.addItem("8 Year");
		term2.addItem("9 Year");
		term2.addItem("10 Year");
		term2.addItem("Open");
		
		term2.setNullSelectionAllowed(false);
		term2.setValue(2);
		term2.setImmediate(true);
		term2.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		addComponent(term2);
		
		addComponent(openClosedLabel);
		openClosed.addItem("Open");
		openClosed.addItem("Closed");	        
		
		openClosed.setNullSelectionAllowed(false);
		openClosed.setValue(2);
		openClosed.setImmediate(true);
		openClosed.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		addComponent(openClosed);
		
		addComponent(openClosedLabel2);
		openClosed2.addItem("Open");
		openClosed2.addItem("Closed");	        
		
		openClosed2.setNullSelectionAllowed(false);
		openClosed2.setValue(2);
		openClosed2.setImmediate(true);
		openClosed2.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		addComponent(openClosed2);
		
		addComponent(frequencyLabel);
		frequency.addItem("Monthly");
		frequency.addItem("Semi-Monthly");
		frequency.addItem("Bi-Weekly");
		frequency.addItem("Weekly");
		frequency.addItem("Quarterly");
		frequency.addItem("Annual");
		
		frequency.setNullSelectionAllowed(false);
		frequency.setValue(2);
		frequency.setImmediate(true);
		frequency.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		addComponent(frequency);
		addComponent(frequencyLabel2);
		frequency2.addItem("Monthly");
		frequency2.addItem("Semi-Monthly");
		frequency2.addItem("Bi-Weekly");
		frequency2.addItem("Weekly");
		frequency2.addItem("Quarterly");
		frequency2.addItem("Annual");
		
		frequency2.setNullSelectionAllowed(false);
		frequency2.setValue(2);
		frequency2.setImmediate(true);
		frequency2.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		addComponent(frequency2);
		
		
		addComponent(paymentLabel);
		addComponent(payment);
		addComponent(paymentLabel2);
		addComponent(payment2);
		
	}
}
