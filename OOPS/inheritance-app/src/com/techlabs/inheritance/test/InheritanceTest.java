package com.techlabs.inheritance.test;

public class InheritanceTest {
	public static void main(String[] args) {
		//case1();
		//case2();
		//case3();
		case4();
		case5();

	}

	public static void case1() {
		Man x;
		x = new Man();
		x.read();
		x.play();
	}

	public static void case2() {
		Boy y;
		y = new Boy();
		y.eat();
		y.play();
		y.walk();
		y.read();

	}
	
	public static void case3(){
		Man x;
		x=new Boy();
		x.read();
		x.play();
	}
	
	public static void case4(){
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
		
	}
	
	public static void case5(){
		Object x;
		x=10;
		System.out.println(x.getClass());
		x="Hello";
		System.out.println(x.getClass());
		x=new Man();
		System.out.println(x.getClass());
		System.out.println(x);
	}
	
	
	
	
	
	
	
	public static void atThePark(Man x){
		System.out.println("At the Park");
		x.play();
	}
	
	
	
	
	

}
