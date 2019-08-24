package com.techlab.basic;

public class FindEvenNum {
	public static void main(String args[]){
		int[] given={10,25,40,79};
		int c=countNumOfEven(given);
		System.out.println(c);
		int[] m=getEvenArray(given);
		for(int n:m){
			System.out.println(n);
		}
	}

	private static int[] getEvenArray(int[] given) {
		int[] r=new int[countNumOfEven(given)];
		for(int index=0,index2=0;index<=given.length-1;index++){
			if(given[index]%2==0){
				r[index2]=given[index];
				index2++;
			}
		}
		
		return r;
		
		
	}
	private static int countNumOfEven(int[] given){
		int count=0;
		for(int index=0;index<=given.length-1;index++){
			if(given[index]%2==0){
				count=count+1;
			}
		}
		return count;
		
	}

}
