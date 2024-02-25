package Join;

public class Slokam extends Thread {

	public static void main(String[] args) {
	
		Thread t = new Thread() {
			public void run() {
				for(int i=1;i<=10;i++) {
				System.out.println(i+Thread.currentThread().getName());
				}}
		};
		t.start();
		try {
			System.out.println("Join Started");
			t.join();
			System.out.println("Join Completed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Thread t1 = new Thread() {
			public void run() {
				
				for(int i=1;i<=10;i++) {
					System.out.println(i+Thread.currentThread().getName());
					}
			}
		};
		t1.start();
		

		Thread t2 = new Thread() {
			public void run() {
				
				for(int i=1;i<=10;i++) {
					System.out.println(i+Thread.currentThread().getName());
					}
			}
		};
		t2.start();
		

	}

}
