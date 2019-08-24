package com.techlab.basic;

public class ShiftByGivenBit {
	public static void main(String args[]){
		int[] num={10,20,30,40,50};
		int i = 3;
		shiftByGivenBit(num,i);
		System.out.println(num.length);
		for(int m:num ){
			System.out.println(m);
		}
		
	}

	private static void shiftByGivenBit(int[] num, int numOfShift) {
		for(int m=1;m<=numOfShift;m++){
			shiftByOneBit(num);
		}
	}

	private static void shiftByOneBit(int[] num1) {
		int[] p=new int[num1.length];
			int temp=num1[0];
			for(int index=0;index<=num1.length-2;index++){
				int abc=num1[index];
				num1[index]=num1[index+1];
				}
			num1[num1.length-1]=temp;
		
		}
		
	}


