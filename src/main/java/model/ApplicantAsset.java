package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicantAsset {
	private String asset_type;
	private String name;
	private Double value;

	public ApplicantAsset() {
		// TODO Auto-generated constructor stub
	}

	public String getAsset_type() {
		return asset_type;
	}

	public void setAsset_type(String asset_type) {
		this.asset_type = asset_type;
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

	@Override
	public String toString() {
		return "ApplicantAsset [asset_type=" + asset_type + ", name=" + name
				+ ", value=" + value + "]";
	}

}
