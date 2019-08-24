package com.techlabs.rectangle.test;
import com.techlabs.rectangle.Rectangle;
public class TestAnonymous {
	public static void main(String[] args){
		display(new Rectangle());
		System.out.println(new Rectangle().calcArea());
	}
	private static void display(Rectangle rect) {
		System.out.println("width:" + rect.getWidth() + " height:" + rect.getHeight());
		System.out.println("area:" + rect.calcArea());
		System.out.println(rect.hashCode());

	}
}
