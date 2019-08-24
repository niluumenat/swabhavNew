package com.techlab.basic;

public class PalimdromeNo {
	public static void main(String args[]){
		int i=101;
		System.out.println(palimdromeNo(i));
		
	}

	private static boolean palimdromeNo(int input) {
		boolean isPalimdrome=false;
		int reverseDigit=0,remainder=0;
		int origNum = input;
		while(input!=0){
			remainder=input%10;
			reverseDigit=remainder + reverseDigit*10;
			input=input/10;
		}
		if(origNum==reverseDigit){
			isPalimdrome=true;
		}
		return isPalimdrome;
		
		
	}

}
