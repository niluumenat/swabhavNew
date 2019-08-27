package com.techlabs.cart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private int id;
	private Date date;
	private List<LineItem> items=new ArrayList<LineItem>();
	
	public Order(int id, Date date) {
		super();
		this.id = id;
		this.date = date;
	}
	public void addItem(LineItem lineitem){
		items.add(lineitem);
	}
	
	public double checkOutPrice(){
		double totalCost = 0;
		for(LineItem item:items){
			totalCost=totalCost+item.calculateItemCost();
		}
		return totalCost;
	}
	
	public int getId() {
		return id;
	}
	public Date getDate() {
		return date;
	}
	
	public List<LineItem> getItem() {
		return items;
	}
	
	
	

}
