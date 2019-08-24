package com.techlab.basic;

public class ArgumentsTest {
	public static void main(String[] args) {
		System.out.println(args.length);
		int argSize = args.length;
		if (argSize > 0) {
			for (int index = 0; index < argSize; index++) {
				System.out.println("hello " + args[index]);

			}
		}
		else{
			System.out.println("hii");
		}
	}

}
