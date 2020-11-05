package com.codepreplabs.threads;

public class Account {

	private int balance = 50;

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
