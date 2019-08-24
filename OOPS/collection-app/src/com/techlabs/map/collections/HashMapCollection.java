package com.techlabs.map.collections;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(10, "Nilam");
		map.put(20, "Heta");
		map.put(50, "Madhavi");
		System.out.println("Initial map: "+map);
		map.put(20, "Hetaa");
		System.out.println("After updating: "+map);
		map.remove(10);
		System.out.println("After removing: "+map);
		

	}

}
