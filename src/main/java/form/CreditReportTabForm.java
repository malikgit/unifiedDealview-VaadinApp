package form;

import model.Applicant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import postgresdao.PostgresDAOI;
import postgresdao.factory.DAOFactory;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class CreditReportTabForm extends CssLayout{
	private static final Logger LOGGER = LoggerFactory.getLogger(CreditReportTabForm.class);
	private PostgresDAOI pdaoi=DAOFactory.getPostgresDAO();
	
	public CreditReportTabForm(int applicantId) {
		setCreditReportForm(applicantId);
	}

	private void setCreditReportForm(int applicantId) {
		
		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Credit Report ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		CreditReportForm creditReportForm = new CreditReportForm();
		creditReportForm.setMargin(true);
		creditReportForm.setSpacing(true);
		creditReportForm.setStyleName("loppp");
		Applicant applicant = null;
		try{
//			opportunity = pdaoi.getOpportunityDetails(opportunityId);
			applicant=	pdaoi.getApplicantDetailsByID(applicantId+"");
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.........==========="+applicant.getCredit_report());
				applicant.setCredit_report(applicant.getCredit_report());
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}
		FieldGroup binder = new FieldGroup();
		binder.setReadOnly(true);
		BeanItem<Applicant> item = new BeanItem<Applicant>(applicant);
		binder.setItemDataSource(item);
		binder.bindMemberFields(creditReportForm);
		verticallayut.addComponent(creditReportForm);
		verticallayut.setComponentAlignment(creditReportForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
		
	}
}
