package com.techlabs.boxing;

public class Boxing {
	public static void main(String[] args) {
		Integer i = new Integer(10);// auto-boxing
		int i1 = i;// auto-boxing
		System.out.println(i + " " + i1);

		Character gfg = 'a'; // Auto-unboxing of Character
		char ch = gfg;
		System.out.println("Value of ch: " + ch);
		

	}
}
