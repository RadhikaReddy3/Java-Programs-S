package com.ParentandChild;

public class Two {
	
	public void m1() {
		m2();
	}
	public void m2() {
		m3();
	}
	
	//Normal termination
	/*public void m3() {
		System.out.println("Hi Iam M3 method");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("M3 method completed: "+10/2);
	}*/
	/*//Abnormal Termination
	public void m3() {
		System.out.println("Hi Iam M3 method");
		try {
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("M3 method completed: "+10/2);
	}*/

	
	
	public void m3() {
		System.out.println("Hi Iam M3 method");
		try {
			System.out.println(10/5);
			String [] k= {"siva","ram"};
			System.out.println(k[0]);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e+"hi");
		}
		 
		System.out.println("M3 method completed: "+10/2);
	}
	public static void main(String[] args) {
		 Two t = new Two();
		 t.m1();

	}

}
