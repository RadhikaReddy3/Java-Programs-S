package microsoft;
import java.util.Scanner;
public class BankAtm 
{
	
	int Balance =3000;
	
	void withdraw(int wamount) {
		System.out.println("Your Current Balance: "+Balance);
		System.out.println("Withdraw amount: "+wamount);
		if(wamount<=Balance) 
		{
			Balance = Balance - wamount;
			System.out.println("Withdraw Successful" );
			System.out.println("Current balance after withdraw: "+Balance+"\n\n\n");
		}
		else 
		{
			System.out.println("Transaction Failed");
		}
		
	}
	void deposit(int damount)
	{
		System.out.println("Your Current Balance: "+Balance);
		System.out.println("Deposit amount: "+damount);
		 Balance = Balance+damount;
		 System.out.println("Current balance after deposit: "+Balance+"\n\n\n");
	}

	public static void main(String[] args) 
	{
        
		/*Atm a = new Atm();
		a.withdraw(2000);
		a.deposit(5000);*/
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter withdraw amount: ");
		int wdraw = s.nextInt();
		BankAtm a = new BankAtm();
		a.withdraw(wdraw);
        
		System.out.println("Enter deposit amount: ");
		int des = s.nextInt();
		a.deposit(des);

		System.out.println("---Please collect your card---");
        
		s.close();
	}

}
