package com.techlabs.service;

import java.util.List;

import com.techlabs.model.BankingMaster;
import com.techlabs.model.BankingTransaction;
import com.techlabs.repository.BankRepository;

public class BankService {
	private static BankService instance;
	BankRepository repo = new BankRepository();
	
	public static BankService getInstance() {
		if (instance == null) {
			instance = new BankService();
		}
		return instance;
	}
	
	public void add(BankingMaster master,BankingTransaction transaction) {
		System.out.println("Hello from add");
		repo.add(master,transaction);
	}
	
	public boolean get(String userName, String userPassword ){
		return repo.get(userName, userPassword);
	}
	
	public List<BankingMaster> getByName(String userName){
		return repo.getByName(userName);
		
	}
	
	public void update( BankingTransaction transaction){
		repo.update(transaction);
	}
	
}
