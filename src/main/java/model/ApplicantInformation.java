package model;

import java.util.Date;

public class ApplicantInformation {

	private String firstName;
	private Date dob;
	private String lastName;
	private String socialInsurance;
	private String email;
	private String passportNonRes;
	private String cell;

	private Boolean nonResident;
	private String work;
	private Date immigrationDate;
	private String home;
	private String relationshipStatus;
	private String bestNumber;

	public ApplicantInformation() {
		// TODO Auto-generated constructor stub
	}

	public ApplicantInformation(String firstName, Date dob, String lastName,
			String socialInsurance, String email, String passportNonRes,
			String cell, Boolean nonResident, String work,
			Date immigrationDate, String home, String relationshipStatus,
			String bestNumber) {
		super();
		this.firstName = firstName;
		this.dob = dob;
		this.lastName = lastName;
		this.socialInsurance = socialInsurance;
		this.email = email;
		this.passportNonRes = passportNonRes;
		this.cell = cell;
		this.nonResident = nonResident;
		this.work = work;
		this.immigrationDate = immigrationDate;
		this.home = home;
		this.relationshipStatus = relationshipStatus;
		this.bestNumber = bestNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialInsurance() {
		return socialInsurance;
	}

	public void setSocialInsurance(String socialInsurance) {
		this.socialInsurance = socialInsurance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassportNonRes() {
		return passportNonRes;
	}

	public void setPassportNonRes(String passportNonRes) {
		this.passportNonRes = passportNonRes;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public Boolean getNonResident() {
		return nonResident;
	}

	public void setNonResident(Boolean nonResident) {
		this.nonResident = nonResident;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Date getImmigrationDate() {
		return immigrationDate;
	}

	public void setImmigrationDate(Date immigrationDate) {
		this.immigrationDate = immigrationDate;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	public String getBestNumber() {
		return bestNumber;
	}

	public void setBestNumber(String bestNumber) {
		this.bestNumber = bestNumber;
	}

	@Override
	public String toString() {
		return "ApplicantInformation [firstName=" + firstName + ", dob=" + dob
				+ ", lastName=" + lastName + ", socialInsurance="
				+ socialInsurance + ", email=" + email + ", passportNonRes="
				+ passportNonRes + ", cell=" + cell + ", nonResident="
				+ nonResident + ", work=" + work + ", immigrationDate="
				+ immigrationDate + ", home=" + home + ", relationshipStatus="
				+ relationshipStatus + ", bestNumber=" + bestNumber + "]";
	}

}
