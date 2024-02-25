package com.displayingThreadName;

public class one {
	
	public void m1() {
		System.out.println("m1 start: "+Thread.currentThread().getName());
		m2();
		System.out.println("m1 end: "+Thread.currentThread().getName());
	}
	public void m2() {
		
		System.out.println("m2 start: "+Thread.currentThread().getName());
		
		for(int i=0;i<=100;i++) {
			System.out.println("For loop:"+i+"---"+Thread.currentThread().getName());
		}
		 
		System.out.println("m2 end: "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		one t = new one();
		System.out.println("main start: "+Thread.currentThread().getName());
		t.m1(); 
		System.out.println("main end: "+Thread.currentThread().getName());
               
	}

}
