package com.wipro;

public class one {
	
	int x = 23;//instance variable
	//instance method
	public void m1() {
		System.out.println("instance method");
	}
	//instance block
	{
		System.out.println("instance block");
	}

	public static void main(String[] args) {
		
		one o =new one();
		System.out.println(o.x);
		o.x=33;
		System.out.println(o.x);
		o.m1();
		
		one o1 =new one();
		System.out.println(o1.x);
		o1.m1();
		
		 

	}

}
