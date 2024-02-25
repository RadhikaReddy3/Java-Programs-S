package CreatingThreads_Using_RunnableInterface_Implements;

public class Facebook implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0;i<=20;i++) {
		 
		try {
			Thread.sleep(1500);
			System.out.println(Thread.currentThread().getName()+"---"+i);
			 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
	}

	public static void main(String[] args) {
		 
		
		Facebook f = new Facebook();
		//f.start();
		Thread p = new Thread(f);
		p.start();
		
		Facebook f1 = new Facebook();
		Thread p1 = new Thread(f1);
		p1.start();
		
		
		
	 

	}

	 

}
