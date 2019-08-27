package com.techlabs.cart.junit.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.techlabs.cart.LineItem;
import com.techlabs.cart.Order;
import com.techlabs.cart.Product;

public class OrderTest {
	Product product = new Product("101", "books", 100, 5f);
	Product product2 = new Product("102", "pens", 50, 2f);
	Date date = java.util.Calendar.getInstance().getTime();
	Order order = new Order(302, date);
	LineItem lineitem = new LineItem(303, 7, product);
	LineItem lineitem2 = new LineItem(304, 2, product2);
	List<LineItem> items = new ArrayList<LineItem>();

	@Test
	public void checkDate() {
		Date date1 = order.getDate();
		assertTrue(date1 == date);
		System.out.println(date);
		System.out.println(date1);
	}

	@Test
	public void checkAddMethod() {
		order.addItem(lineitem);
		order.addItem(lineitem2);
		items.add(lineitem);
		items.add(lineitem2);
		assertTrue(items.contains(lineitem2) == order.getItem().contains(lineitem2));
		System.out.println(items.size());
		System.out.println(order.getItem().size());
	}

	@Test
	public void checkFinalPriceMethod() {
		double totalCost = 0;
		order.addItem(lineitem);
		order.addItem(lineitem2);
		items.add(lineitem);
		items.add(lineitem2);
		for (LineItem i : items) {
			totalCost = totalCost + i.calculateItemCost();
		}
		assertTrue(order.checkOutPrice() == totalCost);
		System.out.println(order.checkOutPrice());
		System.out.println(totalCost);

	}

}
