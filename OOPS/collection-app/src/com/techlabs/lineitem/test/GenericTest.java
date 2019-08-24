package com.techlabs.lineitem.test;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class GenericTest {

	public static void main(String[] args) {
		ArrayList<LineItem> cart = new ArrayList<>();
		cart.add(new LineItem("101", "nil", 10, 5));
		cart.add(new LineItem("303", "niki", 200, 3));
		cart.add(new LineItem("202", "nileshh", 400, 2));
		cart.add(new LineItem("505", "hetaa", 260, 1));

		for (LineItem item : cart) {
			System.out.println(" Id: " + item.getId() + " name: " + item.getName() + " Cost of each item:"
					+ item.getCost() + " Quantity:" + item.getQuantity() + " Total Cost: " + item.calTotalCost());

		}

	}

}
