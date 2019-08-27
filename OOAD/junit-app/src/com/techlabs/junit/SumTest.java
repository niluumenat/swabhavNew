package com.techlabs.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {
	Calculator calculator=new Calculator();

	@Test
	public void testPositiveNumber(){
		int output=calculator.add(10, 10);
		assertEquals( 20, output);
	}
	
	@Test
	public void addShouldReturn20IfInputIs10and10(){
		int output=calculator.add(10, 10);
		assertEquals(20, output);
	}
	
	@Test(expected=RuntimeException.class)
	public void testNegativeInput(){
		int output=calculator.add(-5, 0);
		assertEquals("Exception",output );
		
	}
	
	
	
	

}
