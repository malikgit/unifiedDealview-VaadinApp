package model;

import java.util.Set;

public class General {
	
	private Information information;
	private Set<Applicants> applicants;
	private DealInfo dealInfo;
	private Downpayment downPayment;

	public General() {
		// TODO Auto-generated constructor stub
	}

	public General(Information information, Set<Applicants> applicants,
			DealInfo dealInfo, Downpayment downPayment) {
		super();
		this.information = information;
		this.applicants = applicants;
		this.dealInfo = dealInfo;
		this.downPayment = downPayment;
	}

	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}

	public Set<Applicants> getApplicants() {
		return applicants;
	}

	public void setApplicants(Set<Applicants> applicants) {
		this.applicants = applicants;
	}

	public DealInfo getDealInfo() {
		return dealInfo;
	}

	public void setDealInfo(DealInfo dealInfo) {
		this.dealInfo = dealInfo;
	}

	public Downpayment getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(Downpayment downPayment) {
		this.downPayment = downPayment;
	}

}
