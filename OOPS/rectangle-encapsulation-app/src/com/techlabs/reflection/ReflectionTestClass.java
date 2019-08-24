package com.techlabs.reflection;

import java.io.PrintStream;
import java.lang.reflect.Method;

import com.techlabs.rectangle.Rectangle;

public class ReflectionTestClass {
	public static void main(String args[]) {
		Rectangle rect = new Rectangle();
		Class c = rect.getClass();
		Reflection reflect = new Reflection();
		reflect.reflect(c);

		Class c1 = PrintStream.class;
		reflect.reflect(c1);

		try {
			Class c2 = Class.forName("com.techlabs.rectangle.Rectangle");
			reflect.reflect(c2);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}
}
