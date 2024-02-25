package com.bank;

public abstract class Cebi {
	
	public Cebi(String Bankname){
		System.out.println("Bankname: "+Bankname);//this is constructor
		
		//here sbi comes and prints 
	}
	
	public boolean checktransaction(String pannumber) {
		System.out.println("Verifying the transactions---");
		return true;
		//return false;
		
	}
	
	public abstract double getLoan(double amount);

}
