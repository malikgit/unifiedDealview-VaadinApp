package model;

public class LenderRelated {

	private String lenderName;
	private String insurer;
	private String lenderResponse;
	private String insurerRef;
	private String lenderRef;
	private Double insurerFee;
	private String filogixRef;

	public LenderRelated() {
		// TODO Auto-generated constructor stub
	}

	public LenderRelated(String lenderName, String insurer,
			String lenderResponse, String insurerRef, String lenderRef,
			Double insurerFee, String filogixRef) {
		super();
		this.lenderName = lenderName;
		this.insurer = insurer;
		this.lenderResponse = lenderResponse;
		this.insurerRef = insurerRef;
		this.lenderRef = lenderRef;
		this.insurerFee = insurerFee;
		this.filogixRef = filogixRef;
	}

	public String getLenderName() {
		return lenderName;
	}

	public void setLenderName(String lenderName) {
		this.lenderName = lenderName;
	}

	public String getInsurer() {
		return insurer;
	}

	public void setInsurer(String insurer) {
		this.insurer = insurer;
	}

	public String getLenderResponse() {
		return lenderResponse;
	}

	public void setLenderResponse(String lenderResponse) {
		this.lenderResponse = lenderResponse;
	}

	public String getInsurerRef() {
		return insurerRef;
	}

	public void setInsurerRef(String insurerRef) {
		this.insurerRef = insurerRef;
	}

	public String getLenderRef() {
		return lenderRef;
	}

	public void setLenderRef(String lenderRef) {
		this.lenderRef = lenderRef;
	}

	public Double getInsurerFee() {
		return insurerFee;
	}

	public void setInsurerFee(Double insurerFee) {
		this.insurerFee = insurerFee;
	}

	public String getFilogixRef() {
		return filogixRef;
	}

	public void setFilogixRef(String filogixRef) {
		this.filogixRef = filogixRef;
	}

	@Override
	public String toString() {
		return "LenderRelated [lenderName=" + lenderName + ", insurer="
				+ insurer + ", lenderResponse=" + lenderResponse
				+ ", insurerRef=" + insurerRef + ", lenderRef=" + lenderRef
				+ ", insurerFee=" + insurerFee + ", filogixRef=" + filogixRef
				+ "]";
	}

}
