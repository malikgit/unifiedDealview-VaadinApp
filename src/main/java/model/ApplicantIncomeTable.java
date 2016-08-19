package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicantIncomeTable {
	private String income_type;
	private String business;
	private String position;
	private String industry;
	private Double annual_income;
	private Integer month;
	private Boolean historical;
	private Boolean supplementary;
	private String property_id;

	public ApplicantIncomeTable() {
		// TODO Auto-generated constructor stub
	}

	public String getIncome_type() {
		return income_type;
	}

	public void setIncome_type(String income_type) {
		this.income_type = income_type;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public Double getAnnual_income() {
		return annual_income;
	}

	public void setAnnual_income(Double annual_income) {
		this.annual_income = annual_income;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Boolean getHistorical() {
		return historical;
	}

	public void setHistorical(Boolean historical) {
		this.historical = historical;
	}

	public Boolean getSupplementary() {
		return supplementary;
	}

	public void setSupplementary(Boolean supplementary) {
		this.supplementary = supplementary;
	}

	public String getProperty_id() {
		return property_id;
	}

	public void setProperty_id(String property_id) {
		this.property_id = property_id;
	}

	@Override
	public String toString() {
		return "ApplicantIncomeTable [income_type=" + income_type
				+ ", business=" + business + ", position=" + position
				+ ", industry=" + industry + ", annual_income=" + annual_income
				+ ", month=" + month + ", historical=" + historical
				+ ", supplementary=" + supplementary + ", property_id="
				+ property_id + "]";
	}

}
