//For Yield method the performance is slow


public class TestYield extends Thread {

	public void run() {
	
		for(int i=1;i<=10;i++) {
			
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
			
		}
	}
	public static void main(String[] args) {
		 
       TestYield p = new TestYield();
       p.start();
       
       for(int i=1;i<=10;i++) {
			
			 
			System.out.println(Thread.currentThread().getName());
			
		}
       
	}

}
