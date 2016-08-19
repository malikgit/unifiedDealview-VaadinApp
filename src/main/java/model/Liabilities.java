package model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Liabilities {
	// client,business,status,creditLimit,creditBalance,payment,frequency,opened,reported,dla,type,ratingg,payOff

	private String name;
	private String business;
	private String status;
	private Double credit_limit;
	private Double credit_balance;
	private String monthly_payment;
	private Date opened;
	private Date reported;
	private Date dla;
	private String type;
	private String rating;
	private Double pay_off;

	public Liabilities() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(Double credit_limit) {
		this.credit_limit = credit_limit;
	}

	public Double getCredit_balance() {
		return credit_balance;
	}

	public void setCredit_balance(Double credit_balance) {
		this.credit_balance = credit_balance;
	}

	public String getMonthly_payment() {
		return monthly_payment;
	}

	public void setMonthly_payment(String monthly_payment) {
		this.monthly_payment = monthly_payment;
	}

	public Date getOpened() {
		return opened;
	}

	public void setOpened(Date opened) {
		this.opened = opened;
	}

	public Date getReported() {
		return reported;
	}

	public void setReported(Date reported) {
		this.reported = reported;
	}

	public Date getDla() {
		return dla;
	}

	public void setDla(Date dla) {
		this.dla = dla;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Double getPay_off() {
		return pay_off;
	}

	public void setPay_off(Double pay_off) {
		this.pay_off = pay_off;
	}

	@Override
	public String toString() {
		return "Liabilities [name=" + name + ", business=" + business
				+ ", status=" + status + ", credit_limit=" + credit_limit
				+ ", credit_balance=" + credit_balance + ", monthly_payment="
				+ monthly_payment + ", opened=" + opened + ", reported="
				+ reported + ", dla=" + dla + ", type=" + type + ", rating="
				+ rating + ", pay_off=" + pay_off + "]";
	}
 
}
