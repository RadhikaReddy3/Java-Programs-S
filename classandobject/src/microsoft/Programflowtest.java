package microsoft;

public class Programflowtest {
	
	void m1() {
		m2();
		if(true) {
			 m2();
		}
		/*else{
			   m2();
		}*/
		
		 
		System.out.println("M1 is displayed");
		
	}
	
	void m2() {
		System.out.println("M2 is displayed");
		
	}

	public static void main(String[] args) {
		 
		Programflowtest t = new Programflowtest();
		t.m1();
		System.out.println("Completed");
		
		 
		
	}

}
