package com.bank;

public class HDFC extends Cebi {

	public HDFC(String Bankname) 
	{
		super(Bankname);
	}
	
	private final double roi =9.5;
	
	@Override
	public double getLoan(double amount) {
		 
		double tamount = (amount/100)*roi;
		return tamount;
		//return (amount/100)*roi;
	}

	 
	 

}
