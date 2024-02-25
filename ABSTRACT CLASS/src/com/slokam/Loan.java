package com.slokam;

public abstract class Loan {
	
	int h=12;
	static int a=12;
	int k =23;
	public Loan() {
		System.out.println("def constructor");
	}
	
	public abstract void m1();
	//public abstract void m5();
	public void m2() {
		System.out.println("abstract class implemented methods");
	}

	{
		System.out.println("instance block");
	}
	
	static
	{
		System.out.println("static block");
	}
	public static void m3() 
	{
		System.out.println("static method");
	}
}
