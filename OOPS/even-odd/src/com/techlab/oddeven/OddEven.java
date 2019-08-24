package com.techlab.oddeven;

public class OddEven {

	public int[] oddNumbers(int value) {
		int c = countNoOfOddNo(value);
		int[] odd = new int[c];
		for (int no = 1, index = 0; no <= value; no++) {
			if (no % 2 != 0) {
				odd[index] = no;
				index++;
			}
		}

		return odd;
	}

	private int countNoOfOddNo(int value) {
		int count = 0;
		for (int no = 1; no <= value; no++) {
			if (no % 2 != 0) {
				count++;
			}
		}

		return count;
	}

	public int[] evenNumbers(int value) {
		int c = countNoOfEvenNo(value);
		int[] even = new int[c];

		for (int no = 1, index = 0; no <= value; no++) {
			if (no % 2 == 0) {
				even[index] = no;
				index++;
			}
		}
		return even;
	}

	private int countNoOfEvenNo(int value) {
		int count = 0;
		for (int no = 0; no <= value; no++) {
			if (no % 2 == 0) {
				count++;
			}
		}

		return count;
	}

}
