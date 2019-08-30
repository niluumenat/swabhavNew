package com.techlabs.cart;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ShoppingCartTest {
	static List<Customer> customers = new ArrayList<>();

	public static void main(String[] args) throws ParseException {
		String string = "Jan 1,2019";
		String string1 = "Feb 1,2019";
		DateFormat format = new SimpleDateFormat("MMMM d,yyyy", Locale.ENGLISH);
		Date date = format.parse(string);
		Date date1 = format.parse(string1);

		Product product = new Product("101", "books", 100, 5f);
		Product product2 = new Product("102", "pens", 50, 2f);
		Product product3 = new Product("402", "Laptop", 10000, 5f);
		Product product4 = new Product("403", "mobile", 15000, 10f);

		LineItem lineitem = new LineItem(303, 7, product);
		LineItem lineitem2 = new LineItem(304, 12, product2);
		LineItem lineitem6 = new LineItem(301, 10, product2);
		LineItem lineItem3 = new LineItem(406, 2, product3);
		LineItem lineItem4 = new LineItem(403, 1, product4);

		Order order = new Order(300, date);
		order.addItem(lineitem);
		order.addItem(lineitem2);
		order.addItem(lineitem6);

		Order order1 = new Order(305, date1);
		order1.addItem(lineItem3);
		order1.addItem(lineItem4);

		Customer customer = new Customer(501, "Nilam");
		customer.addOrders(order);
		customer.addOrders(order1);

		//Customer customer2 = new Customer(505, "Heta");
		//customer2.addOrders(order);

		customers.add(customer);
		//customers.add(customer2);

		printDetails("Nilam");

	}

	private static void printDetails(String name) {
		for (Customer customer : customers) {
			if (customer.getName() == name) {
				for (Order orderss : customer.getOrders()) {
					System.out.println("Details of customer: " + orderss.getDate() + " ");
					for (LineItem itemss : orderss.getItem()) {
						System.out.println(
								"Details of Items: " + itemss.getProduct().getName() + " * " + itemss.getQuantity());
					}
				}
			}

		}
	}

}
