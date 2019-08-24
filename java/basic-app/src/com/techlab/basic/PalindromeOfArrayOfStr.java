package com.techlab.basic;

public class PalindromeOfArrayOfStr {
	public static void main(String args[]){
		String[] str={"abcd","xyyx","yay"};
		System.out.println(countNoOfPalindrome(str));
		String[] m=palindromeArrayOfStr(str);
		for(String p:m){
		System.out.println(p);
		}
	}

	private static String[] palindromeArrayOfStr(String[] str) {
		int count=countNoOfPalindrome(str);
		String[] result=new String[count];
		for(int index=0,index2=0;index<=str.length-1;index++){
			if(palindromeOfStr(str[index])==true){
			result[index2]=str[index];
			index2++;
			}
		}
		
		return result;
		
		
	}

	private static int countNoOfPalindrome(String[] str) {
		int c=0;
		boolean b=false;
		for(int index=0;index<=str.length-1;index++){
			b=palindromeOfStr(str[index]);
			if(b==true){
			c=c+1;
		}
		}
		return c;
		
		
	}
	private static boolean palindromeOfStr(String str) {
		int length=str.length();
		String rev="";
		boolean result=false;
		for(int i=length-1;i>=0;i--){
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev)){
			result=true;
			
		}
		return result;
		
	}

}
