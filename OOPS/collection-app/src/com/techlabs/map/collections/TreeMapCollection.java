package com.techlabs.map.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapCollection {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		map.put("a", "Nil");
		map.put("x", "Akii");
		map.put("c", "Niki");

		System.out.println(map);

		map.remove("a");
		System.out.println(map);
		
		map.put("c", "Nikita");
		map.put("c", "Nik");
		
		Comparator com=map.comparator();
		System.out.println(com);

		Set set = map.entrySet();
		/*Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> mentry = (Entry<String, String>) iterator.next();
			System.out.println("Key is: " + mentry.getKey()+" Value: " +  mentry.getValue());
		}*/
		
		

	}

}
