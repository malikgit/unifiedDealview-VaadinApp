package model;

public class ApplicantIncomes {

	private Double monthlyChildOrSpousalSupport;
	private String totalRentalIncome;
	private String totalEmployedOrIncome;
	private String totalOtherIncome;
	private String totalSelfEmployedIncome;
	private Double totalIncome;
	public ApplicantIncomes() {
		// TODO Auto-generated constructor stub
	}
	public Double getMonthlyChildOrSpousalSupport() {
		return monthlyChildOrSpousalSupport;
	}
	public void setMonthlyChildOrSpousalSupport(Double monthlyChildOrSpousalSupport) {
		this.monthlyChildOrSpousalSupport = monthlyChildOrSpousalSupport;
	}
	public String getTotalRentalIncome() {
		return totalRentalIncome;
	}
	public void setTotalRentalIncome(String totalRentalIncome) {
		this.totalRentalIncome = totalRentalIncome;
	}
	public String getTotalEmployedOrIncome() {
		return totalEmployedOrIncome;
	}
	public void setTotalEmployedOrIncome(String totalEmployedOrIncome) {
		this.totalEmployedOrIncome = totalEmployedOrIncome;
	}
	public String getTotalOtherIncome() {
		return totalOtherIncome;
	}
	public void setTotalOtherIncome(String totalOtherIncome) {
		this.totalOtherIncome = totalOtherIncome;
	}
	public String getTotalSelfEmployedIncome() {
		return totalSelfEmployedIncome;
	}
	public void setTotalSelfEmployedIncome(String totalSelfEmployedIncome) {
		this.totalSelfEmployedIncome = totalSelfEmployedIncome;
	}
	public Double getTotalIncome() {
		return totalIncome;
	}
	public void setTotalIncome(Double totalIncome) {
		this.totalIncome = totalIncome;
	}
	@Override
	public String toString() {
		return "ApplicantIncomes [monthlyChildOrSpousalSupport="
				+ monthlyChildOrSpousalSupport + ", totalRentalIncome="
				+ totalRentalIncome + ", totalEmployedOrIncome="
				+ totalEmployedOrIncome + ", totalOtherIncome="
				+ totalOtherIncome + ", totalSelfEmployedIncome="
				+ totalSelfEmployedIncome + ", totalIncome=" + totalIncome
				+ "]";
	}
	
	
}
