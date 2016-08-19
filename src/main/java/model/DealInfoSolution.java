package model;

public class DealInfoSolution {
	private Double purchasePrice;
	private Double commitmentFee;
	private Double downPayment;
	private Double lenderFee;
	private Double totalMortgageAmount;
	private Double brokerFees;
	private String closingDate;
	private Double totalOneTimeFees;
	private String renewalDate;

	public DealInfoSolution() {
		// TODO Auto-generated constructor stub
	}

	public DealInfoSolution(Double purchasePrice, Double commitmentFee,
			Double downPayment, Double lenderFee, Double totalMortgageAmount,
			Double brokerFees, String closingDate, Double totalOneTimeFees,
			String renewalDate) {
		super();
		this.purchasePrice = purchasePrice;
		this.commitmentFee = commitmentFee;
		this.downPayment = downPayment;
		this.lenderFee = lenderFee;
		this.totalMortgageAmount = totalMortgageAmount;
		this.brokerFees = brokerFees;
		this.closingDate = closingDate;
		this.totalOneTimeFees = totalOneTimeFees;
		this.renewalDate = renewalDate;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Double getCommitmentFee() {
		return commitmentFee;
	}

	public void setCommitmentFee(Double commitmentFee) {
		this.commitmentFee = commitmentFee;
	}

	public Double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(Double downPayment) {
		this.downPayment = downPayment;
	}

	public Double getLenderFee() {
		return lenderFee;
	}

	public void setLenderFee(Double lenderFee) {
		this.lenderFee = lenderFee;
	}

	public Double getTotalMortgageAmount() {
		return totalMortgageAmount;
	}

	public void setTotalMortgageAmount(Double totalMortgageAmount) {
		this.totalMortgageAmount = totalMortgageAmount;
	}

	public Double getBrokerFees() {
		return brokerFees;
	}

	public void setBrokerFees(Double brokerFees) {
		this.brokerFees = brokerFees;
	}

	public String getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(String closingDate) {
		this.closingDate = closingDate;
	}

	public Double getTotalOneTimeFees() {
		return totalOneTimeFees;
	}

	public void setTotalOneTimeFees(Double totalOneTimeFees) {
		this.totalOneTimeFees = totalOneTimeFees;
	}

	public String getRenewalDate() {
		return renewalDate;
	}

	public void setRenewalDate(String renewalDate) {
		this.renewalDate = renewalDate;
	}

	@Override
	public String toString() {
		return "DealInfoSolution [purchasePrice=" + purchasePrice
				+ ", commitmentFee=" + commitmentFee + ", downPayment="
				+ downPayment + ", lenderFee=" + lenderFee
				+ ", totalMortgageAmount=" + totalMortgageAmount
				+ ", brokerFees=" + brokerFees + ", closingDate=" + closingDate
				+ ", totalOneTimeFees=" + totalOneTimeFees + ", renewalDate="
				+ renewalDate + "]";
	}

}
