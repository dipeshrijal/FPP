package com.fppclass.progfinal_2_2_correct;

public final class CheckingAccount extends Account {
	public CheckingAccount(double balance) {
		this.balance = balance;
	}

	double balance;

	public double getBalance() {
		return balance;
	}
}
