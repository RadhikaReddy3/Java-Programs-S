package Join_Introduction;

public class Join extends Thread {
	
	
	public void m1() {
		for(int i=1;i<=5;i++) {
		System.out.println("m1 method: "+i+" "+Thread.currentThread().getName());
	}}
	
	public void m2() {
		for(int i=1;i<=5;i++) {
		System.out.println("m2 method: "+i+" "+Thread.currentThread().getName());
	}}
	
	public void m3() {
		for(int i=1;i<=5;i++) {
		System.out.println("m3 method: "+i+" "+Thread.currentThread().getName());
	}}

	public static void main(String[] args) {
		 
		Join k = new Join();
		
		Thread t = new Thread() {
			public void run() {
			     k.m1();	
			}
		};
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread initiated---0");
		
		
		Thread t1 = new Thread() {
			public void run() {
			     //k.m2();
				k.m1();
			}
		};
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread initiated---1");
		
		
		Thread t2 = new Thread() {
			public void run() {
			     //k.m3();	
				k.m1();
			}
		};
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread initiated---2");
		
		
		
	}

}



 

/*public class Join{
	public void m1() {
		for(int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+"------"+i);
		}
	}

	public static void main(String[] args) {
		Join  j = new Join();
		Thread t = new Thread() {
			public void run() {
				j.m1();
			}
		};
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread intiated---0");
		Thread t1 = new Thread() {
			public void run() {
				j.m1();
			}
		};
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread intiated---1");
		Thread t2 = new Thread() {
			public void run() {
				j.m1();
			}
		};
		t2.start();
		System.out.println("Thread intiated---2");
		
		
		

	}

}*/
