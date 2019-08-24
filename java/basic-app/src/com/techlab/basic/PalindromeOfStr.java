package com.techlab.basic;

public class PalindromeOfStr {
	public static void main(String args[]){
		String s="madam";
		System.out.println(palindromeOfStr(s));
	}

	private static boolean palindromeOfStr(String str) {
		int length=str.length();
		String rev="";
		boolean result=false;
		for(int i=length-1;i>=0;i--){
			rev=rev+str.charAt(i);
		if(str.equals(rev)){
				result=true;
			}
			}
		return result;
		
	}

}
