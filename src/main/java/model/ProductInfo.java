package model;

public class ProductInfo {

	private String productName;
	private String amortization;
	private Double rateInPercentage;
	private String plusMinusPrime;
	private String mortgageType;
	private String term;
	private String openClosed;
	private String frequency;
	private Double payment;
	private Integer cashback;

	public ProductInfo() {
		// TODO Auto-generated constructor stub
	}

	public ProductInfo(String productName, String amortization,
			Double rateInPercentage, String plusMinusPrime,
			String mortgageType, String term, String openClosed,
			String frequency, Double payment, Integer cashback) {
		super();
		this.productName = productName;
		this.amortization = amortization;
		this.rateInPercentage = rateInPercentage;
		this.plusMinusPrime = plusMinusPrime;
		this.mortgageType = mortgageType;
		this.term = term;
		this.openClosed = openClosed;
		this.frequency = frequency;
		this.payment = payment;
		this.cashback = cashback;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getAmortization() {
		return amortization;
	}

	public void setAmortization(String amortization) {
		this.amortization = amortization;
	}

	public Double getRateInPercentage() {
		return rateInPercentage;
	}

	public void setRateInPercentage(Double rateInPercentage) {
		this.rateInPercentage = rateInPercentage;
	}

	public String getPlusMinusPrime() {
		return plusMinusPrime;
	}

	public void setPlusMinusPrime(String plusMinusPrime) {
		this.plusMinusPrime = plusMinusPrime;
	}

	public String getMortgageType() {
		return mortgageType;
	}

	public void setMortgageType(String mortgageType) {
		this.mortgageType = mortgageType;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getOpenClosed() {
		return openClosed;
	}

	public void setOpenClosed(String openClosed) {
		this.openClosed = openClosed;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

	public Integer getCashback() {
		return cashback;
	}

	public void setCashback(Integer cashback) {
		this.cashback = cashback;
	}

	@Override
	public String toString() {
		return "ProductInfo [productName=" + productName + ", amortization="
				+ amortization + ", rateInPercentage=" + rateInPercentage
				+ ", plusMinusPrime=" + plusMinusPrime + ", mortgageType="
				+ mortgageType + ", term=" + term + ", openClosed="
				+ openClosed + ", frequency=" + frequency + ", payment="
				+ payment + ", cashback=" + cashback + "]";
	}

}
