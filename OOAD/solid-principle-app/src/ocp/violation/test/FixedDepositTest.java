package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit deposit = new FixedDeposit("Nilam", 10000, 5, FestivalType.NORMAL);

		display(deposit);

	}

	private static void display(FixedDeposit deposit) {
		System.out.println(deposit.getName() + " " + deposit.getPrinciple() + " " + deposit.getDuration() + " "
				+ deposit.getFestival() + " " + deposit.calculateSimpleInterest());
	}

}
