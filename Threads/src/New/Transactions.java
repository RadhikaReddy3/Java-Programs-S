package New;

public class Transactions {
      public double balance = 10000;
      public void withdraw(double wamount) {
    	  if(wamount<=balance) {
    	  System.out.println("withdraw amount: "+Thread.currentThread().getName()+wamount);
    	  balance= balance-wamount;
    	  System.out.println("Amount after withdraw: "+Thread.currentThread().getName()+balance); 
    	  }
    	  else {
    		  System.out.println("Insufficient funds");
    	  }
      }
      public void deposit(double deposit) {
    	  System.out.println("deposit amount: "+deposit);
    	  System.out.println("Amount after deposit: "+(balance+deposit));
      }
		 

	}


