package com.tachlabs.demo;

abstract class Mobile {
	Mobile() {
		System.out.println("constructor mobile");
	}

	void flashLight() {
		System.out.println("abstract class with non-abs method");
	}

	abstract void display();

}

abstract class HtcMobile extends Mobile {
	abstract void create();

	void hello() {
		System.out.println("abstract class without abstract method");
	}
}

class NewMobile extends HtcMobile {
	void display() {
		System.out.println("display() in extended class");
	}

	void create() {
		System.out.println("method from abstact class");
	}

	void show() {
		System.out.println("show() method");
	}

}
