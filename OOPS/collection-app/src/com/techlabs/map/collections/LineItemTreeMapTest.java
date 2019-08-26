package com.techlabs.map.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.techlabs.lineitem.LineItem;

public class LineItemTreeMapTest {

	public static void main(String[] args) {
		TreeMap<LineItem, LineItem> treemap = new TreeMap<>();
		LineItem item1 = new LineItem("110", " books", 500, 5);
		LineItem item2 = new LineItem("100", "pen", 100, 20);
		LineItem item3 = new LineItem("104", "clothes", 5000, 5);
		treemap.put(item1, item1);
		treemap.put(item2, item2);
		treemap.put(item3, item3);

		for (Entry<LineItem, LineItem> entry : treemap.entrySet()) {
			/*for (LineItem item : entry.getValue()) {
				System.out.println(" Id: " + item.getId() + " name: " + item.getName() + " Cost of each item:"
						+ item.getCost() + " Quantity:" + item.getQuantity() + " Total Cost: " + item.calTotalCost());

			}*/
			
		}
	}

}
