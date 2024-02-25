 
//For ICICI Bank EMI
package com.bank;
public class Customer  {

	 

	public static void main(String[] args) {
		 
		Cebi c = new ICICI("ICICI");
		//Cebi c = new SBI("SBI");//First it goes to SBI Class constructor
		//Cebi c = new HDFC("HDFC");
		boolean flag =c.checktransaction("SREFjqw233");
		
		if(flag) {
			System.out.println("You are Eligible for Loan");
			
			//double monthlyemi = c.getLoan(100000);
			//System.out.println("EMI: "+monthlyemi);(Or we can write as below)
			
			System.out.println("EMI: "+c.getLoan(100000));
			 
		}
		else 
		{
			System.out.println("You are not Eligible for Loan");
		}
		
		

	}


	}


