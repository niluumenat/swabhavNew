package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String args[]) throws ClassNotFoundException, Exception {

		Rectangle small_rectangle = new Rectangle();
		Rectangle big_rectangle = new Rectangle();

		System.out.println("details of small rectangle");
		small_rectangle.setHeight(10);
		small_rectangle.setWidth(101);
		display(small_rectangle);
		
		System.out.println("details of big rectangle");
		big_rectangle.setHeight(3);
		big_rectangle.setWidth(101);
		display(big_rectangle);
	}

	
	private static void display(Rectangle rect) {
		System.out.println("width:" + rect.getWidth() + " height:" + rect.getHeight());
		System.out.println("area:" + rect.calcArea());
		System.out.println(rect.hashCode());

	}
}



