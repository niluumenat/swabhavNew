package com.techlabs.throwable;

public class ExceptionStackTrace {

	public static void main(String[] args) throws Exception {
		try{
			m1();
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("exception is handled");
		}
		System.out.println("end of main");
	}

	private static void m1() throws Exception {
		System.out.println("Inside m1");
		m2();
	}

	private static void m2() throws Exception {
		System.out.println("Inside m2");
		m3();
	}

	private static void m3() throws Exception {
		System.out.println("Inside m3");
		throw new Exception("m3 throws exception");
	}
	

}
