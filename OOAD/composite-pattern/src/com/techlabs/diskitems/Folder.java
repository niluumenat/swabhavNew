package com.techlabs.diskitems;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IDiskItem {
	private String name;
	private List<IDiskItem> list;

	public Folder(String name) {
		super();
		this.name = name;
		this.list = new ArrayList<IDiskItem>();
	}

	public String getName() {
		return name;
	}

	public void addDiskItem(IDiskItem item) {
		list.add(item);
	}

	@Override
	public void display() {
		System.out.println(name);
		for (IDiskItem items : list) {
			System.out.print("   ");
			if(items ==this){
				System.out.println("  ");
			}
			items.display();
		}
	}

}
