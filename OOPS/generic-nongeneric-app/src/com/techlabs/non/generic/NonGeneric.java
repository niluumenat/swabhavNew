package com.techlabs.non.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class NonGeneric {
	public static void main(String args[]) {
		ArrayList alist = new ArrayList();
		alist.add(6);
		alist.add("hetu");
		alist.add('c');

		Iterator it = alist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
