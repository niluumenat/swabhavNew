package com.techlabs.lineitem.set;

import java.util.HashSet;

import com.techlabs.lineitem.LineItem;

public class TestLineItemHashSet {
	

	public static void main(String[] args) {
		
		HashSet<LineItem> items = new HashSet<LineItem>();
		LineItem item1 = new LineItem("101", "Book", 500, 2);
		items.add(item1);
		System.out.println(item1.hashCode());
		LineItem item2 = new LineItem("101", "Book", 500, 2);
		items.add(item2);
		System.out.println(item2.hashCode());

		System.out.println(items.size());
		
	}

}
