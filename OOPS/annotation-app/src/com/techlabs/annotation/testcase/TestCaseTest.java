package com.techlabs.annotation.testcase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCaseTest {
	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int countNoOfTestCase = 0, count = 0;

		try {
			Class cls = Class.forName("com.techlabs.annotation.testcase.Foo1");
			Class annotation = Class.forName("com.techlabs.annotation.testcase.TestCase");
			Foo1 foo = new Foo1();
			Method[] methods = cls.getMethods();
			for (Method method : methods) {
				if (method.isAnnotationPresent(annotation)) {
					boolean b = (boolean) method.invoke(foo);
					if (b == true) {
						countNoOfTestCase++;
						count++;
					}

				}
			}
			System.out.println("Number of test cases invoked: " + countNoOfTestCase);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
