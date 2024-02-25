package com.SlokamLoan;

public class CarLoan implements Loan{
	
	
	public static final double interest=10.0;
	
	@Override
	public void docs(String docs) {
		 System.out.println("car docs verify");
		
	}
	
	@Override	
	public double interestamount(double amount) {
		
	    double value=(amount/100)*interest;
	
	return value+processingfee;
	};

	@Override
	public void interestamount() {
	 System.out.println(interest);
		
	}
	public static void main(String[] args) {
		 
		CarLoan c = new CarLoan();
		c.docs("verified");
		System.out.println(processingfee);

	}

	 

	 
	 

	 

}
