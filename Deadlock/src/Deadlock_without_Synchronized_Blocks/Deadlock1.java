package Deadlock_without_Synchronized_Blocks;

/*public class Deadlock1 {

	public void m1() {
		System.out.println("Hi Iam at m1 method");
		try {
			Thread.sleep(2000);
           	m2();
			 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hi---hello");
	}
	
	public void m2() {
		System.out.println("Hi Iam at m2 method"); 
		m1();
		try {
			 
			Thread.sleep(1000);
			 
			
		} catch (InterruptedException e) {
			
			 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	public static void main(String[] args) {
		 
		Deadlock1 d1= new Deadlock1();
		Thread t = new Thread() {
			public void run() {
				d1.m1();
				 
				 
			}
		};
		t.start();
		
		Thread t1 = new Thread() {
			public void run() {
				d1.m2();
				 
			}
		};
		t1.start();

	}

}*/



public class Deadlock1 {
	public  void m1() {
		System.out.println("i'm m1 method");
		try {
			Thread.sleep(1000);
			m2();
			System.out.println("i'm m2 method. i'm in m1 method");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		/* if (!Thread.holdsLock(this)) {
	            m2();
	        }*/
		
	}
	public  void m2() {
		System.out.println("i'm m2 method");
		try {
			Thread.sleep(2000);
			m1();
			System.out.println("i'm m1 method. i'm at m2 method");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		/*if (!Thread.holdsLock(this)) {
            m1();
        }*/
	
	}
	
	

	public static void main(String[] args) {
		Deadlock1 l = new Deadlock1();
		Thread t = new Thread() {
			public void run() {
				l.m1();
			}
		};
		t.start();
		
		Thread r = new Thread() {
			public void run() {
				l.m2();
			}
		};
		r.start();
		

	}

}
	
	
	
	
