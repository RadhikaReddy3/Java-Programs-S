package Synchronized_Block;

/*public class one  {

	public void m1() {
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		 
       one t = new one();
       Thread p = new Thread() {
    	   public void run() {
    		   t.m1();
    	   }
       };
       p.start();
       
       Thread p1 = new Thread() {
    	   public void run() {
    		   t.m1();
    	   }
       };
       p1.start();
       
       
	}

}*/


/*public class one  {

	public synchronized void m1() {
		for(int i=1;i<=10;i++) {
		System.out.println("Thread Name: "+i+Thread.currentThread().getName());
		
		}
		
	for(int i=1;i<=15;i++) {
		
		System.out.println("Thread Name: "+i+Thread.currentThread().getName());
		
	}
	
	
	
	}
	
	public static void main(String[] args) {
		 
       one t = new one();
       Thread p = new Thread() {
    	   public void run() {
    		   t.m1();
    	   }
       };
       p.start();
       
       Thread p1 = new Thread() {
    	   public void run() {
    		   t.m1();
    	   }
       };
       p1.start();
       
       
	}

}*/





/*public class one  {

	
	
	public void m1() {
		
		System.out.println("First for loop data consistency not required"+"\n"+"Any no of threads will enter and run parallely");
		//This For loop doesnot require data consistency(Eg: For Flight ticket booking login, registration doesnot require data consitency any one can perform parallely*/
		/*for(int i=1;i<=10;i++) {
		System.out.println("Thread Name: "+i+Thread.currentThread().getName());
		
		}
		 
	synchronized(this) {
		System.out.println("\n\n");
		System.out.println("Second for loop data consistency required"+"\n"+"Single no of thread will enter and run one by one");
		//This For loop require data consistency(Eg: While Booking seats and while transactions)
	for(int i=1;i<=15;i++) {
		
		System.out.println("Thread Name: "+i+Thread.currentThread().getName());
		
	}
	
	}
	
	}
	
	public static void main(String[] args) {
		 
       one t = new one();
       Thread p = new Thread() {
    	   public void run() {
    		   t.m1();
    	   }
       };
       p.start();
       
       Thread p1 = new Thread() {
    	   public void run() {
    		   t.m1();
    	   }
       };
       p1.start();
       
       
	}

}*/


public class one  {

	
	
	public void m1() {
		
		//System.out.println("First for loop data consistency not required"+"\n"+"Any no of threads will enter and run parallely");
		//This For loop doesnot require data consistency(Eg: For Flight ticket booking login, registration doesnot require data consitency any one can perform parallely*/
		for(int i=1;i<=10;i++) {
		System.out.println("Thread Name: "+i+Thread.currentThread().getName());
		
		}
		 
	synchronized(one.class) {
		System.out.println("\n\n");
		System.out.println("Second for loop data consistency required"+"\n"+"Single no of thread will enter and run one by one");
		//This For loop require data consistency(Eg: While Booking seats and while transactions)
	for(int i=1;i<=15;i++) {
		
		System.out.println("Thread Name: "+i+Thread.currentThread().getName());
		
	}
	
	}
	
	}
	
	public static void main(String[] args) {
		 
       one t = new one();
       Thread p = new Thread() {
    	   public void run() {
    		   t.m1();
    	   }
       };
       p.start();
       
       Thread p1 = new Thread() {
    	   public void run() {
    		   t.m1();
    	   }
       };
       p1.start();
       
       
       
       
       one t1 = new one();
       Thread p2 = new Thread() {
    	   public void run() {
    		   t1.m1();
    	   }
       };
       p2.start();
       
       Thread p3 = new Thread() {
    	   public void run() {
    		   t1.m1();
    	   }
       };
       p3.start();
       
       
	}}


