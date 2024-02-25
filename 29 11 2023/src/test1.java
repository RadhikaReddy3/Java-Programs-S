
public class test1 {
	public void m1(employee e) {
		
	}
    public void m2(employee e) {
    	employee e2 = new employee(); 
	}
	public static void main(String[] args) {
		 
		employee e = new employee();
		employee e1 = new employee();
		e=null;
		e1=null;
		//e=e1;
		
		test1 t = new test1();
		t.m1(new employee());
		//System.gc();
		Runtime.getRuntime().gc();//(ANOTHER WAY OF CALLING GARBAGE COLLECTOR)
		System.out.println("hello");
		
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
		 
	}

}
