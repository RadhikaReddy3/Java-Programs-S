package microsoft;
import java.util.Scanner;
public class sbill {
	void bcall(int quantity, double price, double vat, double dis ) {
		System.out.println("Enter the quantity: "+quantity);
		System.out.println("Enter the Price: "+price+"\n");
		double bill = (quantity*price);
		System.out.println("Enter the bill without vat and discount : "+bill+"\n");
		double fvat = (bill/100)*vat;
		System.out.println("Enter the fvat on bill: "+fvat);
		double fdis = (bill/100)*dis;
		System.out.println("Enter the fdis on bill: "+fdis+"\n");
		double fbill = (bill+fvat)- fdis;
		System.out.println("Final Bill: "+fbill+"\n\n\n");	 
	}
	

	public static void main(String[] args) {
		
		sbill s = new sbill();
		/*sbill s = new sbill();
	    s.bcall(1, 1000, 10, 20);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity of product: ");
		int quantity = sc.nextInt();
		System.out.println("Enter the price of product: ");
		double price = sc.nextDouble();
		double vat = 10;
		double dis;
		
		double b = quantity*price;
		
		if(b>=0 && b<=1000) {
			dis = 5;
			System.out.println("Discount Slot: "+dis+"\n");
			s.bcall(quantity, price, vat, dis);
		}
		else if(b>=1001 && b<=10000) {
			dis = 10;
			System.out.println("Discount Slot: "+dis+"\n");
			s.bcall(quantity, price, vat, dis);
			 
		}
		else if(b>=10001 && b<=20000) {
			dis = 15;
			System.out.println("Discount Slot: "+dis+"\n");
			s.bcall(quantity, price, vat, dis);
		}
		
		else if(b>=20001) {
			dis = 20;
			System.out.println("Discount Slot: "+dis+"\n");
			s.bcall(quantity, price, vat, dis);
		}
		System.out.println("Thank you visit again");
		sc.close();

	}

}
