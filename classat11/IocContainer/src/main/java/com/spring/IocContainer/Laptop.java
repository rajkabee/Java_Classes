package com.spring.IocContainer;

public class Laptop {
	int lId;
	String brand;
	String model;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int lId, String brand, String model) {
		super();
		this.lId = lId;
		this.brand = brand;
		this.model = model;
	}
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", brand=" + brand + ", model=" + model + "]";
	}
	
}
