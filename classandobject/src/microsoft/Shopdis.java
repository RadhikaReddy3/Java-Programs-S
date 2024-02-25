package microsoft;
//import java.util.Scanner;
public class Shopdis {
	double vat=10;
	
	void sbill(int quantity, double price) {
		System.out.println("Quantity purchased: "+quantity);
		System.out.println("Price of the product: "+price);
		double bill = quantity*price;
		System.out.println("Bill without vat and discount: "+bill);
		
		if(bill>0 && bill<=1000) {
			double vatamount = (bill/100)*vat;//This is right formula
			//double vatamount = (bill)/vat;
			System.out.println("Vat amount on your purchase: "+vatamount);
			double discount = (bill/100)*5;
			System.out.println("discount amount on your purchase is 5%: "+discount);
			double fbill = (bill+vatamount)-discount;
			System.out.println("Final bill on your purchase: "+fbill);
		}
		else if(bill>1001 && bill<=15000){
			double vatamount = (bill/100)*vat;
			System.out.println("Vat amount on your purchase: "+vatamount);
			double discount = (bill/100)*10;
			System.out.println("discount amount on your purchase is 10%: "+discount);
			double fbill = (bill+vatamount)-discount;
			System.out.println("Final bill on your purchase: "+fbill);
			
		}
		else if(bill>15001 && bill<=25000){
			double vatamount = (bill/100)*vat;
			System.out.println("Vat amount on your purchase: "+vatamount);
			double discount = (bill/100)*15;
			System.out.println("discount amount on your purchase is 15%: "+discount);
			double fbill = (bill+vatamount)-discount;
			System.out.println("Final bill on your purchase: "+fbill);
			
		}
		else if(bill >= 25001){
		    double vatamount = (bill/100)*vat;
		    System.out.println("Vat amount on your purchase: " + vatamount);
		    double discount = (bill/100)*20;
		    System.out.println("discount amount on your purchase is 20%: " + discount);
		    double fbill = (bill + vatamount) - discount;
		    System.out.println("Final bill on your purchase: " + fbill);
		}
		else {
			 System.out.println("No discount on the purchased item");
		}

		 
		
		
	}

	public static void main(String[] args) {//static methods
	  
		Shopdis s = new Shopdis();
		s.sbill(1,1000);
		//s.sbill(1,14000);
		//s.sbill(1,23000);
		//s.sbill(1,50000);
		//s.sbill(0,12000);
		
		/*Scanner sc = new Scanner(System.in);
		 System.out.println("Enter quantity: ");
		 int q = sc.nextInt();
		 System.out.println("Enter discount: ");
		 double d = sc.nextDouble();
		 
		 Shopdis s = new Shopdis();
	     s.sbill(q,d);
	     
	     sc.close();*/ 
		 
		
	}

}
