package com.techlabs.rectangle;

public class Rectangle {
	private int height;
	private int width;

	public int validate(int value) {
		int result = 0;
		if (value > 1 && value < 100) {
			result = value;
		} else if (value < 1) {
			result = 1;
		} else {
			result = 100;
		}
		return result;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = validate(width);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = validate(height);

	}

	public int calcArea() {
		int area = width * height;
		return area;

	}

}