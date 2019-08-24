package com.techlabs.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		try {
			int count = 0;
			Class cls = Class.forName("com.techlabs.annotation.Foo");
			Class annotation = Class.forName("com.techlabs.annotation.NeedtoRefactor");

			Method[] methods = cls.getMethods();
			Foo f1=new Foo();
			
			for (Method method : methods) {
				if (method.isAnnotationPresent(annotation)) {
					try {
						method.invoke(f1);
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					count++;
					System.out.println(method.getName());
				}
			}
			
			System.out.println("Total annotation methods are:"+count);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
