package com.techlabs.circle.test;

import com.techlabs.circle.BorderStyle;
import com.techlabs.circle.Circle;
import com.techlabs.circle.ColorCategory;

public class ClassTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(14.3f, ColorCategory.RED);
		System.out.println("Color is: " + c1.getBorderColor() + "area is: " + c1.calcArea());
		System.out.println("Radius is: " + c1.getRadius());
		
		Circle c=new Circle(1.2f, ColorCategory.BLUE, BorderStyle.Dotted);
		display(c);
		
	}

	private static void display(Circle c) {
		System.out.println("Radius is:"+c.getRadius());
		System.out.println("Area is:"+c.calcArea());
		System.out.println("Border color is:"+c.getBorderColor());
		System.out.println("Border Style is:"+c.getStyle());
		
	}

}
