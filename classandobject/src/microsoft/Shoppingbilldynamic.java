package microsoft;

import java.util.Scanner;
public class Shoppingbilldynamic {
	
	double vat = 10;
	
	void bill(int quantity, double price) {
		System.out.println("Enter the quantity: "+quantity);
		System.out.println("Enter the Price: "+price);
		double cvat = ((quantity*price)/100)*vat;
		//double cvat = (quantity*price)/vat;
		
		System.out.println("cvat on your bill: "+cvat);
		double fbill = (quantity*price)+cvat;
		System.out.println("Final bill with vat added: "+fbill);
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the quantity: ");
		int q = s.nextInt();
		System.out.println("Please enter the price: ");
		double p = s.nextDouble();
		 
		
		
		Shoppingbilldynamic b = new Shoppingbilldynamic();
		b.bill(q,p);
		
		s.close();
        
		
		

	}

}


/*What is the Purpose Of the Methods?
 
  
  Methods in Java serve the purpose of encapsulating reusable code blocks. For example:

```java
public int add(int num1, int num2) {
    return num1 + num2;
}
```

This method encapsulates the addition operation and can be reused throughout the program.*/





/*The difference between the two formulas lies in how they calculate the VAT based on the given percentage and total price:

1. `double cvat = ((quantity * price) / 100) * vat;`
   
   This formula calculates VAT as a percentage of the total price. It first calculates the total price by multiplying the quantity and price. Then, it calculates the VAT amount by taking 10% (the value of `vat`) of the total price. This is the correct formula to use when you want to calculate VAT as a percentage of the total price.

2. `double cvat = (quantity * price) / vat;`

   This formula calculates VAT as a fraction of the total price. It divides the total price (quantity * price) by the VAT rate (`vat`). If `vat` is 10 (representing 10%), this formula would give you a result that is 10 times smaller than the intended VAT amount. This formula is not correct when you want to calculate VAT as a percentage of the total price.

In summary, the first formula correctly calculates VAT as a percentage of the total price, while the second formula calculates VAT as a fraction of the total price, which is not the typical way to calculate VAT in most scenarios.*/
