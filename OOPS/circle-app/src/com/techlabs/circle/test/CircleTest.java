package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTest {
	public static void main(String[]  args){
		Circle c=new Circle(0," ");
		c.setRadius(10.3f);
		c.setBorderColor("REd");
		System.out.println("Radius is:"+c.getRadius()+"\nBorder Color is:"+c.getBorderColor());
		System.out.println("Area of Circle is"+c.calcArea());
	}
}
