package com.techlabs.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String args[]) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		int i=6;
		alist.add(i);
		alist.add(4);

		Iterator it = alist.iterator();
		while (it.hasNext()) {
	        i = (Integer)it.next();
			System.out.println(i);
		}
	}
}
