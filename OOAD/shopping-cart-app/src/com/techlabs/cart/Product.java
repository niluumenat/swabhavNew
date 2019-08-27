package com.techlabs.cart;

public class Product {
	private String id;
	private String name;
	private double cost;
	private float discount;
	public Product(String id, String name, double cost, float discount) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	}
	
	public double calculateDiscountCost(){
		double cost1=(cost*(discount/100));
		return cost1;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscount() {
		return discount;
	}
	
	
}
