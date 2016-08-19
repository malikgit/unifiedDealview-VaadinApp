package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {
	private String name;
	private Double value;
	private Integer owed;
	private Integer annual_tax;
	private Integer mo_condo_fees;
	private String property_id;
	private Boolean selling;

	public Properties() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Integer getOwed() {
		return owed;
	}

	public void setOwed(Integer owed) {
		this.owed = owed;
	}

	public Integer getAnnual_tax() {
		return annual_tax;
	}

	public void setAnnual_tax(Integer annual_tax) {
		this.annual_tax = annual_tax;
	}

	public Integer getMo_condo_fees() {
		return mo_condo_fees;
	}

	public void setMo_condo_fees(Integer mo_condo_fees) {
		this.mo_condo_fees = mo_condo_fees;
	}

	public String getProperty_id() {
		return property_id;
	}

	public void setProperty_id(String property_id) {
		this.property_id = property_id;
	}

	public Boolean getSelling() {
		return selling;
	}

	public void setSelling(Boolean selling) {
		this.selling = selling;
	}

	@Override
	public String toString() {
		return "Properties [name=" + name + ", value=" + value + ", owed="
				+ owed + ", annual_tax=" + annual_tax + ", mo_condo_fees="
				+ mo_condo_fees + ", property_id=" + property_id + ", selling="
				+ selling + "]";
	}

}
