package com.techlabs.singleton.pattern;

public class DataService {
	private static DataService bucket;

	private DataService() {
		System.out.println("Service created....");
		
	}

	public static DataService getInstance() {
		if (bucket == null) {
			bucket = new DataService();
		}
		return bucket;

	}

	public int doSomething() {
		System.out.println("Working in this hashcode ");
		return hashCode();
	}

}
