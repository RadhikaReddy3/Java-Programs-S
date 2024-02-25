package com.A;

//private class one{
//protected class one{
//class one{
public class one {

//private, protected, def(variables)
	
	public int a = 13;
	
//private, protected, def(methods)
	
	public void m1() {
		System.out.println("Method executed");
	}
	 
	
	public static void main() {
		one h = new one();
		System.out.println(h.a);
		h.m1();
	}

}
