package com.techlabs.junit;

public class Calculator {
	public int add(int a, int b) {
		int result = 0;
		if (a > 0 && b > 0) {
			result=a+b;
		} else {
			throw new RuntimeException("Input is negative");
		}
		return result;
		

	}

	public int cubeEvenNo(int a) {
		int result=0;
		if (a % 2 == 0) {
			result=a*a*a;
		} else {
			throw new NotAnEvenException("not an even input");
		}
		return result;

		

	}

}
