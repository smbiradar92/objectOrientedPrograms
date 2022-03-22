package com.stockaccountmanagement;

public class Stock {


	String shareName;
	int numOfShare;
	double sharePrice;

	public Stock(String shareName, int numOfShares,
			double sharePrice) {
		super();
		this.shareName = shareName;
		this.numOfShare = numOfShares;
		this.sharePrice = sharePrice;
	}

		@Override
	public String toString() {
		return "Share [shareName=" + shareName
				+ ", numOfShare=" + numOfShare
				+ ", sharePrice=" + sharePrice + "]";
	}

		public double getStockValue() {
				double stockvalue = numOfShare*sharePrice;
				return stockvalue;
			}

}

