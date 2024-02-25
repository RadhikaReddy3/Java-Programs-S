package com.slokam;

public class ATMifseries {

	public static void main(String[] args) {
		double balance = 9000;
		boolean atmcard = true;
		int pin = 3456;
		double wd = 7000;
		
		if(atmcard) {
			System.out.println("ATM Card is valid");
		}
		if(pin == 3456) {
			System.out.println("Pin is correct");
		}
		if(wd<=balance) {
			System.out.println("transaction done"+"\n\n\n"+"Balance Amount is"+(balance-wd));
		}
		 

	}

}
//But here you can observe that if we entered wrong pin also amount is withdrawed so, this series of if statements approach is wrong we need nested if or nested if else for marks for that it will workout