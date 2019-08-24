package com.techlabs.lineitem;

public class LineItem {
	private String id;
	private String name;
	private double cost;
	private int quantity;
	public LineItem(String id, String name, double cost, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
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
	public int getQuantity() {
		return quantity;
	}
	
	public double calTotalCost(){
		double totalCost=quantity*cost;
		return totalCost;
		
	}

}
