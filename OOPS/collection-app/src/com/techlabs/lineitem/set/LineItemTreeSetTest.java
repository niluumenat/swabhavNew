package com.techlabs.lineitem.set;

import java.util.TreeSet;

import com.techlabs.lineitem.LineItem;

public class LineItemTreeSetTest {

	public static void main(String[] args) {
		TreeSet<LineItem> items = new TreeSet<LineItem>();
		LineItem item1 = new LineItem("105", "Book", 500, 2);
		LineItem item2 = new LineItem("100", "pen", 100, 20);
		LineItem item3=new LineItem("104", "clothes", 5000, 5);
		items.add(item1);
		items.add(item2);
		items.add(item3);
		System.out.println("Sorting by ID Comparable:");
		display(items);
		
		TreeSet<LineItem> cart=new TreeSet<>(new SortByNameComparator());
		
		cart.add(item1);
		cart.add(item2);
		cart.add(item3);
		System.out.println(" Sorting by name Comparator:");
		display(cart);
		
		TreeSet<LineItem> cart1=new TreeSet<>(new SortByCostComparator());
		
		cart1.add(item1);
		cart1.add(item2);
		cart1.add(item3);
		System.out.println("Sorting by Cost Comparator: ");
		display(cart1);
		
		TreeSet<LineItem> cart2=new TreeSet<>(new SortByQuantityComparator());
		
		cart2.add(item1);
		cart2.add(item2);
		cart2.add(item3);
		System.out.println("Sorting by Quantity Comparator: ");
		display(cart2);
		

	}

	private static void display(TreeSet<LineItem> items) {
		for (LineItem item : items) {
			System.out.println(" Id: " + item.getId() + " name: " + item.getName() + " Cost of each item:"
					+ item.getCost() + " Quantity:" + item.getQuantity() + " Total Cost: " + item.calTotalCost());

		}
	}
}
