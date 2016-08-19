package model;

public class DealConfig {

	private Double combinedBaseLTV;
	private Double renovationValue;
	private String chargeOnTitle;
	private String buildingFunds;
	
	private Boolean hasChargesBehind;
	private Integer drawsRequired;
	private Double chargesBehindAmount;
	private String lookingTo;
	
	private Integer maxRefinanceAmnt;
	private Boolean nonIncomQualifier;
	private Boolean lenderRequirInsuran;
	private String needsPowerOfAttorney;
	
	public DealConfig() {
		// TODO Auto-generated constructor stub
	}

	public DealConfig(Double combinedBaseLTV, Double renovationValue,
			String chargeOnTitle, String buildingFunds,
			Boolean hasChargesBehind, Integer drawsRequired,
			Double chargesBehindAmount, String lookingTo,
			Integer maxRefinanceAmnt, Boolean nonIncomQualifier,
			Boolean lenderRequirInsuran, String needsPowerOfAttorney) {
		super();
		this.combinedBaseLTV = combinedBaseLTV;
		this.renovationValue = renovationValue;
		this.chargeOnTitle = chargeOnTitle;
		this.buildingFunds = buildingFunds;
		this.hasChargesBehind = hasChargesBehind;
		this.drawsRequired = drawsRequired;
		this.chargesBehindAmount = chargesBehindAmount;
		this.lookingTo = lookingTo;
		this.maxRefinanceAmnt = maxRefinanceAmnt;
		this.nonIncomQualifier = nonIncomQualifier;
		this.lenderRequirInsuran = lenderRequirInsuran;
		this.needsPowerOfAttorney = needsPowerOfAttorney;
	}

	public Double getCombinedBaseLTV() {
		return combinedBaseLTV;
	}

	public void setCombinedBaseLTV(Double combinedBaseLTV) {
		this.combinedBaseLTV = combinedBaseLTV;
	}

	public Double getRenovationValue() {
		return renovationValue;
	}

	public void setRenovationValue(Double renovationValue) {
		this.renovationValue = renovationValue;
	}

	public String getChargeOnTitle() {
		return chargeOnTitle;
	}

	public void setChargeOnTitle(String chargeOnTitle) {
		this.chargeOnTitle = chargeOnTitle;
	}

	public String getBuildingFunds() {
		return buildingFunds;
	}

	public void setBuildingFunds(String buildingFunds) {
		this.buildingFunds = buildingFunds;
	}

	public Boolean getHasChargesBehind() {
		return hasChargesBehind;
	}

	public void setHasChargesBehind(Boolean hasChargesBehind) {
		this.hasChargesBehind = hasChargesBehind;
	}

	public Integer getDrawsRequired() {
		return drawsRequired;
	}

	public void setDrawsRequired(Integer drawsRequired) {
		this.drawsRequired = drawsRequired;
	}

	public Double getChargesBehindAmount() {
		return chargesBehindAmount;
	}

	public void setChargesBehindAmount(Double chargesBehindAmount) {
		this.chargesBehindAmount = chargesBehindAmount;
	}

	public String getLookingTo() {
		return lookingTo;
	}

	public void setLookingTo(String lookingTo) {
		this.lookingTo = lookingTo;
	}

	public Integer getMaxRefinanceAmnt() {
		return maxRefinanceAmnt;
	}

	public void setMaxRefinanceAmnt(Integer maxRefinanceAmnt) {
		this.maxRefinanceAmnt = maxRefinanceAmnt;
	}

	public Boolean getNonIncomQualifier() {
		return nonIncomQualifier;
	}

	public void setNonIncomQualifier(Boolean nonIncomQualifier) {
		this.nonIncomQualifier = nonIncomQualifier;
	}

	public Boolean getLenderRequirInsuran() {
		return lenderRequirInsuran;
	}

	public void setLenderRequirInsuran(Boolean lenderRequirInsuran) {
		this.lenderRequirInsuran = lenderRequirInsuran;
	}

	public String getNeedsPowerOfAttorney() {
		return needsPowerOfAttorney;
	}

	public void setNeedsPowerOfAttorney(String needsPowerOfAttorney) {
		this.needsPowerOfAttorney = needsPowerOfAttorney;
	}

	@Override
	public String toString() {
		return "DealConfig [combinedBaseLTV=" + combinedBaseLTV
				+ ", renovationValue=" + renovationValue + ", chargeOnTitle="
				+ chargeOnTitle + ", buildingFunds=" + buildingFunds
				+ ", hasChargesBehind=" + hasChargesBehind + ", drawsRequired="
				+ drawsRequired + ", chargesBehindAmount="
				+ chargesBehindAmount + ", lookingTo=" + lookingTo
				+ ", maxRefinanceAmnt=" + maxRefinanceAmnt
				+ ", nonIncomQualifier=" + nonIncomQualifier
				+ ", lenderRequirInsuran=" + lenderRequirInsuran
				+ ", needsPowerOfAttorney=" + needsPowerOfAttorney
				+ ", getCombinedBaseLTV()=" + getCombinedBaseLTV()
				+ ", getRenovationValue()=" + getRenovationValue()
				+ ", getChargeOnTitle()=" + getChargeOnTitle()
				+ ", getBuildingFunds()=" + getBuildingFunds()
				+ ", getHasChargesBehind()=" + getHasChargesBehind()
				+ ", getDrawsRequired()=" + getDrawsRequired()
				+ ", getChargesBehindAmount()=" + getChargesBehindAmount()
				+ ", getLookingTo()=" + getLookingTo()
				+ ", getMaxRefinanceAmnt()=" + getMaxRefinanceAmnt()
				+ ", getNonIncomQualifier()=" + getNonIncomQualifier()
				+ ", getLenderRequirInsuran()=" + getLenderRequirInsuran()
				+ ", getNeedsPowerOfAttorney()=" + getNeedsPowerOfAttorney()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
