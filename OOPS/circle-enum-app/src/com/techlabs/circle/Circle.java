package com.techlabs.circle;

public class Circle {
	private final float radius;
	private final ColorCategory borderColor;
	private BorderStyle style;
	private final static float PI = 3.14f;

	public Circle(float paramRadius, ColorCategory paramborderColor) {
		radius = paramRadius;

		borderColor=paramborderColor;
	}
	public Circle(float paramRadius, ColorCategory paramborderColor, BorderStyle paramBorderStyle){
		radius = paramRadius;
		borderColor=paramborderColor;
		style=paramBorderStyle;
	}

	public BorderStyle getStyle() {
		return style;
	}
	public float calcArea() {
		return PI * radius * radius;
	}

	public float getRadius() {
		return radius;
	}

	public ColorCategory getBorderColor() {
		return borderColor;
	}

}