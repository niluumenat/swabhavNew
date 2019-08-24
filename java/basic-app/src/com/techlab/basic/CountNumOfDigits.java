package com.techlab.basic;

public class CountNumOfDigits {
	public static void main(String args[]){
		int i=4555;
		System.out.println(countNumOfDigits(i));
	}

	private static int countNumOfDigits(int i) {
		int count=0;
		while(i>0){
			i=i/10;
			count=count+1;
		}
		return count;
		
		
	}

}
