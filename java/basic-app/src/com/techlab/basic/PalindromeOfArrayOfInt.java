package com.techlab.basic;

public class PalindromeOfArrayOfInt {
	public static void main(String args[]){
		int[] input={101,1100,202,4004,2222};
		System.out.println(countNoOfPalindrome(input));
		int[] m=palindromeOfArrayOfInt(input);
		for(int p:m){
		System.out.println(p);
		}
		
		
	}
	private static int[] palindromeOfArrayOfInt(int[] input) {
		int count=countNoOfPalindrome(input);
		int[] result=new int[count];
		for(int index=0,index2=0;index<=input.length-1;index++){
			if(palimdromeNo(input[index])==true){
			result[index2]=input[index];
			index2++;
			}
		}
		return result;
		}
	private static int countNoOfPalindrome(int[] input) {
		int c=0;
		boolean b=false;
		for(int index=0;index<=input.length-1;index++){
			b=palimdromeNo(input[index]);
			if(b==true){
			c=c+1;
		}
		}
		return c;
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
