package model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicantCollections {
	private String name;
	private Integer amount;
	private Integer balance;
	private Date date;
	private String status;
	private Integer pay_off;

	public ApplicantCollections() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPay_off() {
		return pay_off;
	}

	public void setPay_off(Integer pay_off) {
		this.pay_off = pay_off;
	}

	@Override
	public String toString() {
		return "ApplicantCollections [name=" + name + ", amount=" + amount
				+ ", balance=" + balance + ", date=" + date + ", status="
				+ status + ", pay_off=" + pay_off + "]";
	}

}
