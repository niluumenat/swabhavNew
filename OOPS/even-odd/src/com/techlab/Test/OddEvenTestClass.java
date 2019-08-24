package com.techlab.Test;

import java.util.Scanner;

import com.techlab.oddeven.OddEven;

public class OddEvenTestClass {
	public static void main(String args[]) {

		OddEven oe = new OddEven();
		display(oe);
	}

	private static void display(OddEven oe) {
		System.out.println("Even Numbers:");
		int[] e=oe.evenNumbers(102);
		for(int i:e){
			System.out.print(i+" ");
		}
		System.out.println("\nOdd Numbers:");
		int[] o=oe.oddNumbers(202);
		for(int i:o){
			System.out.print(i+" ");
		}
		
	}

}
