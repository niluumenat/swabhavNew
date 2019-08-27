package com.techlabs.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CubeTest {
	
	Calculator calculator = new Calculator();

	@Test()
	public void willFindCubeOfPositiveNumbers() {
		int output=calculator.cubeEvenNo(4);
		assertEquals(64, output);
		
		
	}
	@Test(expected=NotAnEvenException.class)
	public void testNotAnEvenNumber(){
		int output=calculator.cubeEvenNo(15);
		assertEquals("throws exception", output);
		
	}
	
	

}
