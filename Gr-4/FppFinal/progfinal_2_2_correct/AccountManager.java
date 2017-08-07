package com.fppclass.progfinal_2_2_correct;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		// implement
		double sum = 0;
		for (Employee e : emps) {
			for (Account account : e.getAccounts()) {
				sum = sum + account.getBalance();
			}
		}
		return sum;
	}
}
