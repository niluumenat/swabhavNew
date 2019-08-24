package com.techlab.basic;

public class WelcomeTest {
	public static void main(String args[]) {
		printThis("Hello");
		printThis(10.44f);
		printThis(10);
		printThis(10.3);
		printThis('#');
	}

	private static void printThis(String text) {
		System.out.println("overload 1");
		System.out.println(text);
	}

	private static void printThis(float text) {
		System.out.println("overload 2");
		System.out.println(text);
	}

	private static void printThis(int text) {
		System.out.println("overload 3");
		System.out.println(text);
	}

	private static void printThis(double text) {
		System.out.println("overload 4");
		System.out.println(text);
	}
	private static void printThis(char text){
		System.out.println("overload 5");
		System.out.println(text);
		
	}
}
