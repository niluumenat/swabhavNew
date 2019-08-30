package com.techlabs.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer {
	private int id;
	private String name;
	private List<Order> orders;
	//private List<Customer> customer;
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		orders=new ArrayList<Order>();
		//customer=new ArrayList<Customer>();
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
