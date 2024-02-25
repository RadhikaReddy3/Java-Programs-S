package Join;

/*public class Siva extends Thread {
	
	public void m1() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"---"+i);
		}
		 
	}

	public static void main(String[] args) {
		 
		Siva s = new Siva();
		
		Thread t = new Thread() {
			public void run() {
				s.m1();
			}
			
			
		};
		t.start();
		 try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread t1 = new Thread() {
			public void run() {
				s.m1();
			}
			
			
		};
		t1.start();
		
		/*(try {
			System.out.println("join");
			t1.join();
			System.out.println("end join");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread t2 = new Thread() {
			public void run() {
				s.m1();
			}
			
			
		};
		t2.start();

	}
}*/


 

public class Siva extends Thread {

	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				for(int i=0;i<=10;i++) {
				System.out.println(Thread.currentThread().getName()+"----"+i);
				}
			}
		};
		t.start();
		try {
			System.out.println("join method started");
			t.join();
			System.out.println("join method completed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0;i<=10;i++) {
					System.out.println(Thread.currentThread().getName()+"----"+i);
					}
			}
		};
		t1.start();
		/*try {
			System.out.println("join method started");
			t1.join();
			System.out.println("join method completed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0;i<=10;i++) {
					System.out.println(Thread.currentThread().getName()+"----"+i);
					}
			}
		};
		t2.start();
		/*try {
			System.out.println("join method started");
			t2.join();
			System.out.println("join method completed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		

	}

}
