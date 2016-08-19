package model;

public class CurrentSituation {
	private String currentLender;
	private Double currentInterestRate;
	private Double currentMortgageAmount;
	private Double rate;
	private Double currentMonthlyPayment;
	private String currentRenewalDate;
	private String existingPayoutPenalty;
	private String currentMortgageType;

	public CurrentSituation() {
		// TODO Auto-generated constructor stub
	}

	public CurrentSituation(String currentLender, Double currentInterestRate,
			Double currentMortgageAmount, Double rate,
			Double currentMonthlyPayment, String currentRenewalDate,
			String existingPayoutPenalty, String currentMortgageType) {
		super();
		this.currentLender = currentLender;
		this.currentInterestRate = currentInterestRate;
		this.currentMortgageAmount = currentMortgageAmount;
		this.rate = rate;
		this.currentMonthlyPayment = currentMonthlyPayment;
		this.currentRenewalDate = currentRenewalDate;
		this.existingPayoutPenalty = existingPayoutPenalty;
		this.currentMortgageType = currentMortgageType;
	}

	public String getCurrentLender() {
		return currentLender;
	}

	public void setCurrentLender(String currentLender) {
		this.currentLender = currentLender;
	}

	public Double getCurrentInterestRate() {
		return currentInterestRate;
	}

	public void setCurrentInterestRate(Double currentInterestRate) {
		this.currentInterestRate = currentInterestRate;
	}

	public Double getCurrentMortgageAmount() {
		return currentMortgageAmount;
	}

	public void setCurrentMortgageAmount(Double currentMortgageAmount) {
		this.currentMortgageAmount = currentMortgageAmount;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getCurrentMonthlyPayment() {
		return currentMonthlyPayment;
	}

	public void setCurrentMonthlyPayment(Double currentMonthlyPayment) {
		this.currentMonthlyPayment = currentMonthlyPayment;
	}

	public String getCurrentRenewalDate() {
		return currentRenewalDate;
	}

	public void setCurrentRenewalDate(String currentRenewalDate) {
		this.currentRenewalDate = currentRenewalDate;
	}

	public String getExistingPayoutPenalty() {
		return existingPayoutPenalty;
	}

	public void setExistingPayoutPenalty(String existingPayoutPenalty) {
		this.existingPayoutPenalty = existingPayoutPenalty;
	}

	public String getCurrentMortgageType() {
		return currentMortgageType;
	}

	public void setCurrentMortgageType(String currentMortgageType) {
		this.currentMortgageType = currentMortgageType;
	}

	@Override
	public String toString() {
		return "CurrentSituation [currentLender=" + currentLender
				+ ", currentInterestRate=" + currentInterestRate
				+ ", currentMortgageAmount=" + currentMortgageAmount
				+ ", rate=" + rate + ", currentMonthlyPayment="
				+ currentMonthlyPayment + ", currentRenewalDate="
				+ currentRenewalDate + ", existingPayoutPenalty="
				+ existingPayoutPenalty + ", currentMortgageType="
				+ currentMortgageType + "]";
	}

}
