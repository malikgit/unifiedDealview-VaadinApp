package model;

public class DealInfo {

	private String leadingGoal;
	private Double propertyValue;
	private String lookingFor;
	private Double desiredMortgageAmount;
	private String desiredMortgageType;
	private Integer desiredAmortization;
	private String desiredTerm;
	private String cofDate;
	private String expClosingDate;

	public DealInfo() {
		// TODO Auto-generated constructor stub
	}

	public DealInfo(String leadingGoal, Double propertyValue,
			String lookingFor, Double desiredMortgageAmount,
			String desiredMortgageType, Integer desiredAmortization,
			String desiredTerm, String cofDate, String expClosingDate) {
		super();
		this.leadingGoal = leadingGoal;
		this.propertyValue = propertyValue;
		this.lookingFor = lookingFor;
		this.desiredMortgageAmount = desiredMortgageAmount;
		this.desiredMortgageType = desiredMortgageType;
		this.desiredAmortization = desiredAmortization;
		this.desiredTerm = desiredTerm;
		this.cofDate = cofDate;
		this.expClosingDate = expClosingDate;
	}

	public String getLeadingGoal() {
		return leadingGoal;
	}

	public void setLeadingGoal(String leadingGoal) {
		this.leadingGoal = leadingGoal;
	}

	public Double getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(Double propertyValue) {
		this.propertyValue = propertyValue;
	}

	public String getLookingFor() {
		return lookingFor;
	}

	public void setLookingFor(String lookingFor) {
		this.lookingFor = lookingFor;
	}

	public Double getDesiredMortgageAmount() {
		return desiredMortgageAmount;
	}

	public void setDesiredMortgageAmount(Double desiredMortgageAmount) {
		this.desiredMortgageAmount = desiredMortgageAmount;
	}

	public String getDesiredMortgageType() {
		return desiredMortgageType;
	}

	public void setDesiredMortgageType(String desiredMortgageType) {
		this.desiredMortgageType = desiredMortgageType;
	}

	public Integer getDesiredAmortization() {
		return desiredAmortization;
	}

	public void setDesiredAmortization(Integer desiredAmortization) {
		this.desiredAmortization = desiredAmortization;
	}

	public String getDesiredTerm() {
		return desiredTerm;
	}

	public void setDesiredTerm(String desiredTerm) {
		this.desiredTerm = desiredTerm;
	}

	public String getCofDate() {
		return cofDate;
	}

	public void setCofDate(String cofDate) {
		this.cofDate = cofDate;
	}

	public String getExpClosingDate() {
		return expClosingDate;
	}

	public void setExpClosingDate(String expClosingDate) {
		this.expClosingDate = expClosingDate;
	}

	@Override
	public String toString() {
		return "DealInfo [leadingGoal=" + leadingGoal + ", propertyValue="
				+ propertyValue + ", lookingFor=" + lookingFor
				+ ", desiredMortgageAmount=" + desiredMortgageAmount
				+ ", desiredMortgageType=" + desiredMortgageType
				+ ", desiredAmortization=" + desiredAmortization
				+ ", desiredTerm=" + desiredTerm + ", cofDate=" + cofDate
				+ ", expClosingDate=" + expClosingDate + ", getLeadingGoal()="
				+ getLeadingGoal() + ", getPropertyValue()="
				+ getPropertyValue() + ", getLookingFor()=" + getLookingFor()
				+ ", getDesiredMortgageAmount()=" + getDesiredMortgageAmount()
				+ ", getDesiredMortgageType()=" + getDesiredMortgageType()
				+ ", getDesiredAmortization()=" + getDesiredAmortization()
				+ ", getDesiredTerm()=" + getDesiredTerm() + ", getCofDate()="
				+ getCofDate() + ", getExpClosingDate()=" + getExpClosingDate()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
