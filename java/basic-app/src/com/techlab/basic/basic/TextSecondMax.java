package com.techlab.basic;

public class TextSecondMax {
	public static void main(String args[]) {
		int nos[] = { -50, -1, -5, -20, -34, -48 };
		int number = findSecond(nos);
		System.out.println(number);

	}

	private static int findSecond(int[] nos) {
		int max = nos[0];
		for (int index = 1; index < nos.length; index++) {
			if (nos[index] > max) {
				max = nos[index];
			}
		}
		int secondMax = nos[0];
		if (max == secondMax) {
			secondMax = nos[1];
		}

		for (int j = 0; j < nos.length; j++) {
			if (nos[j] > secondMax && nos[j] != max) {
				secondMax = nos[j];

			}

		}

		return secondMax;
	}

}
