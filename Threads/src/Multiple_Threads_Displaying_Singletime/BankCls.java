package Multiple_Threads_Displaying_Singletime;

public class BankCls {
	
	public double balance = 10000;
	
	public void withdraw(double wamount) {
		if(wamount>=balance) {
			System.out.println("Insufficient Funds"); 
		}
		else {
		System.out.println("Withdraw Amount: "+wamount);
		balance=(balance-wamount);
		System.out.println("Balance Amount: "+(balance));
		}
	}
	public void deposit(double damount) {
		System.out.println("Deposited Amount:"+damount);
		System.out.println("Amount after deposit:"+(balance+damount));
	}
 

}

 

 
