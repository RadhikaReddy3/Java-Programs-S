package Throw;

public class ATM {
	
	//If you have good network and sufficient funds 
	
	public static boolean flag=true; 
	public static int balance = 3000;
	public static double withdraw=2000;



	public static void main(String[] args) {
	
		if(flag) {
			System.out.println("Network is available you can withdraw amount");
			if(balance>withdraw) {
				System.out.println("Transaction Successfull");
			}
			else {
				try {
				throw new InsufficientFunds("Please check your balance");
				}
				catch(InsufficientFunds f) {
					System.out.println(f);
				}
			}
		}
		else {
			throw new Server("You can try after sometime server is busy");
		}

	}

	//If you dont have good network but you sufficient Funds
	
	/*public static boolean flag=false;
	public static int balance = 3000;
	public static double withdraw=2000;



	public static void main(String[] args) {
	
		if(flag) {
			System.out.println("Network is available you can withdraw amount");
			if(balance>withdraw) {
				System.out.println("Transaction Successfull");
			}
			else {
				try {
				throw new InsufficientFunds("Please check your balance");
				}
				catch(InsufficientFunds f) {
					System.out.println(f);
				}
			}
		}
		else {
			throw new Server("You can try after sometime server is busy");
		}

	}*/
	
	
	//If you have good network but you insufficient Funds
	
	/*public static boolean flag=true; 
	public static int balance = 3000;
	public static double withdraw=200000;



	public static void main(String[] args) {
	
		if(flag) {
			System.out.println("Network is available you can withdraw amount");
			if(balance>withdraw) {
				System.out.println("Transaction Successfull");
			}
			else {
				try {
				throw new InsufficientFunds("Please check your balance");
				}
				catch(InsufficientFunds f) {
					System.out.println(f);
				}
			}
		}
		else {
			throw new Server("You can try after sometime server is busy");
		}

	}*/


	
	
}
