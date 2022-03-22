package com.stockaccountmanagement;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class StockPortfolio {
				
			static String shareName;
			static int numOfShare;
			static double sharePrice;

			static ArrayList<Stock> list = new ArrayList<Stock>();
			Stock stock = new Stock(shareName, numOfShare,sharePrice);		
				
			public double getStockValue() {
				double stockvalue = numOfShare*sharePrice;
				return stockvalue;	
				
			}
			public static void main(String[] args) {

				System.out.println("Enter the number of Stocks : ");
				Scanner sc = new Scanner(System.in);
				int N = sc.nextInt();
				for (int i = 0; i < N; i++) {
					System.out.println("Enter Share Name"+i+" : ");
					String shareName = sc.next();
					System.out.println("Enter Number of shares"+i+" : ");
					int numOfShares = sc.nextInt();
					System.out.println("Enter Share price "+i+ ":$");
					double sharePrice = sc.nextDouble();
					list.add(new Stock(shareName, numOfShares, sharePrice));
					System.out.println("The Stock Value of "+shareName+ " is: $");
				}
				System.out.println(list+"\n");
				double stockvalue = numOfShare*sharePrice;
				System.out.println("stock value is : "+stockvalue);
				sc.close();
			}
	}


