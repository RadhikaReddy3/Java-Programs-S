package Synchronize;

public class Bank1 extends Thread{

	public static synchronized void m1() {
		 for(int i=1;i<=10;i++) {
			 System.out.println(" Static syn m1 method: "+i+Thread.currentThread().getName());
		 }
		 
	 }
	 
	 public static synchronized void m2() {
		 for(int i=1;i<=10;i++) {
			 System.out.println("Static syn m2 method: "+i+Thread.currentThread().getName());
		 }}
		 
		 public static   void m3() {
			 for(int i=1;i<=10;i++) {
				 System.out.println("Static m2 method: "+i+Thread.currentThread().getName());
			 }}
		 public void m4() {
			 for(int i=1;i<=10;i++) {
				 System.out.println("Normal m2 method: "+i+Thread.currentThread().getName());
			 }}

		 
}
