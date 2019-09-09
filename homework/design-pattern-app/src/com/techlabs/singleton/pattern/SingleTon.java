package com.techlabs.singleton.pattern;

public class SingleTon {
	private static SingleTon singleTon = null;
	public String s;
	
	private SingleTon(){
		s="hiii";
	}

	public static SingleTon SingleTon() {
		if(singleTon == null){
			singleTon=new SingleTon();
		}
		return singleTon;
	}
	
	
	
	
	
	

}
