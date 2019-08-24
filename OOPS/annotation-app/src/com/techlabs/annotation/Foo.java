package com.techlabs.annotation;

public class Foo {
	
	@NeedtoRefactor
	public void m1() {
		System.out.println("hiiii");
	}

	public void m2() {
		System.out.println("hii m2");
	}

	@NeedtoRefactor
	public void m3(){
		System.out.println("hyyy m3");
	}

	public void m4() {
		System.out.println("helooo m4");
	}

}
