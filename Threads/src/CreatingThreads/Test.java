package CreatingThreads;

//public class Test extends Siva{ 
public class Test extends Thread {

	public void run() {
		System.out.println("Test run---"+Thread.currentThread().getName());
		
		for(int i=1;i<=10;i++) {
			
			System.out.println("Thread Zero: "+i+Thread.currentThread().getName());
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		//Has A Relation
		//Siva s = new Siva();
		//s.start();
        
		//Has A Relation
		//Thread s=new Thread();
		//s.start();
		
		
		System.out.println("main---"+Thread.currentThread().getName());
		//Is A Relation
		Test t = new Test();
		t.start();
		 
		
		
        for(int i=1;i<=30;i++) {
			
			System.out.println("Main Thread: "+i+Thread.currentThread().getName());
			
		}
		
		
	}

}
