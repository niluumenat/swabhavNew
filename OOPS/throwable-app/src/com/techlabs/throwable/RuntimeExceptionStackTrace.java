package com.techlabs.throwable;

public class RuntimeExceptionStackTrace {
	public static void main(String[] args) {
		try{
		m1();
		}catch(RuntimeException runtimeException){
			System.out.println(runtimeException.getMessage());
			runtimeException.printStackTrace();
			System.out.println("exception handled");
		}
		System.out.println("end of main");

	}

	private static void m1()   {
		System.out.println("Inside m1");
		m2();
	}

	private static void m2()  {
		System.out.println("Inside m2");
		m3();
	}

	private static void m3() {
		System.out.println("Inside m3");
		throw new RuntimeException("m3 throws exception");
	}

}
