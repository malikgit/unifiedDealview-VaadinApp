package model;

public class PropertyInfo {

	private String propertyStyle;
	private Integer age;
	private String propertyType;
	private String heating;
	private String apartmentStyle;
	private String water;
	private Integer squareFootage;
	private String sewage;
	private Double propertyTaxes;
	private Double ofAcres;
	private Double condoFees;
	private String lotSize;
	private String livingInProperty;
	private String garageType;
	private String renterPayHeating;
	private String garazeSize;
	private Double monthlyRentalIncome;
	private Double outbuildingsValue;

	public PropertyInfo() {
	}

	public PropertyInfo(String propertyStyle, Integer age, String propertyType,
			String heating, String apartmentStyle, String water,
			Integer squareFootage, String sewage, Double propertyTaxes,
			Double ofAcres, Double condoFees, String lotSize,
			String livingInProperty, String garageType,
			String renterPayHeating, String garazeSize,
			Double monthlyRentalIncome, Double outbuildingsValue) {
		super();
		this.propertyStyle = propertyStyle;
		this.age = age;
		this.propertyType = propertyType;
		this.heating = heating;
		this.apartmentStyle = apartmentStyle;
		this.water = water;
		this.squareFootage = squareFootage;
		this.sewage = sewage;
		this.propertyTaxes = propertyTaxes;
		this.ofAcres = ofAcres;
		this.condoFees = condoFees;
		this.lotSize = lotSize;
		this.livingInProperty = livingInProperty;
		this.garageType = garageType;
		this.renterPayHeating = renterPayHeating;
		this.garazeSize = garazeSize;
		this.monthlyRentalIncome = monthlyRentalIncome;
		this.outbuildingsValue = outbuildingsValue;
	}

	public String getPropertyStyle() {
		return propertyStyle;
	}

	public void setPropertyStyle(String propertyStyle) {
		this.propertyStyle = propertyStyle;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getHeating() {
		return heating;
	}

	public void setHeating(String heating) {
		this.heating = heating;
	}

	public String getApartmentStyle() {
		return apartmentStyle;
	}

	public void setApartmentStyle(String apartmentStyle) {
		this.apartmentStyle = apartmentStyle;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public Integer getSquareFootage() {
		return squareFootage;
	}

	public void setSquareFootage(Integer squareFootage) {
		this.squareFootage = squareFootage;
	}

	public String getSewage() {
		return sewage;
	}

	public void setSewage(String sewage) {
		this.sewage = sewage;
	}

	public Double getPropertyTaxes() {
		return propertyTaxes;
	}

	public void setPropertyTaxes(Double propertyTaxes) {
		this.propertyTaxes = propertyTaxes;
	}

	public Double getOfAcres() {
		return ofAcres;
	}

	public void setOfAcres(Double ofAcres) {
		this.ofAcres = ofAcres;
	}

	public Double getCondoFees() {
		return condoFees;
	}

	public void setCondoFees(Double condoFees) {
		this.condoFees = condoFees;
	}

	public String getLotSize() {
		return lotSize;
	}

	public void setLotSize(String lotSize) {
		this.lotSize = lotSize;
	}

	public String getLivingInProperty() {
		return livingInProperty;
	}

	public void setLivingInProperty(String livingInProperty) {
		this.livingInProperty = livingInProperty;
	}

	public String getGarageType() {
		return garageType;
	}

	public void setGarageType(String garageType) {
		this.garageType = garageType;
	}

	public String getRenterPayHeating() {
		return renterPayHeating;
	}

	public void setRenterPayHeating(String renterPayHeating) {
		this.renterPayHeating = renterPayHeating;
	}

	public String getGarazeSize() {
		return garazeSize;
	}

	public void setGarazeSize(String garazeSize) {
		this.garazeSize = garazeSize;
	}

	public Double getMonthlyRentalIncome() {
		return monthlyRentalIncome;
	}

	public void setMonthlyRentalIncome(Double monthlyRentalIncome) {
		this.monthlyRentalIncome = monthlyRentalIncome;
	}

	public Double getOutbuildingsValue() {
		return outbuildingsValue;
	}

	public void setOutbuildingsValue(Double outbuildingsValue) {
		this.outbuildingsValue = outbuildingsValue;
	}

	@Override
	public String toString() {
		return "PropertyInfo [propertyStyle=" + propertyStyle + ", age=" + age
				+ ", propertyType=" + propertyType + ", heating=" + heating
				+ ", apartmentStyle=" + apartmentStyle + ", water=" + water
				+ ", squareFootage=" + squareFootage + ", sewage=" + sewage
				+ ", propertyTaxes=" + propertyTaxes + ", ofAcres=" + ofAcres
				+ ", condoFees=" + condoFees + ", lotSize=" + lotSize
				+ ", livingInProperty=" + livingInProperty + ", garageType="
				+ garageType + ", renterPayHeating=" + renterPayHeating
				+ ", garazeSize=" + garazeSize + ", monthlyRentalIncome="
				+ monthlyRentalIncome + ", outbuildingsValue="
				+ outbuildingsValue + "]";
	}

}
