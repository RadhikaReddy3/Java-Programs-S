package com.wipro;

public class two {
	 static int a = 23;//Static variable
	 
	 //Static Method
	 public static void m1() 
	 {
		 System.out.println("Static method");
	 }
	 //Static Block
	   static
	   {
		 System.out.println("Static Block");
	 }

	public static void main(String[] args) {
		 
		 System.out.println(a);
		 m1();
	 
		 

	}

}
