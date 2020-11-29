package com.twingao.istio.entity;

import java.time.LocalDate;

public class Detail {

	private Integer id;
	private String version;
	private String type;
	private String name;
	private Integer price;
	private LocalDate productDate;
	private Origin origin;

	public Detail(Integer id, String version, String type, String name, Integer price, LocalDate productDate) {

		this.id = id;
		this.version = version;
		this.type = type;
		this.name = name;
		this.price = price;
		this.productDate = productDate;
	}

	public Detail(Integer id, String version, String type, String name, Integer price, LocalDate productDate, Origin origin) {

		this.id = id;
		this.version = version;
		this.type = type;
		this.name = name;
		this.price = price;
		this.productDate = productDate;
		this.origin = origin;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

	public LocalDate getProductDate() {
		return productDate;
	}
	public void setProductDate(LocalDate productDate) {
		this.productDate = productDate;
	}

	public Origin getOrigin() {
		return origin;
	}
	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", version=" + version + ", type=" + type + ", name=" + name + ", price=" + price
				+ ", productDate=" + productDate + ", origin=" + origin + "]";
	}
}