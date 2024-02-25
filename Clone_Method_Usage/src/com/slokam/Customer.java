package com.slokam;

public class Customer {

	public static void main(String[] args) {
		 
		Bank k = new Bank();
		
		Thread t = new Thread() {
			public void run() {
				k.withdraw(6000);
				 
			}
		};
		t.start();
		
		
		 
		Thread t2 = new Thread() {
			public void run() {
				k.withdraw(7000);
			}
		};
		t2.start();
		
		
		//Bank k1 = new Bank();
		Thread t1 = new Thread() {
			public void run() {
				try {
					Thread.sleep(2000);
					//k1.deposit(14000);
					k.deposit(14000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			}
		};
		t1.start();

		 
		
		 
	}

}
