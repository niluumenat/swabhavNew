package com.techlabs.cart.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.cart.LineItem;
import com.techlabs.cart.Product;

public class LineItemTest {
	Product product = new Product("101", "books", 100, 5f);
	LineItem item=new LineItem(104, 4, product );

	@Test
	public void checkGetter() {
		int quantity=4;
		assertTrue(item.getQuantity()==quantity);
	}
	@Test
	public void checkGetters(){
		Product product1=item.getProduct();
		assertTrue(product==product1);
	}
	@Test
	public void checkCalItemCost(){
		double cost=(product.calculateDiscountCost())*4;
		item.calculateItemCost();
		assertTrue(item.calculateItemCost()==cost);
		System.out.println(cost);
		System.out.println(item.calculateItemCost());
	}

}
