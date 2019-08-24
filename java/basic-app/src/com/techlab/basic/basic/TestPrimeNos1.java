package com.techlab.basic;

public class TestPrimeNos1 {
	public static void main(String args[]) {
		int[] primenos = getPrimeNosTill(20);
		for (int p : primenos) {
			System.out.println(p);

		}

	}

	public static int[] getPrimeNosTill(int input) {
		int count = countPrimeNum(input);
		int[] prime = new int[count];
		{
			for (int n = 2, index = 0; n <= input; n++) {
				if (isPrime(n) == true) {
					prime[index] = n;
					index++;
				}
			}
		}

		return prime;
	}

	public static int countPrimeNum(int input) {
		int count = 0;
		boolean x = false;
		for (int m = 2; m <= input; m++) {
			x = isPrime(m);
			if (x == true) {
				count++;
			}
		}
		return count;
	}

	public static boolean isPrime(int num) {

		int half = num / 2;
		boolean notprime = false;

		if (half == 1) {
			notprime = true;
		}
		if (num == 0 || num == 1) {
			notprime = true;

		}
		for (int n = 2; n <= half; n++) {
			if (num % n == 0) {
				notprime = false;

			} else {
				notprime = true;
			}

		}

		return notprime;

	}
}
