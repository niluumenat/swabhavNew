package com.techlabs.publisher;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.Marshaller.Listener;

public class Account {
	private String accno;
	private String name;
	private double balance;
	
	private List<IBalanceChangeListeners> subscriber;
	
	public Account(String accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		this.subscriber = new ArrayList<IBalanceChangeListeners>();
	}
	
	public void deposit(double amount){
		balance= balance+amount;
		notifySubscribers();
		
	}
	public void withdraw(double amount){
		balance = balance-amount;
		notifySubscribers();
	}
	public void registerSubscriber(IBalanceChangeListeners listeners){
		subscriber.add(listeners);
	}
	
	public String getAccno() {
		return accno;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	
	private void notifySubscribers(){
		for(IBalanceChangeListeners listeners:subscriber){
			listeners.update(this);
		}
	}
	
	

}
