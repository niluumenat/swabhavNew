package com.techlab.basic;

public class EvenTest2 {
	public static void main(String args[]){
		int[] nos = getEvenNos(args[0]);
		for(int temp : nos){
			System.out.println(temp);
		}
		
		
	}
	public static int[] getEvenNos(String val){
		int no=Integer.parseInt(val);
		int[] evenos = new int[(no/2)+1];
		for(int inputval=0,index=0;inputval<=no;inputval++){
			if(inputval%2==0){
				evenos[index]=inputval;
				index++;
				
			}
			
			
		}
		return evenos;
		
	}

}
