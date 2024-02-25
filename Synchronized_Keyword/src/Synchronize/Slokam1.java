package Synchronize;

public class Slokam1 {

	public static void main(String[] args) {
		//Static Synchronized and static Synchronized 
		/*Bank1 b1 = new Bank1();
		
		Thread t = new Thread() {
			
			public void run() {
				b1.m1();
			}
		};
		t.start();
		
		 
		Thread t2 = new Thread() {
			 
			public void run() {
				b1.m2();
			}
		};
		t2.start();
		
		Bank1 b2= new Bank1();
		Thread t3 = new Thread() {
			 
			public void run() {
				b2.m2();
			}
		};
		t3.start();*/
		
		
		//Static Synchronized and static
		
     /*Bank1 b1 = new Bank1();
		
		Thread t = new Thread() {
			
			public void run() {
				b1.m1();
			}
		};
		t.start();  
		
		
		Thread t2 = new Thread() {
			 
			public void run() {
				b1.m3();
			}
		};
		t2.start();
		
		*/
		
		
		//static synchronized and normal
       /* Bank1 b1 = new Bank1();
		
		Thread t = new Thread() {
			
			public void run() {
				b1.m1();
			}
		};
		t.start();  
		
		
		Thread t2 = new Thread() {
			 
			public void run() {
				b1.m4();
			}
		};
		t2.start();*/
		
       /*Bank1 b1 = new Bank1();
		
		Thread t = new Thread() {
			
			public void run() {
				b1.m1();
				b1.m3();
			}
		};
		t.start();*/ 
		
		/*Bank1 b2 = new Bank1();
		Thread t1 = new Thread() {
			public void run() {
				
				b2.m1();
				b2.m2();
			 
			}
		};
		t1.start();*/
		
		Bank1 b3 = new Bank1();
		Thread t2 = new Thread() {
			public void run() {
				b3.m3();
				b3.m4();
				b3.m4();
			}
		};
		t2.start();
		
		
		
		

	}
	
	

}


