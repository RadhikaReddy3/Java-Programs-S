package com.slokam;

public class ATMelsenestedif {

	public static void main(String[] args) {
		double balance = 6000;
		boolean atmcard = true;
		int pin = 1234;
		int OTP = 1234;
		double wd = 3000;
     if (atmcard) {
    	 System.out.println("ATM Card is valid");
    	   if(pin == 12345) {
    		   System.out.println("pin is valid");
    		      if(wd<=balance) {
    		    	  System.out.println("Transcation sucess------"+(balance-wd));  
    		    	  }
    		          else{
        		    	  System.out.println("ATM card is invalid");
		                  }
    		            }
    	                else {
    		    	           System.out.println("Pin is invalid");
    		    	           System.out.println("Try with OTP");
    		    	           
    		    	           if(OTP == 1234) {
    		    	        	   System.out.println("Previous balance"+balance);
    		    	        	   System.out.println("Transaction success: "+"\n"+"Current balance: "+(balance-wd));
    		    	           }
    		                 }

    	   }
           else {
    		   System.out.println("Transaction falied");
    	   }
     System.out.println("Thank you Take your card");
   }

	

}
