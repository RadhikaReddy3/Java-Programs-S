package com.test;

//public class A extends B
//public class A extends B implements I1,I2
//public class A extends M implements I1,I2
//public class A extends M implements I1
public class A extends B implements I1{

	@Override
	public void m2() {
		 System.out.println("I am I2 method");
		
	}

	@Override
	public void m1() {
		 System.out.println("Iam I1 method");
		
	}

}
