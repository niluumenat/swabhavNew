package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class TestRectangleArray {
	public static void main(String[] args) {
		Rectangle[] rect = new Rectangle[5];
		rect[0] = new Rectangle();
		rect[0].setWidth(15);
		rect[0].setHeight(20);

		rect[1] = new Rectangle();
		rect[1].setWidth(44);
		rect[1].setHeight(56);

		rect[2] = new Rectangle();
		rect[2].setWidth(205);
		rect[2].setHeight(20);

		rect[3] = new Rectangle();
		rect[3].setWidth(152);
		rect[3].setHeight(150);

		rect[4] = new Rectangle();
		rect[4].setWidth(15);
		rect[4].setHeight(20);
		
		int totalArea = 0;
		
		for(int i=0;i<=4;i++){
			display(rect[i]);
			totalArea=totalArea+rect[i].calcArea();
		
		}
		System.out.println("Total Area:"+totalArea);

	}

	private static void display(Rectangle rect) {
		System.out.println("width:" + rect.getWidth() + " height:" + rect.getHeight());
		System.out.println("area:" + rect.calcArea());
		System.out.println(rect.hashCode());

	}
}