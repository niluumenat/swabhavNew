package com.techlabs.set.collection;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionLinkedHashSet {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("Apple");
		set.add("Pencil");
		set.add("Eggs");
		set.add("Ball");
		display(set);

		System.out.println("After removing");
		set.remove("Eggs");
		display(set);

		System.out.println("After updating");
		set.add("Vegetables");
		display(set);

	}

	private static void display(Set<String> set) {
		for (String item : set) {
			System.out.println("Items: " + item);
		}

	}

}
