package Multiple_Threads_Displaying_Singletime;
/*import java.util.Scanner;
public class BankWD extends Thread {
	
	public double deposit=0;
	public double Withdraw=0;
    public double Balance=0;
	
	public void m1() {
		System.out.println("Deposit: "+Thread.currentThread().getName());
		System.out.println("Deposit Amount: "+deposit);
	}
	public void m2() {
		
		if(Withdraw>=Balance) {
			System.out.println("Insufficient Funds");
		}
		else {
			
		System.out.println("Withdraw: "+Thread.currentThread().getName());
		System.out.println("Withdraw Amount: "+Withdraw);
        Balance=Balance-Withdraw;
        System.out.println("Amount after withdraw: "+Balance);
	}}

	public void m3() {
		System.out.println("Balance: "+Thread.currentThread().getName());
		System.out.println("Current Balance: "+(deposit-Withdraw));
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Deposited Amount:");
		 double deposit = sc.nextDouble();
System.out.println("Enter Withdraw Amount: ");
double Withdraw = sc.nextDouble();
         double balance = deposit; 
		 
		
		BankWD c =new BankWD();
		c.deposit=deposit;
		c.Balance=balance;
		c.Withdraw=Withdraw; 
		
		
 
		
		
		Thread k = new Thread() {
			
			public void run() 
			{
				 
				 c.m1();
	              
			}
		};
		k.start();
		k.setName("My Deposit Amount");
		
		
		
		Thread k1 = new Thread() {
			
			public void run()
			{
		        c.m2();
			}
		};
		k1.start();
		k1.setName("My Withdraw Amount");
		
		
		
		Thread k2=new Thread() {
			public void run() {
				 
				c.m3();
				  
			}
		};
		k2.start();
		k2.setName("My Balance Amount");
		 
	sc.close();
	}

}*/

import java.util.Scanner;

public class BankWD {
    public double withdraw;
    public double deposit;

    public void m1() {
        System.out.println("Deposit Amount: " + deposit);
        System.out.println("Deposit " + Thread.currentThread().getName());
    }

    public void m2() {
        System.out.println("Withdraw Amount: " + withdraw);
        System.out.println("Deposit ---- " + Thread.currentThread().getName());
    }

    public void m3() {
    	double Balance = (deposit - withdraw);
        System.out.println("Current Balance: " + Balance);
        System.out.println("Balance ---- " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        BankWD k = new BankWD();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Withdraw Amount: ");
        k.withdraw = s.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        k.deposit = s.nextDouble();
        Thread t = new Thread(){
        	public void run() 
        	{
        		k.m1();
            }
           };
        t.start();
       Thread t1 = new Thread()
		{
	       public void run() {
		   k.m2();
	    }
	  };
        t1.start();
        
        Thread t2 = new Thread()
 		{
 	    public void run() {
 		k.m3();
 	   }
 	};
         t2.start();
    }}


