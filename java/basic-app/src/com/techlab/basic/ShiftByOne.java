package com.techlab.basic;

public class ShiftByOne {
	public static void main(String args[]){
		int[] num={10,20,30,40};
		
		shiftByOneBit(num);
		System.out.println(num.length);
		for(int m:num ){
			System.out.println(m);
		}
		
	}

	private static void shiftByOneBit(int[] num) {
		int temp=num[0];
		for(int index=0;index<=num.length-2;index++){
			int abc=num[index];
			num[index]=num[index+1];
			}
		num[num.length-1]=temp;
	}

}
