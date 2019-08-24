package com.techlab.basic;

public class SumTest {
	public static void main(String[] args) {
		System.out.println(args.length);
		int argSize = args.length;
		int sum = 0;
		for (int i = 0; i < argSize; i++) {
			sum = Integer.parseInt(args[i]) + sum;
			}
		System.out.println("sum of" + argSize + "number is " + sum);
	}
}
