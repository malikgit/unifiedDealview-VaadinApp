package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Notification.Type;

public class LenderRelatedForm extends GridLayout{
	
	private Label lenderNameLabel = new Label("Lender Name:");
	private TextField lenderName = new TextField();
	
	private Label insurerLabel = new Label("Insurer:");
	private NativeSelect insurer = new NativeSelect();
	
	private Label lenderResponseLabel = new Label("Lender Response:");
	private TextField lenderResponse = new TextField();
	
	private Label insurerRefLabel = new Label("Insurer Ref #:");
	private TextField insurerRef = new TextField();
	
	private Label lenderRefLabel = new Label("Lender Ref #:");
	private TextField lenderRef = new TextField();
	
	private Label insurerFeeLabel = new Label("Insurer Fee:");
	private TextField insurerFee = new TextField();
	
	private Label filogixRefLabel = new Label("Filogix Ref #:");
	private TextField filogixRef = new TextField();
	
	public LenderRelatedForm() {
		super(4, 4);
		setSpacing(true);
		
		addComponent(lenderNameLabel);
		addComponent(lenderName);
		
		addComponent(insurerLabel);

		insurer.addItem("CMHC");
		insurer.addItem("GE");
		insurer.addItem("AIG");
		
		insurer.setNullSelectionAllowed(false);
		insurer.setValue(2);
		insurer.setImmediate(true);
		insurer.addValueChangeListener(e -> Notification.show("Value changed:",
	                String.valueOf(e.getProperty().getValue()),  Type.TRAY_NOTIFICATION));
		addComponent(insurer);
		
		addComponent(lenderResponseLabel);
		addComponent(lenderResponse);
		
		addComponent(insurerRefLabel);
		addComponent(insurerRef);
		
		addComponent(lenderRefLabel);
		addComponent(lenderRef);
		
		addComponent(insurerFeeLabel);
		addComponent(insurerFee);
		
		addComponent(filogixRefLabel);
		addComponent(filogixRef);
		
	}
	
}
