package com.SlokamLoan;

public class LTest {

	public static void main(String[] args) {
		
		
		
		 Loan k = new CarLoan();
		 double intamount=k.interestamount(1000);
		 System.out.println("Car loan interest amount: "+intamount);
		 k.docs("cardocs");
		 System.out.println("Processing fee:"+Loan. processingfee);
		 
		 /*System.out.println("\n");
		 Loan h = new HouseLoan();
		 double c = h.interestamount(10000);
		 System.out.println("House loan "+c);
		 
		 
		 System.out.println("\n");
		 
		 CarLoan u = new CarLoan();
		 k.docs("cardocs"+"\n");
		 
		 System.out.println("interest:"+ CarLoan.interest);
		  
		 System.out.println("\n");
		 
		 HouseLoan H = new HouseLoan();
         double inteamount=k.interestamount(1000);
		 
		 System.out.println("House loan "+inteamount);
		 System.out.println("interest:"+HouseLoan.interest);
		 
		 System.out.println("\n"+u+" "+h);*/
		 

	}

}
