package com.bank;

public class ICICI extends Cebi{

	public ICICI(String Bankname) {
		super(Bankname);
	}

	private final double roi = 10.5;

	@Override
	public double getLoan(double amount) {
		
		double tamount = (amount/100)*roi;
		return tamount;
		//return (amount/100)*roi;
	}

}
