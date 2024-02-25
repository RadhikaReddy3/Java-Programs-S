 package microsoft;
//import java.util.Scanner;
public class shopbill {
	double vat=10;
	
	void cbill(double bill,double dis) 
	{
		double vatamount = (bill/100)*vat;
		System.out.println("Vat amount on your purchase: "+vatamount);
		double discount = (bill/100)*dis;
		System.out.println("discount amount on your purchase%: "+discount);
		double fbill = (bill+vatamount)-discount;
		System.out.println("Final bill on your purchase: "+fbill);
		
	}
	
	void sbill(int quantity, double price) 
	{
		System.out.println("Quantity purchased: "+quantity+"\n");
		System.out.println("Price of the product: "+price);
		double bill = quantity*price;
		System.out.println("Bill without vat and discount: "+bill);
		
		if(bill>0 && bill<=1000) 
		{
			   double dis = 5;
			   cbill(bill, dis);
			  
		}
		else if(bill>1001 && bill<=15000)
		{
			double dis = 10;
			cbill(bill, dis);
		}
		else if(bill>15001 && bill<=25000)
		{
			double dis = 15;
			cbill(bill, dis);
		}
		else {
			System.out.println("An problem encountered");
		}
		
		
	}

	public static void main(String[] args) {//static methods
	  
		Shopdis s = new Shopdis();
		s.sbill(1,1000);
		/*//s.sbill(1,12000);
		//s.sbill(16,1000);
		//s.sbill(0,1000);*/
		
		 /*Scanner sc = new Scanner(System.in);
		 System.out.println("Enter quantity: ");
		 int q = sc.nextInt();
		 System.out.println("Enter discount: ");
		 double d = sc.nextDouble();
		 
		 Shopdis s = new Shopdis();
	     s.sbill(q,d);
	     
	     sc.close();*/
	     
		System.out.println("Thank you visit again");  
		 
		 
		
	}

}
