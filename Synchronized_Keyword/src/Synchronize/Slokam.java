package Synchronize;

public class Slokam {

	public static void main(String[] args) {
		 
		Bank b = new Bank();
		
		Thread t = new Thread() {
			
			public void run() {
				b.m3();
				//b.m2();
			}
		};
		t.start();
		
		//Bank b1= new Bank();
		Thread t1 = new Thread() {
			 
			public void run() {
				//b.m2();
				b.m3();//class level lock
				//b.m1();//object level lock
			}
		};
		t1.start();
		
		
Thread t2 = new Thread() {
			
			public void run() {
				//b.m1();
				b.m2();
			}
		};
		t2.start();

	}

}


 