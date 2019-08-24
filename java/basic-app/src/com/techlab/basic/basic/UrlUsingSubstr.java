package com.techlab.basic;

public class UrlUsingSubstr {
	public static void main(String args[]){
		String url="http://www.google.com?programmer";
		displayDetails(url);
	}

	private static void displayDetails(String url) {
		
		String companyName=url.substring(url.indexOf(".")+1,url.lastIndexOf("."));
		System.out.println("company name="+companyName);
		String programmer=url.substring(url.indexOf("=")+1);
		System.out.println("programmer="+programmer);

		
		
	}

}
