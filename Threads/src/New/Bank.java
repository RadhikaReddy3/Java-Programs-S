package New;

import java.util.Scanner;
public class Bank extends Thread {

	public static void main(String[] args) {
		 
          Scanner s = new Scanner(System.in);
          System.out.println("Enter 1 for deposit");
          System.out.println("Enter 2 for withdraw");
          
          int option = s.nextInt();
          Transactions t =new Transactions();
          
          switch(option) 
          {
          
        
          
          case 1:
        	  
        	  
        	  Thread p =new Thread() {
        		  public void run() {
        			  System.out.println("Enter deposit amount");
        			  double deposit = s.nextDouble();
        			  t.deposit(deposit);
        		  }
        	  };
        	  p.start();
        	  p.setName("Deposit Amount-----");
        	  break;
        	  
          case 2:
        	  
        	  
        	  Thread p1 = new Thread() {
        		  public void run() {
        			  System.out.println("Enter withdraw amount: ");
        			  double withdraw = s.nextDouble();
        			  t.withdraw(withdraw);
        		  }
        	  };
        	  p1.start();
        	  p1.setName("Withdraw Amount-------");
        	 break; 
          }}
          
	}


