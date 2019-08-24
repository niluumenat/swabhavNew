package com.techlabs.inheritance.constructor.case2;

public class Parent {
	public int foo;

	public Parent(int foo) {
		this.foo=foo;
		System.out.println("Inside Parent");
	}

	public int getFoo() {
		return foo;
	}

}
