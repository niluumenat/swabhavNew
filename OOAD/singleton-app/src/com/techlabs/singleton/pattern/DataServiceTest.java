package com.techlabs.singleton.pattern;

public class DataServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataService service1 = new DataService();
		
		DataService service2 = new DataService();
		
		System.out.println(service1.hashCode());
		System.out.println(service2.hashCode());
	}

}
