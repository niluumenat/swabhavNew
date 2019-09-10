package com.techlabs.singleton.pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon x = SingleTon.SingleTon();
		
		SingleTon y = SingleTon.SingleTon();
		System.out.println(x.s);
		System.out.println(y.s);
		
	}

}
