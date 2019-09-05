package com.techlabs.cart;

import java.util.Date;
import java.util.HashSet;

public class Order {
	private int id;
	private Date date;
	private HashSet<LineItem> items;

	public Order(int id, Date date) {
		super();
		this.id = id;
		this.date = date;
		items = new HashSet<>();
	}

	public void addItem(LineItem lineitem) {
		if (items.isEmpty()) {
			items.add(lineitem);
		} else {
			for (LineItem item : items) {
				if (item.getProduct().getId().equals(lineitem.getProduct().getId())) {
					int quantity = item.getQuantity();
					quantity = item.getQuantity() + lineitem.getQuantity();
					item.setQuantity(quantity);

				} else {
					items.add(lineitem);
				}
			}
		}

	}

	public double checkOutPrice() {
		double totalCost = 0;
		for (LineItem item : items) {
			totalCost = totalCost + item.calculateItemCost();
		}
		return totalCost;
	}


	public int getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public HashSet<LineItem> getItem() {
		return items;
	}

}
