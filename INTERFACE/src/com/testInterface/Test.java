package com.testInterface;

public class Test implements Siva {
	
	public void m1() {
		System.out.println("Hi I am at child m1 test class");
	}
	
	public void m2() {
		System.out.println("Hi I am at child m2 test class");
	}
	
	public void m3() {
		System.out.println("Hi I am at child m3 test class");
	}

	public static void main(String[] args) {
		
		System.out.println(Siva.h);
		Test t = new Test();//Test class is child 
		t.m1();
		t.m2();
		t.m3();
		
		Siva b = new Test();//Here Interface(Siva) is parent and Test Class is child so Sper class reference can hold child class object. 
		b.m1();
		b.m2();
		b.m3();
		
		//Siva c = new Siva();(For Interface object creation is not possible)

	}

}
