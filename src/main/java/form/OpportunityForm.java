package form;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class OpportunityForm extends GridLayout{
	
	private Label opportunityLabelName = new Label("Opportunity Name");
	private TextField name = new TextField();
	private Label applicationLabel = new Label("Application");
	private TextField application = new TextField();
	private Label proposalLabel = new Label("Proposal");
	private TextField proposal = new TextField();
	private Label bypassProposalLabel = new Label("Bypass Proposal");
	private TextField bypassProposal = new TextField();
	private Label teamLabel = new Label("Team");
	private TextField team = new TextField();
	private Label bdoLabel = new Label("BDO");
	private TextField bdo = new TextField();
	
	private Label referralSourceLabel = new Label("Referral Source ");
	private TextField referralSource = new TextField();
	private Label referralSourceEmailLabel = new Label("Referral Source Email");
	private TextField referralSourceEmail = new TextField();
	private Label referralSourcePhoneLabel = new Label("Referral Source Phone");
	private TextField referralSourcePhone = new TextField();
	private Label companyLabel = new Label("Company");
	private TextField company = new TextField();
	private Label realtorLabel = new Label("Realtor");
	private TextField realtor = new TextField();
	private Label lawyerLabel = new Label("Lawyer");
	private TextField lawyer = new TextField();
	
	public OpportunityForm(){
		super(4,6);
		addComponent(opportunityLabelName);
		addComponent(name);
		addComponent(referralSourceLabel);
		addComponent(referralSource);
		
		addComponent(applicationLabel);
		addComponent(application);
		addComponent(referralSourceEmailLabel);
		addComponent(referralSourceEmail);
		
		addComponent(proposalLabel);
		addComponent(proposal);
		addComponent(referralSourcePhoneLabel);
		addComponent(referralSourcePhone);
		
		addComponent(bypassProposalLabel);
		addComponent(bypassProposal);
		addComponent(companyLabel);
		addComponent(company);

		addComponent(teamLabel);
		addComponent(team);
		addComponent(realtorLabel);
		addComponent(realtor);
		
		addComponent(bdoLabel);
		addComponent(bdo);
		addComponent(lawyerLabel);
		addComponent(lawyer);
	}
	
}