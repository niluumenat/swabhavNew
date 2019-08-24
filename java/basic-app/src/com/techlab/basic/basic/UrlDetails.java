package com.techlab.basic;

public class UrlDetails {
	public static void main(String args[]){
		String url="http://www.google.com?programmer=";
		displayDetails(url);
		
	}

	private static void displayDetails(String url) {
		String s=url.substring(11);
		String[] companyUrl=s.split("\\.",2);
		System.out.println("company Url:"+companyUrl[0]);
		String[] programmer =url.split("=");
		System.out.println(programmer[1].length());
		/*if(programmer[1].length()>1){
		
			System.out.println("Programmer"+programmer[1]);
		}
		else{
			System.out.println("Programmer"+"");
		}*/
		
	}
	

}
