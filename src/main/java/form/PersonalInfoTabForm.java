package form;

import java.util.List;

import model.Applicant;
import model.ApplicantAddresses;
import model.ApplicantInformation;

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

public class PersonalInfoTabForm extends CssLayout {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(PersonalInfoTabForm.class);
	private PostgresDAOI pdaoi = DAOFactory.getPostgresDAO();

	public PersonalInfoTabForm(int applicantId) {
//		opportunityId = "3584";
		setApplicantInformationForm(applicantId);
		setAddressesForm(applicantId);
	}

	private void setApplicantInformationForm(int applicantId) {
		LOGGER.info("Inside setApplicantInformationForm");
		VerticalLayout verticallayut = new VerticalLayout();
		verticallayut.setMargin(true);
		Label personalInfo = new Label(" Personal Info ");
		personalInfo.addStyleName("h2");
		verticallayut.addComponent(personalInfo);
		
		Label header = new Label(" Information ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		ApplicantInformationForm applicantInformationForm = new ApplicantInformationForm();
		applicantInformationForm.setMargin(true);
		applicantInformationForm.setSpacing(true);
		applicantInformationForm.setStyleName("loppp");

		ApplicantInformation applicantInfo = new ApplicantInformation();
		Applicant applicant = null;
		try {
			applicant = pdaoi.getApplicantDetailsByID(applicantId+"");
		} catch (Exception e) {
			LOGGER.error("Error when retrieving Applicant details from postgress",e);
		}
			applicantInfo.setFirstName(applicant.getApplicant_name());
			applicantInfo.setDob(applicant.getDob());
			applicantInfo.setLastName(applicant.getApplicant_last_name());
			applicantInfo.setSocialInsurance(applicant.getSin());
			applicantInfo.setEmail(applicant.getEmail_personal());
			applicantInfo.setPassportNonRes(applicant.getPassport());
			applicantInfo.setCell(applicant.getCell());
			applicantInfo.setNonResident(applicant.getNon_resident());
			applicantInfo.setWork(applicant.getWork());
			applicantInfo.setImmigrationDate(applicant.getImmigration_date());
			applicantInfo.setHome(applicant.getHome());
			applicantInfo.setRelationshipStatus(compareRelStatus(applicant
					.getRelationship_status()));
			if (applicant.getBest_number() != null
					&& applicant.getBest_number().equalsIgnoreCase("Mobile"))
				applicantInfo.setBestNumber("Mobile");
			else if (applicant.getBest_number() != null
					&& applicant.getBest_number().equalsIgnoreCase("Work"))
				applicantInfo.setBestNumber("Work");
			else if (applicant.getBest_number() != null
					&& applicant.getBest_number().equalsIgnoreCase("Home"))
				applicantInfo.setBestNumber("Home");
			else
				applicantInfo.setBestNumber(" ");

			FieldGroup binder = new FieldGroup();
			binder.setReadOnly(true);
			BeanItem<ApplicantInformation> item = new BeanItem<ApplicantInformation>(
					applicantInfo);
			binder.setItemDataSource(item);
			binder.bindMemberFields(applicantInformationForm);
			verticallayut.addComponent(applicantInformationForm);
			verticallayut.setComponentAlignment(applicantInformationForm,
					Alignment.TOP_LEFT);
			addComponent(verticallayut);
		}

	private String compareRelStatus(String compareValue) {

		if (compareValue != null && compareValue.equalsIgnoreCase("Single"))
			return "Single";
		else if (compareValue != null
				&& compareValue.equalsIgnoreCase("Married"))
			return "Married";
		else if (compareValue != null
				&& compareValue.equalsIgnoreCase("Common_Law"))
			return "Common-Law";
		else if (compareValue != null
				&& compareValue.equalsIgnoreCase("Divorced"))
			return "Divorced";
		else if (compareValue != null
				&& compareValue.equalsIgnoreCase("Separated"))
			return "Separated";
		else if (compareValue != null && compareValue.equalsIgnoreCase("Other"))
			return "Other";
		else
			return " ";
	}

	private void setAddressesForm(int applicantId) {

		LOGGER.info("Inside setAddressesForm");
		VerticalLayout verticallayut = new VerticalLayout();
		verticallayut.setMargin(true);
		Label header = new Label(" Addresses ");
		header.addStyleName("h2");
		verticallayut.addComponent(header);
		AddressesForm addressesForm = new AddressesForm();
		addressesForm.setMargin(true);
		addressesForm.setSpacing(true);
		addressesForm.setStyleName("loppp");
		List<Applicant> applicants = null;
		try {
			applicants = pdaoi.getApplicantIds(applicantId+"");
			System.out
					.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>checking no of Applicants"
							+ applicants.size());
			int noOfApplicant = 0;
			int noOfAddress = 0;

			BeanItemContainer<ApplicantAddresses> applicantContainer = new BeanItemContainer<ApplicantAddresses>(
					ApplicantAddresses.class);
			
				System.out.println(noOfApplicant);
				List<ApplicantAddresses> applAddress = pdaoi
						.getApplicantAddresses(applicantId);
				for (ApplicantAddresses applicantAddress : applAddress) {
					applicantContainer.addBean(applicantAddress);
					System.out.println(noOfAddress);
					/*
					 * For unit there is no data in openerp
					 * applicantaddresses.setUnit(applicantAddress.getUnit());
					 * applicantaddresses.setStreet(applicantAddress.getName());
					 * applicantaddresses.setCity(applicantAddress.getCity());
					 * applicantaddresses
					 * .setProvince(applicantAddress.getProvince());
					 * applicantaddresses
					 * .setPostal_code(applicantAddress.getPostal_code());
					 * applicantaddresses.setDate(applicantAddress.getDate());
					 * 
					 * 
					 * FieldGroup binder = new FieldGroup();
					 * binder.setReadOnly(true); BeanItem<ApplicantAddresses>
					 * item = new
					 * BeanItem<ApplicantAddresses>(applicantaddresses);
					 * binder.setItemDataSource(item);
					 * binder.bindMemberFields(addressesForm);
					 * verticallayut.addComponent(addressesForm);
					 * verticallayut.setComponentAlignment(addressesForm,
					 * Alignment.TOP_LEFT); addComponent(verticallayut);
					 */
				}

			Grid grid = new Grid();
			grid.setContainerDataSource(applicantContainer);
			verticallayut.addComponent(grid);
			addComponent(verticallayut);

		} catch (Exception e) {
			LOGGER.error("Error when Retrieving Opportunity details from postgress",e);
		}

	}

}
