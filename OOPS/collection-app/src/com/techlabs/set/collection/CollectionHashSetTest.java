package com.techlabs.set.collection;

import java.util.Collection;
import java.util.HashSet;

import com.techlabs.lineitem.LineItem;

public class CollectionHashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Milk");
		set.add("Fruits");
		set.add("nilam");
		set.add("Milk");
		display(set);

		System.out.println("After removing ");
		set.remove("Milk");
		display(set);
		
		System.out.println("After updating");
		set.add("nilam");
		display(set);
	}

	private static void display(HashSet<String> set) {
		for (String item : set) {
			System.out.println("List items:" + item);
		}
	}

}
