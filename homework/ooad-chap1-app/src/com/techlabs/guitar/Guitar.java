package com.techlabs.guitar;

public class Guitar {
	private String serialNo;
	private double price;
	private GuitarSpec spec;
	public Guitar(String serialNo, double price, GuitarSpec spec) {
		super();
		this.serialNo = serialNo;
		this.price = price;
		this.spec = spec;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public double getPrice() {
		return price;
	}
	public GuitarSpec getSpec() {
		return spec;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	

}
