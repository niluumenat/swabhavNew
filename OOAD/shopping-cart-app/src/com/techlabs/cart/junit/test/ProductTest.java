package com.techlabs.cart.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.cart.Product;

public class ProductTest {
	Product product = new Product("101", "books", 100, 1.5f);

	@Test
	public void checkGetter() {
		double cost = 100;
		assertTrue(product.getCost() == cost);

	}

	@Test
	public void checkCalDiscountCost() {
		double cost1 = 100 * (1.5f/100);
		assertTrue(product.calculateDiscountCost() == cost1);
	}

}
