package form;

import java.util.List;

import model.Mortgages;
import model.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import postgresdao.PostgresDAOI;
import postgresdao.factory.DAOFactory;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.renderers.HtmlRenderer;

import customclass.CustomCheckBox;


public class PropertiesTabForm extends CssLayout {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(PropertiesTabForm.class);
	private PostgresDAOI pdaoi = DAOFactory.getPostgresDAO();

	public PropertiesTabForm(int applicantId) {
		//setPropertiesForm(applicantId);
		setMortgagesForm(applicantId);
	}

	private void setPropertiesForm(int applicantId) {

		VerticalLayout verticallayut = new VerticalLayout();
		verticallayut.setMargin(true);
		Label header1 = new Label(" Properties ");
		Label header = new Label(" Properties: ");
		header1.addStyleName("h1");
		header.addStyleName("h2");
		verticallayut.addComponent(header1);
		verticallayut.addComponent(header);
		PropertiesForm propertiesForm = new PropertiesForm();
		// credtLiabilityForm.setMargin(true);
		// credtLiabilityForm.setSpacing(true);
		propertiesForm.setSizeFull();
		propertiesForm.setStyleName("loppp");

		List<Properties> listOfProperties = null;
		BeanItemContainer<Properties> item = new BeanItemContainer<Properties>(
				Properties.class);
		try {
			listOfProperties = pdaoi.getApplicantProperties(applicantId);
			for (Properties property : listOfProperties) {
				item.addBean(property);
			}

		} catch (Exception e) {
			LOGGER.error("Error when retrieving Opportunity details from postgress", e);
		}
		propertiesForm.setContainerDataSource(item);
		verticallayut.addComponent(propertiesForm);
		verticallayut.setComponentAlignment(propertiesForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);

	}

	private void setMortgagesForm(int applicantId) {

		VerticalLayout verticallayut = new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Mortgages ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
//		MortgagesForm mortgagesForm = new MortgagesForm();
		Grid mortgagesForm=new Grid();

		mortgagesForm.addColumn("name", String.class);
		Grid.Column name = mortgagesForm.getColumn("name");
		name.setHeaderCaption("Lender");
		mortgagesForm.addColumn("interest_rate",String.class);
		Grid.Column interestRate = mortgagesForm.getColumn("interest_rate");
		interestRate.setHeaderCaption("Interest Rate");
		mortgagesForm.addColumn("balance",String.class);
		mortgagesForm.addColumn("monthly_payment",String.class);
		Grid.Column monthlyPayment = mortgagesForm.getColumn("monthly_payment");
		monthlyPayment.setHeaderCaption("Monthly Payment");
		mortgagesForm.addColumn("type",String.class);
		Grid.Column types = mortgagesForm.getColumn("type");
		types.setHeaderCaption("Mortgage Type");
		mortgagesForm.addColumn("renewal",String.class);
		mortgagesForm.addColumn("monthly_rent",Integer.class);
		Grid.Column monthlyRent = mortgagesForm.getColumn("monthly_rent");
		monthlyRent.setHeaderCaption("Monthly Rent");
		mortgagesForm.addColumn("pay_off",Integer.class);
		Grid.Column payoff= mortgagesForm.getColumn("pay_off");
		payoff.setHeaderCaption("Payoff");
		mortgagesForm.addColumn("selling",Boolean.class);
//		Grid.Column selling =  mortgagesForm.getColumn("selling");
		mortgagesForm.getColumn("selling").setConverter(new CustomCheckBox()).setRenderer(new HtmlRenderer());
		//selling.setEditable(true);
		
		
		
		
		mortgagesForm.addColumn("property_id",String.class);
		Grid.Column propertyId= mortgagesForm.getColumn("property_id");
		propertyId.setHeaderCaption("Property Id");
//		 mortgagesForm.setMargin(true);
//		 mortgagesForm.setSpacing(true);
		
		mortgagesForm.setStyleName("loppp");
		mortgagesForm.setEditorEnabled(true);
		mortgagesForm.setHeightMode(HeightMode.ROW);
		mortgagesForm.setSizeUndefined();
		
		List<Mortgages> listOfPMortgages = null;
		BeanItemContainer<Mortgages> item = new BeanItemContainer<Mortgages>(
				Mortgages.class);
		try {

			listOfPMortgages = pdaoi.getApplicantMortgagesProperties(applicantId);
			for (Mortgages Mortgage : listOfPMortgages) {
				item.addBean(Mortgage);
			}
		} catch (Exception e) {
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}
		mortgagesForm.setContainerDataSource(item);
		verticallayut.addComponent(mortgagesForm);
		verticallayut.setComponentAlignment(mortgagesForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);

	}

}
