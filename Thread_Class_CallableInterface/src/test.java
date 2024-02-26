
public class test extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		test r = new test();
		 Thread t = new Thread(r);
		 t.start();
	}

}
