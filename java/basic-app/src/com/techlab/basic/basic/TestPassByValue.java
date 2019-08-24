package com.techlab.basic;

public class TestPassByValue {
	public static void main(String args[]){
		int mark=100;
		changeMarkTozero(mark);
		System.out.println(mark);
		int[] marks={10,20,30};
		changeAllMarksToZero(marks);
		for(int m : marks){
			System.out.println(m);
		}
	}

	private static void changeAllMarksToZero(int[] dmarks) {
		for(int i=0;i<dmarks.length;i++){
			dmarks[i]=0;
		}
		
		
	}

	private static void changeMarkTozero(int pmark) {
		pmark=0;
		
	}

}
