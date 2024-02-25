package Deamon_Thread_Intro;

public class Testdeamon {
	
	
	public void m1() {
		System.out.println(Thread.currentThread().isDaemon());
		
		
		for(int i=0;i<=10;i++) {
		try {
			//Thread.sleep(1000);
			Thread.sleep(5000);
			System.out.println("Thread Name: "+Thread.currentThread().getName()+"--m1--"+i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		}
	}
	
	public void m2() {
		System.out.println(Thread.currentThread().isDaemon());
		for(int i=0;i<=10;i++) {
			try {
				//Thread.sleep(1000);
				Thread.sleep(4000);
				System.out.println("Thread Name: "+Thread.currentThread().getName()+"--m2--"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		}
	}

	public void m3() {
		System.out.println(Thread.currentThread().isDaemon());
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(2000);
				System.out.println("Thread Name: "+Thread.currentThread().getName()+"--m3--"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		}
	}
	public static void main(String[] args) {
		 
          Testdeamon d = new Testdeamon();
          
          Thread t = new Thread() {
        	  public void run() {
        		  d.m1();
        	  }
          };
          t.setDaemon(true);
          t.start();
          
          Thread t1 = new Thread() {
        	  public void run() {
        		  d.m2();
        	  }
          };
          //t1.setDaemon(true);
          t1.start();
          
          Thread t2 = new Thread() {
        	  public void run() {
        		  d.m3();
        	  }
          };
          //t2.setDaemon(true);
          t2.start();
          
	}

}
