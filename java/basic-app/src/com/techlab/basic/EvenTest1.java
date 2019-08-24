package com.techlab.basic;

public class EvenTest1 {
	public static void main(String args[]){
		String val=args[0];
		displayEvenNos(val);
	}
		

	    private static void displayEvenNos(String val) {
		// TODO Auto-generated method stub
		int nos=Integer.parseInt(val);
		for(int i=0;i<=nos;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		
	
}
}
