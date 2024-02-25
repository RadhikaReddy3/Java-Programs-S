package com.slokam;

public class Bank {
	public double balance=5000;
	
	 
	
	public synchronized void deposit(double dp) {
		
		System.out.println("Deposit Task started---");
		
		System.out.println("Current Balance before  deposit: "+balance);
		System.out.println("deposited amount: "+dp);
		  balance= dp+balance;
		  
		System.out.println("current balance after deposit: "+balance);
		 
		System.out.println("Notifying the waiting thread");
		//notify();
		notifyAll();
		System.out.println("Deposit Task ended--");
		
		 
	}
public synchronized void withdraw(double wd) {
	
	System.out.println("Withdraw Task started---");
		if(balance>=wd) {
			System.out.println("Withdraw started:");	
	    System.out.println("Current Balance before Withdraw: "+balance);
		System.out.println("withdraw amount: "+wd);
		  balance= balance-wd;
		System.out.println("Current balance after Withdraw: "+balance);
		System.out.println("withdraw completed----");
	     }
		else 
		{
			 
			System.out.println("Insufficient Funds");
			try {
		       System.out.println("withdraw thread is in waiting state ");
				wait();
			 System.out.println("Notification received");
				balance=balance-wd;
				System.out.println("balance after withdraw: "+balance);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("withdraw task completed-----");
	}
	 

}
