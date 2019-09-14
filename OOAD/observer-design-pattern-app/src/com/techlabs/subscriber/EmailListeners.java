package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceChangeListeners;

public class EmailListeners implements IBalanceChangeListeners {

	@Override
	public void update(Account account) {
		System.out.println(account.getName() + " with account number " + account.getAccno() + " has final balance "
				+ account.getBalance());
	}

}
