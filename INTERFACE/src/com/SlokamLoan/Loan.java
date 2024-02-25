package com.SlokamLoan;

public interface Loan {
	
	public static final int  processingfee = 300;
	
	public abstract void interestamount();
	public abstract double interestamount(double amount);
	public abstract void docs(String docs);
	
	

}
