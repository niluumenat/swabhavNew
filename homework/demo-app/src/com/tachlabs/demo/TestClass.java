package com.tachlabs.demo;

public class TestClass {
	public static void main(String[] args) {
		NewMobile obj = new NewMobile();
		obj.display();
		obj.show();
		obj.flashLight();

		Mobile obj1 = new NewMobile();
		obj1.display();
		obj1.flashLight();

		HtcMobile obj2 = new NewMobile();
		obj2.create();

	}

}
