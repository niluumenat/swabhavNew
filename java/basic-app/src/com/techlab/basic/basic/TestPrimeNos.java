package com.techlab.basic;

public class TestPrimeNos {
	public static void main(String args[]) {
		System.out.println(isPrime(19));

	}

	private static boolean isPrime(int input) {

		int half = input / 2;
		boolean notprime = false;
		if(input==0||input==1){
			notprime=true;
			
		}
		for (int n = 2; n <= half; n++) {
			if (input % n == 0) {
				notprime = false;

			} else {
				notprime = true;
			}

		}
		return notprime;

	}

}
