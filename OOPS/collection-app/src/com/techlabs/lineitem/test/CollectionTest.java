package com.techlabs.lineitem.test;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class CollectionTest {

	public static void main(String[] args) {
		ArrayList cart = new ArrayList();
		cart.add(new LineItem("101", "nil", 10, 5));
		cart.add(new LineItem("303", "niki", 200, 3));
		cart.add(new LineItem("202", "nileshh", 400, 2));
		cart.add(new LineItem("505", "hetaa", 260, 1));
		cart.add("Nilam");

		for (Object item : cart) {
			LineItem item1 = (LineItem) item;
			System.out.println(" Id: " + item1.getId() + " name: " + item1.getName() + " Cost of each item:"
					+ item1.getCost() + " Quantity:" + item1.getQuantity() + " Total Cost: " + item1.calTotalCost());
		}
	}

}
