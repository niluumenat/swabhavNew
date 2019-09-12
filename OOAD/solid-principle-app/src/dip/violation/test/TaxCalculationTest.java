package dip.violation.test;

import dip.violation.LogType;
import dip.violation.TaxCalculation;

public class TaxCalculationTest {

	public static void main(String[] args) {
		TaxCalculation calci = new TaxCalculation(LogType.TXT);
		System.out.println(calci.calculate(100, 20));
		
		System.out.println("Output is: "+calci.calculate(10, 0));

	}

}