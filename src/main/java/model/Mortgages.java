package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mortgages {
	
	private String name;
	private String interest_rate;
	private String balance;
	private String monthly_payment;
	private String type;
	private String renewal;
	private Integer monthly_rent;
	private Integer pay_off;
	private Boolean selling;
	private String property_id;

	public Mortgages() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInterest_rate() {
		return interest_rate;
	}

	public void setInterest_rate(String interest_rate) {
		this.interest_rate = interest_rate;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getMonthly_payment() {
		return monthly_payment;
	}

	public void setMonthly_payment(String monthly_payment) {
		this.monthly_payment = monthly_payment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRenewal() {
		return renewal;
	}

	public void setRenewal(String renewal) {
		this.renewal = renewal;
	}

	public Integer getMonthly_rent() {
		return monthly_rent;
	}

	public void setMonthly_rent(Integer monthly_rent) {
		this.monthly_rent = monthly_rent;
	}

	public Integer getPay_off() {
		return pay_off;
	}

	public void setPay_off(Integer pay_off) {
		this.pay_off = pay_off;
	}

	public Boolean getSelling() {
		return selling;
	}

	public void setSelling(Boolean selling) {
		this.selling = selling;
	}

	public String getProperty_id() {
		return property_id;
	}

	public void setProperty_id(String property_id) {
		this.property_id = property_id;
	}

	@Override
	public String toString() {
		return "Mortgages [name=" + name + ", interest_rate=" + interest_rate
				+ ", balance=" + balance + ", monthly_payment="
				+ monthly_payment + ", type=" + type + ", renewal=" + renewal
				+ ", monthly_rent=" + monthly_rent + ", pay_off=" + pay_off
				+ ", selling=" + selling + ", property_id=" + property_id + "]";
	}

}
