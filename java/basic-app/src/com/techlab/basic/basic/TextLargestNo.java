package com.techlab.basic;

public class TextLargestNo {
	public static void main(String args[]){
		int nos[]={10,20,5,57};
		int number=FindLargestNo(nos);
		System.out.println(number);
		
	}
	private static int FindLargestNo(int[] nos) {
		int max=nos[0];
		for(int index=1;index<nos.length;index++){
			if(nos[index]>max){
				max=nos[index];
			}
			
		}
		
		return max;
	}
}
