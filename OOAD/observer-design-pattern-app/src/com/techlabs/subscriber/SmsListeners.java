package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceChangeListeners;

public class SmsListeners implements IBalanceChangeListeners {

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		
		System.out.println(account.getName() + "  with account number " + account.getAccno() + "  has final balance "
				+ account.getBalance());
	}

}
