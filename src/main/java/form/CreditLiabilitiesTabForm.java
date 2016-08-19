package form;

import java.util.List;

import model.Applicant;
import model.ApplicantCollections;
import model.CreditLiabilities;
import model.Liabilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import postgresdao.PostgresDAOI;
import postgresdao.factory.DAOFactory;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class CreditLiabilitiesTabForm extends CssLayout{
	private static final Logger LOGGER = LoggerFactory.getLogger(CreditLiabilitiesTabForm.class);
	private PostgresDAOI pdaoi=DAOFactory.getPostgresDAO();
	
	public CreditLiabilitiesTabForm(int applicantId) {
		setCreditLiabilitiesForm(applicantId);
		setLiabilitiesForm(applicantId);
		setCollectionsForm(applicantId);
	}

	private void setCreditLiabilitiesForm(int applicantId) {
		
		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Credit / Liabilities ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		CreditLiabilitiesForm credtLiabilityForm = new CreditLiabilitiesForm();
		credtLiabilityForm.setMargin(true);
		credtLiabilityForm.setSpacing(true);
		credtLiabilityForm.setStyleName("loppp");
		
		CreditLiabilities creditLiabilities =new CreditLiabilities();
		Applicant applicant=null;
		try{
			applicant=	pdaoi.getApplicantDetailsByID(applicantId+"");
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}
		/*for(Applicant applicant:applicants){
			creditLiabilities.setBeacon5Store(applicant.getBeacon_5_score());
			creditLiabilities.setOrderlyDebtPayment(applicant.getOrderly_debt_payment());
			creditLiabilities.setBankruptcy(applicant.getBankruptcy());
			creditLiabilities.setOdpDischargeDate(applicant.getOdpDischargeDate());
			creditLiabilities.setBankruptyDischarge(applicant.getBankruptcy_discharge_date());
			creditLiabilities.setMonthlySupportPayment(applicant.getMonthly_support_payment());
			FieldGroup binder = new FieldGroup();
			binder.setReadOnly(true);
			BeanItem<CreditLiabilities> item = new BeanItem<CreditLiabilities>(creditLiabilities);
			binder.setItemDataSource(item);
			binder.bindMemberFields(credtLiabilityForm);
			verticallayut.addComponent(credtLiabilityForm);
			verticallayut.setComponentAlignment(credtLiabilityForm, Alignment.TOP_LEFT);
			addComponent(verticallayut);
		}*/
		
		creditLiabilities.setBeacon5Store(applicant.getBeacon_5_score());
		creditLiabilities.setOrderlyDebtPayment(applicant.getOrderly_debt_payment());
		creditLiabilities.setBankruptcy(applicant.getBankruptcy());
		creditLiabilities.setOdpDischargeDate(applicant.getOdpDischargeDate());
		creditLiabilities.setBankruptyDischarge(applicant.getBankruptcy_discharge_date());
		creditLiabilities.setMonthlySupportPayment(applicant.getMonthly_support_payment());
		
		FieldGroup binder = new FieldGroup();
		binder.setReadOnly(true);
		BeanItem<CreditLiabilities> item = new BeanItem<CreditLiabilities>(creditLiabilities);
		binder.setItemDataSource(item);
		binder.bindMemberFields(credtLiabilityForm);
		verticallayut.addComponent(credtLiabilityForm);
		verticallayut.setComponentAlignment(credtLiabilityForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
		
	}
	
	private void setLiabilitiesForm(int applicantId) {
		
		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Liabilities ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		LiabilitiesForm liabilitiesForm = new LiabilitiesForm();
		liabilitiesForm.setStyleName("loppp");
		
		
		List<Liabilities> listOfLiability=null;
		BeanItemContainer<Liabilities> item = new BeanItemContainer<Liabilities>(Liabilities.class);
		try{
				listOfLiability=pdaoi.getLiabilities(applicantId);
				for(Liabilities liability:listOfLiability){
					item.addBean(liability);
				}
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}
		liabilitiesForm.setContainerDataSource(item);
		verticallayut.addComponent(liabilitiesForm);
		verticallayut.setComponentAlignment(liabilitiesForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
		
	}
	private void setCollectionsForm(int applicantId) {
		
		VerticalLayout verticallayut= new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Collections ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		CollectionsForm collectionsForm =new CollectionsForm(); 
		collectionsForm.setStyleName("loppp");
		List<ApplicantCollections> listOfApplicantCollections=null;
		BeanItemContainer<ApplicantCollections> item = new BeanItemContainer<ApplicantCollections>(ApplicantCollections.class);
		try{
				listOfApplicantCollections = pdaoi.getApplicantCollections(applicantId);
				for(ApplicantCollections applicantCollection:listOfApplicantCollections){
					item.addBean(applicantCollection);
			}
		}catch(Exception e){
			LOGGER.error("Error when retrieving Opportunity details from postgress",e);
		}
		collectionsForm.setContainerDataSource(item);
		verticallayut.addComponent(collectionsForm);
		verticallayut.setComponentAlignment(collectionsForm, Alignment.TOP_LEFT);
		addComponent(verticallayut);
		
	}
}
