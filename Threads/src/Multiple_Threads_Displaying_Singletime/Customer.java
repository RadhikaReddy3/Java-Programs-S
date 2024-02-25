package Multiple_Threads_Displaying_Singletime;

public class Customer {

	public static void main(String[] args) {
		 BankCls p = new BankCls();
		 
		 Thread t = new Thread() {
			 @Override
			 public void run() {
				 p.withdraw(3000);
				 p.deposit(100000);
			 }
			 
		 };
		 t.start();
		 

	}

} 





//Scanner Class M
/*import java.util.Scanner;


public class Customer {
	
public static void main(String[] args) {
    	
       BankCls  b = new BankCls();
       Scanner s = new Scanner(System.in);
       System.out.println("Enter deposit amount");
       double da = s.nextDouble();
      System.out.println("Enter withdraw amount");
       double wa = s.nextDouble();
       Thread t = new Thread()
    		   {
    	   public void run() {
    		   b.deposit(da);
    	   }
    		   };
       t.start();
       Thread t1 = new Thread()
    		   {
    	   public void run() {
    		   b.withdraw(wa);
    	   }
    	   
    		   };
       t1.start();
       
       
       
 
}
}*/