package Callable_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class testcall implements Callable<String> {
	
	@Override
	public String call() throws Exception 
	{
		 
		return Thread.currentThread().getName();
	}

	/*public static void main(String[] args) throws InterruptedException, ExecutionException {
		
	 testcall t = new testcall();
     ExecutorService e = Executors.newFixedThreadPool(3);
      
     
     for(int i=1;i<=10;i++) {
    	 Future<String> p=e.submit(t);
    	   p.get();
    	   System.out.println(p.get());
     }
          
e.shutdown();
     
	}*/
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		 testcall t = new testcall();
	     ExecutorService e = Executors.newFixedThreadPool(3);
	     List<Future<String>> data = new ArrayList<>();//GetAll
	     
	     for(int i=1;i<=10;i++)
	     {
	    	 Future<String> p=e.submit(t);
	    	 data.add(p);
	     }
	    
	
	     
	     for(Future<String> h:data) 
	     {
	    	 String res =h.get();
	    	 System.out.println(res);
	     }
	     e.shutdown();
	     
}
	 

}
