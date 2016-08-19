package model;

public class Suitability {

	private String job5Years; 
	private String lifeStyleChange; 
	private String incomeDecreasedWorried; 
	private String financialRiskTaker; 
	private String futureFamily; 
	private String propertyLessThan5Years; 
	private String buyNewVehicle;

	public Suitability() {
		// TODO Auto-generated constructor stub
	}

	public Suitability(String job5Years, String lifeStyleChange,
			String incomeDecreasedWorried, String financialRiskTaker,
			String futureFamily, String propertyLessThan5Years,
			String buyNewVehicle) {
		super();
		this.job5Years = job5Years;
		this.lifeStyleChange = lifeStyleChange;
		this.incomeDecreasedWorried = incomeDecreasedWorried;
		this.financialRiskTaker = financialRiskTaker;
		this.futureFamily = futureFamily;
		this.propertyLessThan5Years = propertyLessThan5Years;
		this.buyNewVehicle = buyNewVehicle;
	}

	public String getJob5Years() {
		return job5Years;
	}

	public void setJob5Years(String job5Years) {
		this.job5Years = job5Years;
	}

	public String getLifeStyleChange() {
		return lifeStyleChange;
	}

	public void setLifeStyleChange(String lifeStyleChange) {
		this.lifeStyleChange = lifeStyleChange;
	}

	public String getIncomeDecreasedWorried() {
		return incomeDecreasedWorried;
	}

	public void setIncomeDecreasedWorried(String incomeDecreasedWorried) {
		this.incomeDecreasedWorried = incomeDecreasedWorried;
	}

	public String getFinancialRiskTaker() {
		return financialRiskTaker;
	}

	public void setFinancialRiskTaker(String financialRiskTaker) {
		this.financialRiskTaker = financialRiskTaker;
	}

	public String getFutureFamily() {
		return futureFamily;
	}

	public void setFutureFamily(String futureFamily) {
		this.futureFamily = futureFamily;
	}

	public String getPropertyLessThan5Years() {
		return propertyLessThan5Years;
	}

	public void setPropertyLessThan5Years(String propertyLessThan5Years) {
		this.propertyLessThan5Years = propertyLessThan5Years;
	}

	public String getBuyNewVehicle() {
		return buyNewVehicle;
	}

	public void setBuyNewVehicle(String buyNewVehicle) {
		this.buyNewVehicle = buyNewVehicle;
	}

	@Override
	public String toString() {
		return "Suitability [job5Years=" + job5Years + ", lifeStyleChange="
				+ lifeStyleChange + ", incomeDecreasedWorried="
				+ incomeDecreasedWorried + ", financialRiskTaker="
				+ financialRiskTaker + ", futureFamily=" + futureFamily
				+ ", propertyLessThan5Years=" + propertyLessThan5Years
				+ ", buyNewVehicle=" + buyNewVehicle + ", getJob5Years()="
				+ getJob5Years() + ", getLifeStyleChange()="
				+ getLifeStyleChange() + ", getIncomeDecreasedWorried()="
				+ getIncomeDecreasedWorried() + ", getFinancialRiskTaker()="
				+ getFinancialRiskTaker() + ", getFutureFamily()="
				+ getFutureFamily() + ", getPropertyLessThan5Years()="
				+ getPropertyLessThan5Years() + ", getBuyNewVehicle()="
				+ getBuyNewVehicle() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
