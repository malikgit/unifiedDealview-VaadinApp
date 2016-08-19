package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Property {
	

	private String address;
	private String townshipOrPid;
	private String city;
	private String province;
	private String plan;
	private String block; 
	private String postalCode;
	private String lot;
	private String consideredCities;
	private String mls;
	private Double distanceToMajorCenter;
	private String newHomeWarranty;
	//property_id
		//@ERP( name = "property_id" )
		public String property_id;
		//selling
		public Boolean selling;

		//annual_tax
		//@ERP( name = "annual_tax" )
		public Integer annual_tax;
		public String mortgageYesNo;

		public String getMortgageYesNo() {
			return mortgageYesNo;
		}

		public void setMortgageYesNo(String mortgageYesNo) {
			this.mortgageYesNo = mortgageYesNo;
		}

		public String rentalProperty;
		public String getRentalProperty() {
			return rentalProperty;
		}

		public void setRentalProperty(String rentalProperty) {
			this.rentalProperty = rentalProperty;
		}

		//mo_condo_fees
		//@ERP( name = "mo_condo_fees" )
		public Integer mo_condo_fees;

		//name
		public String name;

		//value
		public Double value;

		//owed
		public Integer owed;

		/*********************************many2one type******************************/

		//many to one : mapping table : applicant_record(com.syml.domain.Applicant)
		//@ERP(name="applicant_id", type = OpenERPType.many2one )
		//@JsonIgnore
		public Integer applicantId;

		

		public String getProperty_id() {
			return property_id;
		}

		public void setProperty_id(String property_id) {
			this.property_id = property_id;
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

		public Boolean getSelling() {
			return selling;
		}

		public void setSelling(Boolean selling) {
			this.selling = selling;
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

		public Integer getApplicantId() {
			return applicantId;
		}

		public void setApplicantId(Integer applicantId) {
			this.applicantId = applicantId;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getTownshipOrPid() {
			return townshipOrPid;
		}

		public void setTownshipOrPid(String townshipOrPid) {
			this.townshipOrPid = townshipOrPid;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getProvince() {
			return province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getPlan() {
			return plan;
		}

		public void setPlan(String plan) {
			this.plan = plan;
		}

		public String getBlock() {
			return block;
		}

		public void setBlock(String block) {
			this.block = block;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getLot() {
			return lot;
		}

		public void setLot(String lot) {
			this.lot = lot;
		}

		public String getConsideredCities() {
			return consideredCities;
		}

		public void setConsideredCities(String consideredCities) {
			this.consideredCities = consideredCities;
		}

		public String getMls() {
			return mls;
		}

		public void setMls(String mls) {
			this.mls = mls;
		}

		public Double getDistanceToMajorCenter() {
			return distanceToMajorCenter;
		}

		public void setDistanceToMajorCenter(Double distanceToMajorCenter) {
			this.distanceToMajorCenter = distanceToMajorCenter;
		}

		public String getNewHomeWarranty() {
			return newHomeWarranty;
		}

		public void setNewHomeWarranty(String newHomeWarranty) {
			this.newHomeWarranty = newHomeWarranty;
		}

		@Override
		public String toString() {
			return "Property [address=" + address + ", townshipOrPid="
					+ townshipOrPid + ", city=" + city + ", province="
					+ province + ", plan=" + plan + ", block=" + block
					+ ", postalCode=" + postalCode + ", lot=" + lot
					+ ", consideredCities=" + consideredCities + ", mls=" + mls
					+ ", distanceToMajorCenter=" + distanceToMajorCenter
					+ ", newHomeWarranty=" + newHomeWarranty + ", property_id="
					+ property_id + ", selling=" + selling + ", annual_tax="
					+ annual_tax + ", mortgageYesNo=" + mortgageYesNo
					+ ", rentalProperty=" + rentalProperty + ", mo_condo_fees="
					+ mo_condo_fees + ", name=" + name + ", value=" + value
					+ ", owed=" + owed + ", applicantId=" + applicantId + "]";
		}

}
