package com.stockaccountmanagement;

import java.util.Scanner;

public class Account {

	public void debit() {

		StockPortfolio a = new StockPortfolio();

		double amount;

		System.out.println(
				"Please enter the amount to debit:");
		Scanner s = new Scanner(System.in);
		amount = s.nextDouble();
		double accountbal = a.getTotalStockValue();

		if (amount < a.getTotalStockValue()) {
			double debit = accountbal - amount;
			System.out.println(
					"Your account is debited with $"
							+ amount
							+ ". The available account balance is : $"
							+ debit);
			System.out.println(debit);
		} else {
			System.out.println(
					"Your debit amount exceeds your Account balance, please enter a value less than your Account Balance");
		}
		s.close();
	}
}
