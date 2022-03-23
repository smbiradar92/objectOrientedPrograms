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

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public int getNumOfShare() {
		return numOfShare;
	}

	public void setNumOfShare(int numOfShare) {
		this.numOfShare = numOfShare;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "Stock [shareName=" + shareName
				+ ", numOfShare=" + numOfShare
				+ ", sharePrice=" + sharePrice
				+ ", getStockValue()=" + getStockValue()
				+ "]";
	}

	public double getStockValue() {
		double stockvalue = numOfShare * sharePrice;
		return stockvalue;
	}

}
