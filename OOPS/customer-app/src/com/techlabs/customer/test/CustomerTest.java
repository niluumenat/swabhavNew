package com.techlabs.customer.test;

import com.techlabs.customer.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer("nilam", "menat");
		Customer c2 = new Customer("heta", "desai");
		System.out.println(c1.getId());
		System.out.println(c2.getId());
		Customer c3 = new Customer("abc", "xyz");
		System.out.println(c3.getId());
		System.out.println(c1);
		System.out.println(c1.toString());
		
	}

}
