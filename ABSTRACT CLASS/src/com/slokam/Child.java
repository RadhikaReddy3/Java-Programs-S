package com.slokam;

//public  abstract class Child extends Loan
public class Child extends Loan{
	
	@Override
	public void m1() {
		 System.out.println("child implemented m1 method");
		
	}

	public static void main(String[] args) {
		 
         Child c = new Child();
         System.out.println(c.h);
         
         System.out.println(c.k);
         c.k=56;
         System.out.println(c.k);
         
         Loan d = new Child();
         System.out.println(d.h);
         System.out.println(c.k);
	}

	 

}
