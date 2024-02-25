package CreatingThreads;

public class Slokam extends Thread{
	
	public void run() {
		for(int i=0;i<=20;i++) {
		System.out.println("Slokam Run: "+Thread.currentThread().getName());
		}}
	//1.We should not override start method because thread creation logic not present in our class
	//2.Suppose by mistake you overrided then write"super.start()"in overrided start method so that thread creates
	/*public void start() {
		System.out.println("Slokam main: "+Thread.currentThread().getName());
		super.start();
		run();
	}*/

	public static void main(String[] args) {

       Slokam s = new Slokam();
       s.start();//3.It takes some time to print
       s.setName("A0");
       s.run();
        
       //s.run();
       //s.start();//4.one instance can create only one thread
       Slokam s1 =new Slokam();//5.To create another thread another another instance
       s1.start();
       s1.setName("A1");
       //s1.setName("C1");
       
        
	}

}
