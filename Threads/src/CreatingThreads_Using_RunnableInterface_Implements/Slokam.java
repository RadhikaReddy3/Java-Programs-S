package CreatingThreads_Using_RunnableInterface_Implements;

public class Slokam implements Runnable {
	

	 

	@Override
	public void run() {
	    System.out.println("Thread Name:"+Thread.currentThread().getName());
		 
		 /*for(int i=0;i<=20;i++) {
			 
			 System.out.println("Thread Name:"+i+Thread.currentThread().getName());
			 
		 }*/
		
	}
	public static void main(String[] args) {
		Slokam e = new Slokam();
		e.run();
		//e.start();(In Slokam Class there is no start method)
		
		Thread y= new Thread(e);
		y.start();
		//y.start();//(Not Possible)one instance can create one thread.
		//y.run();
		
		
		Thread y1= new Thread(e);
		y1.start();
	    //y1.run();

		Slokam e1=new Slokam();
		Thread y2= new Thread(e1);
		y2.start();
	}
}
