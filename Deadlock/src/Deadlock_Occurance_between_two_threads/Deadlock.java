package Deadlock_Occurance_between_two_threads;

/*public class Deadlock {
	
	public static final String name1 = "siva";
	public static final String name2 = "ram";
	
	public void m1() {
		System.out.println("Hi I am at synchronized m1 method ");
		
		synchronized(name1) {
			System.out.println(name1);
			
			try {
				Thread.sleep(3000);
				synchronized(name2) {
					System.out.println("Hi I am at synchronized m1 method ");
					System.out.println(name2);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void m2() {
		System.out.println("Hi I am at synchronized m2 method ");
		synchronized(name2) {
			System.out.println(name2);
	
		}
	}
	

	public static void main(String[] args) {
		 
       Deadlock d = new Deadlock();
       Thread t = new Thread() {
    	  public void run() {
    		  d.m1();
    	  }
       };
       t.start();
       
       
       Thread t1 = new Thread() {
     	  public void run() {
     		  d.m2();
     	  }
        };
        t1.start();
	}

}*/



public class Deadlock {
	
	public static final String name1 = "siva";
	public static final String name2 = "ram";
	
	public void m1() {
		System.out.println("Hi I am at m1 method ");
		
		synchronized(name1) {
			System.out.println(name1);
			
			try {
				Thread.sleep(10);
				synchronized(name2) {
					System.out.println("Hi I am at  m1 method ");
					System.out.println(name2);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
	public void m2() {
		System.out.println("Hi I am at synchronized m2 method ");
		synchronized(name2) {
			System.out.println(name2);
	
			try {
				Thread.sleep(10);
				synchronized(name1) {
					System.out.println("Hi I am at synchronized m2 method ");
					System.out.println(name1);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
	

	public static void main(String[] args) {
		 
       Deadlock d = new Deadlock();
       Thread t = new Thread() {
    	  public void run() {
    		  d.m1();
    	  }
       };
       t.start();
       
       
       Thread t1 = new Thread() {
     	  public void run() {
     		  d.m2();
     	  }
        };
        t1.start();
        
        
        System.out.println("----DEADLOCK SITUATION OCCURED IN THIS CASE-----");
	}

}
