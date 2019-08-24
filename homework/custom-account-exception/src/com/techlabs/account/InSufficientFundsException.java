package com.techlabs.account;

public class InSufficientFundsException extends Exception{
	private Account account;
	private double amount;

	public InSufficientFundsException(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public String getMessage() {
		return  account.getName()+" has only "+account.getAccBalance()+"so she cants withdraw "+amount;
	}
	
	


}
