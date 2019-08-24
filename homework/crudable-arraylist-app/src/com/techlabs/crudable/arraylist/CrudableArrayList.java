package com.techlabs.crudable.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class CrudableArrayList {
	public static void main(String[] args) {

		CrudClass c = new CrudClass("101", "nilam", "100");
		CrudClass c1 = new CrudClass("202", "hetu", "104");
		CrudClass c2 = new CrudClass("401", "xyz", "200");
		ArrayList<CrudClass> alist = new ArrayList<CrudClass>();

		alist.add(c);
		alist.add(c1);
		alist.add(c2);

		System.out.println("After Adding: ");

		display(alist);

		alist.remove(0);
		System.out.println("After removing:");

		display(alist);

		CrudClass c3 = new CrudClass("301", "harshu", "105");
		alist.set(alist.indexOf(c1), c3);
		System.out.println("After updating list: ");
		display(alist);

	}

	private static void display(ArrayList<CrudClass> alist) {
		Iterator itr = alist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
