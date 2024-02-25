package Synchronize;

public class Bank{

 public synchronized void m1() {
	 for(int i=1;i<=10;i++) {
		 System.out.println(Thread.currentThread().getName()+"-syn-----m1 method---"+i);
	 }
	 System.out.println("\n\n");
 }
 
 public void m2() {
	 for(int i=1;i<=10;i++) {
		 System.out.println( Thread.currentThread().getName()+"Normal m2 method: "+i);
	 }
 }

 
 public  static synchronized void m3() {
	 for(int i=1;i<=10;i++) {
		 System.out.println(Thread.currentThread().getName()+"-static syn--m1 method---"+i);
	 }
	 System.out.println("\n\n");
 }
 

}
