package model;

import java.util.Date;

public class CreditLiabilities {

	private Integer beacon5Store;
	private Boolean orderlyDebtPayment;
	private Boolean bankruptcy;
	private Date odpDischargeDate;
	private Date bankruptyDischarge;
	private Double monthlySupportPayment;

	public CreditLiabilities() {
		// TODO Auto-generated constructor stub
	}

	public Integer getBeacon5Store() {
		return beacon5Store;
	}

	public void setBeacon5Store(Integer beacon5Store) {
		this.beacon5Store = beacon5Store;
	}

	public Boolean getOrderlyDebtPayment() {
		return orderlyDebtPayment;
	}

	public void setOrderlyDebtPayment(Boolean orderlyDebtPayment) {
		this.orderlyDebtPayment = orderlyDebtPayment;
	}

	public Boolean getBankruptcy() {
		return bankruptcy;
	}

	public void setBankruptcy(Boolean bankruptcy) {
		this.bankruptcy = bankruptcy;
	}

	public Date getOdpDischargeDate() {
		return odpDischargeDate;
	}

	public void setOdpDischargeDate(Date odpDischargeDate) {
		this.odpDischargeDate = odpDischargeDate;
	}

	public Date getBankruptyDischarge() {
		return bankruptyDischarge;
	}

	public void setBankruptyDischarge(Date bankruptyDischarge) {
		this.bankruptyDischarge = bankruptyDischarge;
	}

	public Double getMonthlySupportPayment() {
		return monthlySupportPayment;
	}

	public void setMonthlySupportPayment(Double monthlySupportPayment) {
		this.monthlySupportPayment = monthlySupportPayment;
	}

	@Override
	public String toString() {
		return "CreditLiabilities [beacon5Store=" + beacon5Store
				+ ", orderlyDebtPayment=" + orderlyDebtPayment
				+ ", bankruptcy=" + bankruptcy + ", odpDischargeDate="
				+ odpDischargeDate + ", bankruptyDischarge="
				+ bankruptyDischarge + ", monthlySupportPayment="
				+ monthlySupportPayment + "]";
	}

}
