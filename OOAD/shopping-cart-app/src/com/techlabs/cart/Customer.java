package com.techlabs.cart;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int id;
	private String name;
	private List<Order> orders=new ArrayList<Order>();
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void addOrders(Order order){
		orders.add(order);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {
		return orders;
	}
	
	
	
	
	

}
