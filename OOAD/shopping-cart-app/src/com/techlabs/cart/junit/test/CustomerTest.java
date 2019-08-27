package com.techlabs.cart.junit.test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;

import com.techlabs.cart.Customer;
import com.techlabs.cart.Order;

public class CustomerTest {
	Date date = java.util.Calendar.getInstance().getTime();
	Order order=new Order(101, date);
	Customer customer=new Customer(500, "Nilam");

	@Test
	public void checkGetter(){
		int id=500;
		assertTrue(id==customer.getId());
	}
	
	public void checkAddOrderMethod(){
		int id=101;
		customer.addOrders(order);
		assertTrue(order.getId()==id);

	}
	
	

}
