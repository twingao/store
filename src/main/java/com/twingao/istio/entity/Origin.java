package com.twingao.istio.entity;

public class Origin {

	private String version;
	private String country;
	private String province;
	private String city;
	
	public Origin(String version, String country, String province, String city) {

		this.version = version;
		this.country = country;
		this.province = province;
		this.city = city;
	}

	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Origin [version=" + version + ", country=" + country + ", province=" + province + ", city=" + city
				+ "]";
	}
}