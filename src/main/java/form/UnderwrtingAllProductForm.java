package form;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gwt.user.client.ui.Grid;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class UnderwrtingAllProductForm extends GridLayout {
	
	Label lendingGoallabel = new Label("Lending Goal:");
	
	Label propertylabel = new Label("Property Value:");
	Label desiredProductlabel = new Label("Desired Product:");
	
	Label downpaymentEquitylabel = new Label("Downpayment:");
	Label recommmendProductlabel = new Label("Recommended Product:");
	
	Label mortgageamountlabel = new Label("Mortgage Amount:");
	Label combinedRecommendlabel = new Label("Combined Recommend:");
	
	Label insuraceamouuntLabel = new Label("Insurance Amount:");
	
	
	
	
	Label labelnull1 =new Label("");
	Label labelnull2 =new Label("");
Label labelnull3 =new Label("");
/*Label labelnull4 =new Label("");
	Label labelnull5 =new Label("");*/
	
	
	
	
	
	
	
	
	TextField lendingGoal= new TextField();
	
	TextField propertyValue = new TextField();
	TextField  desiredProduct= new TextField();
	
	TextField downpaymentEquity = new TextField();
	TextField recommmendProduct = new TextField();
	
	TextField mortgageAmount = new TextField();
	TextField 	combinedRecommend = new TextField();
	TextField 	combinedRecommend1 = new TextField();

	
	TextField insuranceAmount = new TextField();

	
	
	
	
	
	

	
	
	
	public UnderwrtingAllProductForm() {
		super(4, 5);
	
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
		
		
		addComponent(lendingGoallabel);
		addComponent(lendingGoal);
		addComponent(labelnull1);
		addComponent(labelnull2);
		
		
		
		
		addComponent(propertylabel);
		addComponent(propertyValue);
		addComponent(desiredProductlabel);
		addComponent(desiredProduct);
		
		
		
		addComponent(downpaymentEquitylabel);
		addComponent(downpaymentEquity);
		addComponent(recommmendProductlabel);
		addComponent(recommmendProduct);
		
		addComponent(mortgageamountlabel);
		addComponent(mortgageAmount);
		addComponent(combinedRecommendlabel);
		addComponent(combinedRecommend);
		
		
		addComponent(insuraceamouuntLabel);
		addComponent(insuranceAmount);
		addComponent(labelnull3);
		addComponent(combinedRecommend1);
		
		
		
		
		
	}
	
	
	
	
	

}
