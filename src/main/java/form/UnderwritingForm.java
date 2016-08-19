package form;


import java.util.ArrayList;
import java.util.List;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import model.BrokerNotes;
import model.FailureReasons;
//import model.Opportunity;




@SuppressWarnings("serial")
public class UnderwritingForm extends CssLayout   { 
	
	
	public UnderwritingForm(/*Opportunity opportunityId*/){
		//setSizeFull();
		//setMargin(true);
		//setSpacing(true);
		//setsm
		//setStyleName("underwritingbgcolor");
		
		settopbarLayout();
		setLabelAllProduct();
		setAllProductForm();
		setLabelTotals();
		setValueTotal();
		setLableForBroker();
		setBrokerNotes();
		setLableForfailure();
		
	}
	
public void settopbarLayout(){
		
		
		HorizontalLayout horizontalLayout = new HorizontalLayout();
		
		
		horizontalLayout.setSizeFull();
		//horizontalLayout.setMargin(true);
		//horizontalLayout.setSpacing(true);
		
		
		
		Label labelunerderwriting  = new Label("Underwriting Info");
		labelunerderwriting.setStyleName("bold");
		
		Label labelltv  = new Label("LTV:",ContentMode.HTML);
		 
		Label labelltvvalue  = new Label("4.44");
		
		Label labelgds  = new Label("GDS:",ContentMode.HTML);
		//labelgds.setStyleName("h2");
		Label labelgdsvalue  = new Label("3.99:");
		
		Label labeltds  = new Label("TDS:",ContentMode.HTML);
		//labeltds.setStyleName("h2");
		Label labeltdsvalue  = new Label("34.34");
	
		
		
		

		
		
		
		
		 horizontalLayout.addComponent(labelunerderwriting);
		 horizontalLayout.addComponent(labelltv);
		 horizontalLayout.addComponent(labelltvvalue);
		 
		 horizontalLayout.addComponent(labelgds);
		 horizontalLayout.addComponent(labelgdsvalue);
		 horizontalLayout.addComponent(labeltds);
		 horizontalLayout.addComponent(labeltdsvalue);
		 
		 addComponent(horizontalLayout);
		
	}

public void  setLabelAllProduct() {
	VerticalLayout layout = new VerticalLayout();
	Label allproductLabel = new Label("All Product",ContentMode.HTML);
	allproductLabel.setStyleName("labelcolor");
	
	layout.addComponent(allproductLabel);
	addComponent(layout);
}
public void setAllProductForm() {
	VerticalLayout layout = new VerticalLayout();
	UnderwrtingAllProductForm form = new UnderwrtingAllProductForm();
	layout.addComponent(form);
	addComponent(layout);
	
	
}

public void  setLabelTotals() {
	VerticalLayout layout = new VerticalLayout();
	Label totals = new Label("Totals",ContentMode.HTML);
	totals.setStyleName("labelcolor");
	
	layout.addComponent(totals );
	addComponent(layout);
}

public void  setTotalGrid() {
	VerticalLayout layout = new VerticalLayout();
	Label totals = new Label("Totals",ContentMode.HTML);
	totals.setStyleName("labelcolor");
	
	layout.addComponent(totals );
	addComponent(layout);
}

public void  setValueTotal() {
	VerticalLayout layout = new VerticalLayout();
	TotalValueForm form = new TotalValueForm();
	layout.addComponent(form);
	addComponent(layout);
	
	
}

public void setLableForBroker() {
	VerticalLayout layout = new VerticalLayout();
	Label broker  = new Label("Broker Notes:",ContentMode.HTML);
	broker.setStyleName("labelcolor");
	
	layout.addComponent(broker);
	addComponent(layout);
}

public void setBrokerNotes() {
	VerticalLayout layout = new VerticalLayout();
	
	

	
	layout.setMargin(true);
	
	List<BrokerNotes> people = new ArrayList<>();
	
	BrokerNotes con1 =	    new BrokerNotes("broker notes 1");
	BrokerNotes con2 =	    new BrokerNotes("broker notes 1");
	BrokerNotes con3 =	    new BrokerNotes("broker notes 1");
	BrokerNotes con4 =	    new BrokerNotes("broker notes 1");
	BrokerNotes con5 =	    new BrokerNotes("broker notes 1");
	BrokerNotes con6 =	    new BrokerNotes("broker notes 1");
	people.add(con1);
			people.add(con2);
			people.add(con3);
			people.add(con4);
			people.add(con5);
			people.add(con6);
		BeanItemContainer<BrokerNotes> container =new BeanItemContainer<BrokerNotes>(BrokerNotes.class, people);
				Grid grid = new Grid(container);
		grid.setSizeFull();
		layout.addComponent(grid);
		addComponent(layout);
		addComponent(layout);
}

public void setLableForfailure() {
	VerticalLayout layout = new VerticalLayout();
	Label broker  = new Label("Failure Reasons:",ContentMode.HTML);
	broker.setStyleName("labelcolor");
	
	layout.addComponent(broker);
	addComponent(layout);
}
public void setFaiuerReasons() {
	VerticalLayout layout = new VerticalLayout();
	
	

	
	layout.setMargin(true);
	
	List<FailureReasons> people = new ArrayList<>();
	
	FailureReasons con1 =	    new FailureReasons("broker notes 1");
	FailureReasons con2 =	    new FailureReasons("broker notes 1");
	FailureReasons con3 =	    new FailureReasons("broker notes 1");
	FailureReasons con4 =	    new FailureReasons("broker notes 1");
	FailureReasons con5 =	    new FailureReasons("broker notes 1");
	FailureReasons con6 =	    new FailureReasons("broker notes 1");
	people.add(con1);
			people.add(con2);
			people.add(con3);
			people.add(con4);
			people.add(con5);
			people.add(con6);
		BeanItemContainer<FailureReasons> container =new BeanItemContainer<FailureReasons>(FailureReasons.class, people);
				Grid grid = new Grid(container);
		grid.setSizeFull();
		layout.addComponent(grid);
		addComponent(layout);
		addComponent(layout);
}

	

}