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
	Customer customer=new Customer(504, "Nilam");
	Customer customer1=new Customer(505, "Heta");

	@Test
	public void checkGetter(){
		int id=505;
		assertTrue(id==customer1.getId());
	}
	
	public void checkAddOrderMethod(){
		int id=101;
		customer1.addOrders(order);
		assertTrue(order.getId()==id);
	}
	
	
	
	

}
