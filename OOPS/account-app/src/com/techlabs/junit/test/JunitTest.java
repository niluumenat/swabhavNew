package com.techlabs.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.account.Account;

public class JunitTest {
	Account acc=new Account(101, "nil", 100);
	
	@Test(expected =RuntimeException.class)
	public void checkRuntimeException() {
		
		acc.withDraw(1000);
	}
	
	@Test
	public void checkSetters(){
		acc.setAccBalance(100);
		assertTrue(acc.getAccBalance()==100);
	}
	
	public void checkGetters(){
		acc.setAccBalance(1000);
		assertTrue(acc.getAccBalance()==100);
	}

}
