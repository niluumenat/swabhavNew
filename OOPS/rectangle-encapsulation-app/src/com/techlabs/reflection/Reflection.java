package com.techlabs.reflection;

import java.lang.reflect.Method;

public class Reflection {
	public void reflect(Class c) {

		System.out.println(c.getName());
		int[] cg = countGetters(c);
		int[] cs = countSetters(c);
		System.out.println("no of setters" + cg[0]);
		System.out.println("no of getters" + cs[0]);
		System.out.println("no of total methods" + cs[1]);

	}

	private int[] countSetters(Class c) {
		int[] count = new int[2];
		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().startsWith("get")) {
				count[0]++;
			}
		}
		count[1] = methods.length;

		return count;
	}

	private int[] countGetters(Class c) {
		int[] count = new int[1];
		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().startsWith("set")) {
				count[0]++;
			}
		}
		return count;
	}
}


