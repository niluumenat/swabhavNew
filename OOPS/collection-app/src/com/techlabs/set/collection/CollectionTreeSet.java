package com.techlabs.set.collection;

import java.util.TreeSet;

public class CollectionTreeSet {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>();
		set.add("Milk");
		set.add("Fruits");
		set.add("Vegetales");
		set.add("Bat");
		display(set);
		
		System.out.println("After removing");
		set.remove("Fruits");
		display(set);
		
		System.out.println("after updating");
		set.add("Ball");
		display(set);

	}

	private static void display(TreeSet<String> set) {
		for(String item:set){
			System.out.println("Items: "+item);
		}
		
	}

}
