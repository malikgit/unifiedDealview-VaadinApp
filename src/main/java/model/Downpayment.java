package model;

public class Downpayment {
	private Double downPaymentAmount;
	private Double borrowed;
	private String downPaymentComingFrom;
	private String sourceOfBorrowing;
	private String bankAcChequingSaving;
	private Double saleOfExisting;
	private Double personalCash;
	private Double sweatEquity;
	private Double rrsp;
	private Double secondaryFinancing;
	private Double gifted;
	private Double otherVendorTakeBack;
	private Double existingEquity;

	public Downpayment() {

	}

	public Downpayment(Double downPaymentAmount, Double borrowed,
			String downPaymentComingFrom, String sourceOfBorrowing,
			String bankAcChequingSaving, Double saleOfExisting,
			Double personalCash, Double sweatEquity, Double rrsp,
			Double secondaryFinancing, Double gifted,
			Double otherVendorTakeBack, Double existingEquity) {
		super();
		this.downPaymentAmount = downPaymentAmount;
		this.borrowed = borrowed;
		this.downPaymentComingFrom = downPaymentComingFrom;
		this.sourceOfBorrowing=sourceOfBorrowing;
		this.bankAcChequingSaving = bankAcChequingSaving;
		this.saleOfExisting = saleOfExisting;
		this.personalCash = personalCash;
		this.sweatEquity = sweatEquity;
		this.rrsp = rrsp;
		this.secondaryFinancing = secondaryFinancing;
		this.gifted = gifted;
		this.otherVendorTakeBack = otherVendorTakeBack;
		this.existingEquity = existingEquity;
	}

	public Double getDownPaymentAmount() {
		return downPaymentAmount;
	}

	public void setDownPaymentAmount(Double downPaymentAmount) {
		this.downPaymentAmount = downPaymentAmount;
	}

	public Double getBorrowed() {
		return borrowed;
	}

	public void setBorrowed(Double borrowed) {
		this.borrowed = borrowed;
	}

	public String getDownPaymentComingFrom() {
		return downPaymentComingFrom;
	}

	public void setDownPaymentComingFrom(String downPaymentComingFrom) {
		this.downPaymentComingFrom = downPaymentComingFrom;
	}
	public String getBankAcChequingSaving() {
		return bankAcChequingSaving;
	}

	public void setBankAcChequingSaving(String bankAcChequingSaving) {
		this.bankAcChequingSaving = bankAcChequingSaving;
	}

	public Double getSaleOfExisting() {
		return saleOfExisting;
	}

	public void setSaleOfExisting(Double saleOfExisting) {
		this.saleOfExisting = saleOfExisting;
	}

	public Double getPersonalCash() {
		return personalCash;
	}

	public void setPersonalCash(Double personalCash) {
		this.personalCash = personalCash;
	}

	public Double getSweatEquity() {
		return sweatEquity;
	}

	public void setSweatEquity(Double sweatEquity) {
		this.sweatEquity = sweatEquity;
	}

	public Double getRrsp() {
		return rrsp;
	}

	public void setRrsp(Double rrsp) {
		this.rrsp = rrsp;
	}

	public Double getSecondaryFinancing() {
		return secondaryFinancing;
	}

	public void setSecondaryFinancing(Double secondaryFinancing) {
		this.secondaryFinancing = secondaryFinancing;
	}

	public Double getGifted() {
		return gifted;
	}

	public void setGifted(Double gifted) {
		this.gifted = gifted;
	}

	public Double getOtherVendorTakeBack() {
		return otherVendorTakeBack;
	}

	public void setOtherVendorTakeBack(Double otherVendorTakeBack) {
		this.otherVendorTakeBack = otherVendorTakeBack;
	}

	public Double getExistingEquity() {
		return existingEquity;
	}

	public void setExistingEquity(Double existingEquity) {
		this.existingEquity = existingEquity;
	}

	public String getSourceOfBorrowing() {
		return sourceOfBorrowing;
	}

	public void setSourceOfBorrowing(String sourceOfBorrowing) {
		this.sourceOfBorrowing = sourceOfBorrowing;
	}
}
