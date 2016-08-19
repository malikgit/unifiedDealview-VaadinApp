package model;

import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class Information {
	private String opportunityName;
	private String referralSource;
	private String application;
	private String referralSourceEmail;
	private String proposal;
	private String referralSourcePhone;
	private String bypassProposal;
	private String company;
	private String team;
	private String realtor;
	private String bdo;
	private String lawyer;
	
	public Information() {
		
	}
	public Information(String opportunityName, String application,
			String proposal, String bypassProposal, String team,
			String bdo, String referralSource,
			String referralSourceEmail, String referralSourcePhone,
			String company, String realtor, String lawyer) {
		super();
		this.opportunityName = opportunityName;
		this.application = application;
		this.proposal = proposal;
		this.bypassProposal = bypassProposal;
		this.team = team;
		this.bdo = bdo;
		this.referralSource = referralSource;
		this.referralSourceEmail = referralSourceEmail;
		this.referralSourcePhone = referralSourcePhone;
		this.company = company;
		this.realtor = realtor;
		this.lawyer = lawyer;
	}
	public String getOpportunityName() {
		return opportunityName;
	}
	public void setOpportunityName(String opportunityName) {
		this.opportunityName = opportunityName;
	}
	public String getReferralSource() {
		return referralSource;
	}
	public void setReferralSource(String referralSource) {
		this.referralSource = referralSource;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getReferralSourceEmail() {
		return referralSourceEmail;
	}
	public void setReferralSourceEmail(String referralSourceEmail) {
		this.referralSourceEmail = referralSourceEmail;
	}
	public String getProposal() {
		return proposal;
	}
	public void setProposal(String proposal) {
		this.proposal = proposal;
	}
	public String getReferralSourcePhone() {
		return referralSourcePhone;
	}
	public void setReferralSourcePhone(String referralSourcePhone) {
		this.referralSourcePhone = referralSourcePhone;
	}
	public String getBypassProposal() {
		return bypassProposal;
	}
	public void setBypassProposal(String bypassProposal) {
		this.bypassProposal = bypassProposal;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getRealtor() {
		return realtor;
	}
	public void setRealtor(String realtor) {
		this.realtor = realtor;
	}
	public String getBdo() {
		return bdo;
	}
	public void setBdo(String bdo) {
		this.bdo = bdo;
	}
	public String getLawyer() {
		return lawyer;
	}
	public void setLawyer(String lawyer) {
		this.lawyer = lawyer;
	}
	
}

