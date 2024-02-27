package Synronization;

public class test {

	public static void main1(String[] args) {
		ticket s = new ticket();
		Thread t = new 	Thread() {
			public void run() {
				 try {
					s.getdata();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		t.start();
		
		
		 
		
		
		Thread t1 = new 	Thread() {
			public void run() {
				 try {
					s.getdata();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		t1.start();

	}
	
	public static void main(String[] args) {
		ticket s = new ticket();
		Thread t = new 	Thread() {
			public void run() {
				 try {
					s.getdata1();
				} catch (InterruptedException e) {
					 
					e.printStackTrace();
				}
				
			}
		};
		t.start();
		
		
		 
		ticket s1 = new ticket();
		
		Thread t1 = new 	Thread() {
			public void run() {
				 try {
					s1.getdata1();
				} catch (InterruptedException e) {
					 
					e.printStackTrace();
				}
				
			}
		};
		t1.start();

	}


}
