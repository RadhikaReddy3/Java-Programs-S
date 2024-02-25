package com.overload;

public class Login {
	
	public double m1() {
		System.out.println("m1 method");
		return 1.2;
	}
	public int m1(int h) {
		System.out.println(h);
		return 12;
	}

	public static void main(String[] args) {
		 Login o = new Login();
		 o.m1();
		 o.m1(15);

	}

}
