package Synronization;

public class ticket {
	
	public void getdata() throws InterruptedException {
		for(int i=1; i<=10;i++) {
			 Thread.sleep(500);
			System.out.println(i+"---i name---"+Thread.currentThread().getName());
		}
		System.out.println("first loop completed");
		synchronized (this) {
			 
		 
		for(int j=1; j<=10;j++) {
			 Thread.sleep(500);
			System.out.println(j+"---j name---"+Thread.currentThread().getName());
		}}
	}
	
	public void getdata1() throws InterruptedException {
		for(int i=1; i<=10;i++) {
			 Thread.sleep(500);
			System.out.println(i+"---i name---"+Thread.currentThread().getName());
		}
		System.out.println("first loop completed");
		synchronized (ticket.class) {
			 
		 
		for(int j=1; j<=10;j++) {
			 Thread.sleep(500);
			System.out.println(j+"---j name---"+Thread.currentThread().getName());
		}}
	}

	 

}
