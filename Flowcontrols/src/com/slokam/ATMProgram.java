package com.slokam;

public class ATMProgram {

	public static void main(String[] args) {
		 boolean vcard = false;
		 int pin = 3456;
		 double bal = 20000;
		 double wd = 10000;
		 if (vcard) {
		 System.out.println("Card is valid for transcation"+"\n");
	     }
		 else {
			 System.out.println("card is invalid"+"\n");
		 }
		 if(pin == 3456) {
			 System.out.println("correct pin"+"\n");
		 }
		 else {
			 System.out.println("incorrect pin"+"\n");
		 }
		 if(wd<=bal) {
			 System.out.println("shows balance"+"\n");
		 }
		 else {
			 System.out.println("insufficient funds");
		 }
		 

}}
/*
 Nested if
 
package com.slokam;

public class ATMProgram {

    public static void main(String[] args) {
        boolean validCard = true;
        int enteredPin = 3456;
        double accountBalance = 20000.0;
        double withdrawalAmount = 10000.0;

        if (validCard) {
            System.out.println("Card is valid for transaction");
            
            if (enteredPin == 3456) {
                System.out.println("Correct PIN");

                if (withdrawalAmount <= accountBalance) {
                    System.out.println("Transaction successful: Shows balance");
                } else {
                    System.out.println("Transaction failed: Insufficient funds");
                }
            } else {
                System.out.println("Transaction failed: Incorrect PIN");
            }
        } else {
            System.out.println("Transaction failed: Card is invalid");
        }
    }
}
*/

/* if - else -if statements


package com.slokam;

public class ATMProgram {

    public static void main(String[] args) {
        boolean validCard = true;
        int enteredPin = 3456;
        double accountBalance = 20000.0;
        double withdrawalAmount = 10000.0;

        if (!validCard) {
            System.out.println("Transaction failed: Card is invalid");
        } else if (enteredPin != 3456) {
            System.out.println("Transaction failed: Incorrect PIN");
        } else if (withdrawalAmount > accountBalance) {
            System.out.println("Transaction failed: Insufficient funds");
        } else {
            System.out.println("Card is valid for transaction");
            System.out.println("Correct PIN");
            System.out.println("Transaction successful: Shows balance");
        }
    }
}
*/