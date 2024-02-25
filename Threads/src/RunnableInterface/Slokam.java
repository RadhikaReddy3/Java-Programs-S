package RunnableInterface;

public class Slokam extends Employee implements Runnable   {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		 
		
	}

	public static void main(String[] args) {
	 	 
		Slokam s = new Slokam();
		Employee e = new Employee();
		System.out.println(e);
		Thread t = new Thread(s);
		t.start();
		
		

	}
 

}
