package com.stockaccountmanagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StockPortfolio {

	static String shareName;
	static int numOfShare;
	static double sharePrice;

	static ArrayList<Stock> list = new ArrayList<Stock>();

	public void readValues() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.println("Enter Share Name : ");
			String shareName = sc.next();
			System.out.println("Enter Number of shares : ");
			int numOfShares = sc.nextInt();
			System.out.println("Enter Share price :$");
			double sharePrice = sc.nextDouble();
			list.add(new Stock(shareName, numOfShares,
					sharePrice));
		}
		System.out.println(list + "\n");
//		sc.close();
	}

	public void eachStockValue() {
		Iterator<Stock> iter = list.iterator();
		while (iter.hasNext()) {
			Stock stock = iter.next();
			double stockValue = stock.getSharePrice()
					* stock.getNumOfShare();
			System.out.println("The stock value of "
					+ stock.getShareName() + " is : "
					+ stockValue + "\n");
		}
	}

	public double getTotalStockValue() {
		double totalStockValue = 0;
		for (Stock s : list) {
			totalStockValue += s.getStockValue();
		}
		return totalStockValue;
	}

	public static void main(String[] args) {

		System.out.println("Enter the number of Stocks :");

		StockPortfolio stockpotfolio = new StockPortfolio();
		stockpotfolio.readValues();
		stockpotfolio.eachStockValue();
		stockpotfolio.getTotalStockValue();

		System.out.println("The value of total stock is : "
				+ stockpotfolio.getTotalStockValue()
				+ "\n");
		Account account = new Account();
		account.debit();
	}

}
