package form;

import java.util.ArrayList;
import java.util.List;

import model.Applicant;
import model.ApplicantIncomeTable;
import model.ApplicantIncomes;
import model.Opportunity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import postgresdao.PostgresDAOI;
import postgresdao.factory.DAOFactory;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class IncomesTabForm extends CssLayout{
	private static final Logger LOGGER = LoggerFactory.getLogger(IncomesTabForm.class);
	private PostgresDAOI pdaoi=DAOFactory.getPostgresDAO();
	
	public IncomesTabForm(int applicantId) {
		setApplicantIncomesForm(applicantId);
		setApplicantIncomeTable(applicantId);
	}

	private void setApplicantIncomesForm(int applicantId) {
		
		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Incomes ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		ApplicantIncomesForm infoForm = new ApplicantIncomesForm();
		infoForm.setMargin(true);
		infoForm.setSpacing(true);
		infoForm.setStyleName("loppp");
		
		ApplicantIncomes applicantIncomes =new ApplicantIncomes();
		Opportunity opportunity = null;
		Applicant applicant=null;
		try{
//			opportunity = pdaoi.getOpportunityDetails(opportunityId);
			//applicants=	pdaoi.getApplicantIds(opportunityId);
			applicant = pdaoi.getApplicantDetailsByID(applicantId+"");
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}
		
		applicantIncomes.setMonthlyChildOrSpousalSupport(applicant.getMonthlychildsupport());
		applicantIncomes.setTotalRentalIncome(applicant.getTotal_rental_income());
		applicantIncomes.setTotalEmployedOrIncome(applicant.getTotal_employed_income());
		applicantIncomes.setTotalOtherIncome(applicant.getTotal_other_income());
		applicantIncomes.setTotalSelfEmployedIncome(applicant.getTotalSelfEmployed());
		applicantIncomes.setTotalIncome(applicant.getTotalIncome());
		
		FieldGroup binder = new FieldGroup();
		binder.setReadOnly(true);
		BeanItem<ApplicantIncomes> item = new BeanItem<ApplicantIncomes>(applicantIncomes);
		binder.setItemDataSource(item);
		binder.bindMemberFields(infoForm);
		verticallayut.addComponent(infoForm);
		verticallayut.setComponentAlignment(infoForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
		
	}
	private void setApplicantIncomeTable(int applicantId) {

		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		ApplicantIncomeTableForm incomeTable = new ApplicantIncomeTableForm();
		/*infoForm.setMargin(true);
		infoForm.setSpacing(true);*/
		incomeTable.setStyleName("loppp");
		
		//ApplicantIncomeTable applicantIncomesTable =new ApplicantIncomeTable();
		//Opportunity opportunity = null;
		List<Applicant> applicants=null;
		List<Integer> ids=new ArrayList<Integer>();
		List<ApplicantIncomeTable> listOfIncomes=null;
		BeanItemContainer<ApplicantIncomeTable> item = new BeanItemContainer<ApplicantIncomeTable>(ApplicantIncomeTable.class);
		try {
			listOfIncomes = pdaoi.getApplicantIncomes(applicantId);
			for (ApplicantIncomeTable income : listOfIncomes) {
				item.addBean(income);
			}
		} catch (Exception e) {
			LOGGER.error(
					"Error when retrieving Opportunity details from postgress",
					e);
		}
		incomeTable.setContainerDataSource(item);
		verticallayut.addComponent(incomeTable);
		verticallayut.setComponentAlignment(incomeTable, Alignment.TOP_LEFT);
		addComponent(verticallayut);
	}
}
