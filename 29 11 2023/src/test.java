
public class test {
	public void m1(employee e) {
		System.out.println(e);
	}
	public void m2() {
		
		//4th way
		employee e1 = new employee();
	}

	public static void main(String[] args) {
		 employee e = new employee();
		 employee e1 = new employee();
		//1st way
		 e=e1;
		 //2nd way
		 /*e=null;
		 System.out.println(e.toString());*/
		 
		 
		 test b = new test();
		 //3rd way
		 b.m1(new employee());
		 
		 //4th way
		 b.m2();
		 b.m2();
		 
		 System.out.println("hello");
		 
		  
		 

	}

}
