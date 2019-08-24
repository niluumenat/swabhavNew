package com.techlabs.bug;

public class BugTest{

	public static void main(String[] args)  {
		try{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a/b;
		System.out.println("Result: "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Denominator should not be zero");
		}
		catch(NumberFormatException e){
			System.out.println("Input String is not allowed");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please give input");
		}catch(StringIndexOutOfBoundsException e){
			
		}catch(java.lang.StackOverflowError e){
			
		}
		main(args);
	}

}
//java.lang.ArrayIndexOutOfBoundsException
//java.lang.ArithmeticException
// java.lang.NumberFormatException