package dip.solution.test;

import dip.solution.TaxCalculation;
import dip.solution.TxtLogger;
import dip.solution.XmlLogger;

public class TaxCalculationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculation calci = new TaxCalculation(new TxtLogger() );
		System.out.println("Output is:  "+calci.calculate(100, 20));
		
		calci=new TaxCalculation(new XmlLogger());
		System.out.println("Output is: "+calci.calculate(0, 0));
	}

}
