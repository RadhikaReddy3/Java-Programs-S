package com.SlokamLoan;

public class HouseLoan implements Loan {

 
		public static double interest =12.0;
		 
		@Override
		public void interestamount() {
			 System.out.println("interest amount");
			  
		}
		public void docs(String docs) {
			 
			System.out.println("House documents verify");
		}
		 
			
		public double interestamount(double amount) {
			
		    double value=(amount/100)*interest;
		
		return value+Loan.processingfee;
		};

		 
		public static void main(String[] args) {
			 
			HouseLoan c = new  HouseLoan();
			c.docs("verified");
			System.out.println(processingfee);

		}


		 

		 

	}

	 

	 


