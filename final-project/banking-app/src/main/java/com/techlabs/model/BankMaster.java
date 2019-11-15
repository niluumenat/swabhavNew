package com.techlabs.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BankMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID accNo;

	private String name;
	private String password;
	private double balance;
	
	@OneToMany(mappedBy = "master", cascade = CascadeType.ALL)
	private Set<BankTransaction> transactions = new HashSet<BankTransaction>();

	public BankMaster() {
	}

	public Set<BankTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<BankTransaction> transactions) {
		this.transactions = transactions;
	}

	public UUID getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
		

}
