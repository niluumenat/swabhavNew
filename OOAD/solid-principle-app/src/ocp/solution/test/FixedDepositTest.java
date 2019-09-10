package ocp.solution.test;

import ocp.solution.FixedDeposit;
import ocp.solution.Holi;
import ocp.solution.Normal;

public class FixedDepositTest {

	public static void main(String[] args) {

		FixedDeposit deposit = new FixedDeposit("Nilam", 10000, 3, new Normal());

		deposit.calculateSimpleInterest();

		display(deposit);

	}

	private static void display(FixedDeposit deposit) {
		System.out.println(" " + deposit.getName() + " has a principle amount: " + deposit.getPrinciple() + "for "
				+ deposit.getDuration() + "years with rate of interest " + deposit.getFestival().getRate()
				+ "\nsimple interest is:  " + deposit.calculateSimpleInterest());
	}

}
