package com.techlabs.circle;

public class Circle {
	private float radius;
	private String borderColor;
	private final float pi = 3.14f;

	public Circle(float paramRadius, String paramBorderColor) {
		radius = paramRadius;
		borderColor = paramBorderColor;
	}

	public float calcArea() {
		return pi * radius * radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = validate(borderColor);
	}

	public String validate(String color) {
		String borderclr = "RED";
		if (color.equalsIgnoreCase("red")) {
			borderclr="RED";
		}
		else if(color.equalsIgnoreCase("green")){
			borderclr="GREEN";
		}
		else if(color.equalsIgnoreCase("blue")){
			borderclr="BLUE";
		}
		return borderclr;

	}

}
