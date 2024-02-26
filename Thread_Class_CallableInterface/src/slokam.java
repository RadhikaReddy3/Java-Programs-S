import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class slokam implements Callable<String>{

	
	public String call() throws Exception{
		for(int i=0;i<= 10;i++) {
		System.out.println("call method--"+Thread.currentThread().getName());
		Thread.sleep(500);
		}
		System.out.println("Task Completed");
		return Thread.currentThread().getName();
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es =  Executors.newFixedThreadPool(2);
		slokam s = new slokam();
		
		Future<String> st=es.submit(s);
		String sn =st.get();
		System.out.println(sn);
		
		Future<String> st1=es.submit(s);
		String sn1 =st.get();
		System.out.println(sn1);
		
		Future<String> st2=es.submit(s);
		String sn2 =st.get();
		System.out.println(sn2);
	}
}
