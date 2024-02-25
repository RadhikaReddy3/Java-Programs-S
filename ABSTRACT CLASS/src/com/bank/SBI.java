package com.bank;

public class SBI extends Cebi{
	 

	public SBI(String Bankname)//Her SBI value came this SBI value kept in below  Bankname and given as super as we given as super it goes to cebi public cebi method
	{
		super(Bankname);
		 
	}

	public final double roi = 8.5;

	@Override
	public double getLoan(double amount) {
		
		double tamount = (amount/100)*roi;
		
		return tamount  ;
		//return (amount/100)*roi;
	}

}