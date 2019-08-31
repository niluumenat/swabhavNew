package com.techlabs.chapter5;

public abstract class Instrument {
	private String serialNo;
	private double price;
	private InstrumentSpec spec;
	public Instrument(String serialNo, double price, InstrumentSpec spec) {
		super();
		this.serialNo = serialNo;
		this.price = price;
		this.spec = spec;
	}
	
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public InstrumentSpec getSpec() {
		return spec;
	}
	
	
	
	

}
