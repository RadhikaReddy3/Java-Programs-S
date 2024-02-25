
package Multiple_Threads_Displaying_Singletime;

public class Bank extends Thread {
	
	public void m1() {
		System.out.println("Withdraw: "+Thread.currentThread().getName());
	}
	public void m2() {
		System.out.println("Deposit: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		 
		Bank b = new Bank();
		Thread t = new Thread(b) {
			public void run(){
				b.m1();
			}
		};
		t.start();
		t.setName("Withdraw--m1");
		
		Thread t1 = new Thread(b) {
			public void run(){
				b.m2();
			}
		};
		t1.start();
		t1.setName("Deposit--m2");

	}

}
