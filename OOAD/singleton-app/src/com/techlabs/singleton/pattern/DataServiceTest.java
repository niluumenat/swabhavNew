package com.techlabs.singleton.pattern;

public class DataServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataService service1 =  DataService.getInstance();
		
		DataService service2 = DataService.getInstance();
		
		//System.out.println(service1.hashCode());
		//System.out.println(service2.hashCode());
		
		System.out.println(service1.doSomething());
		System.out.println(service2.doSomething());
		
	}

}
