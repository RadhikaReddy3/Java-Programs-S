package com.ErrorsORUnchecked;

//Exception handled at m2 method itself

public class one {
	
	public void m1() {
		System.out.println("m1 call start");
		m2();
		System.out.println("m1 call end");
	}
	public void m2() {
		System.out.println("m2 call start");
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
	 
		System.out.println("m2 call end");
	}

	public static void main(String[] args) {
		 
		one o = new one();
		System.out.println("main method call start");
		 o.m1();
		System.out.println("main method call end");

	}

}


 

//Exception not handled
		/*public class one {
			
			public void m1() {
				System.out.println("m1 call start");
				m2();
				System.out.println("m1 call end");
			}
			public void m2() {
				System.out.println("m2 call start");
				 
				System.out.println(10/0);
				
				 
				System.out.println("m2 call end");
			}

			public static void main(String[] args) {
				 
				one o = new one();
				
				System.out.println("main method call start");
				o.m1();
				System.out.println("main method call end");
				

			}

		}*/



//Exception not handled at m2 method it is handled at m1 method

/*public class one {
	
	public void m1() {
		System.out.println("m1 call start");
		try {
		m2();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("m1 call end");
	}
	public void m2() {
		System.out.println("m2 call start");
		 
		System.out.println(10/0);
		
		 System.out.println("m2 call end");
	}

	public static void main(String[] args) {
		 
		one o = new one();
		
		System.out.println("main method call start");
		o.m1();
		System.out.println("main method call end");
		

	}

}*/




//Exception not handled at m2 method, m1 method it is handled at main method
/*public class one {
	
	public void m1() {
		System.out.println("m1 call start");
		m2();
		System.out.println("m1 call end");
	}
	public void m2() {
		System.out.println("m2 call start");
		 
		System.out.println(10/0);
		
		System.out.println("m2 call end");
	}

	public static void main(String[] args) {
		 
		one o = new one();
		
		System.out.println("main method call start");
		try {
		o.m1();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("main method call end");
		

	}

}*/


 //There will be Recursive call also

/*public class one {
	
	public void m1() {
		System.out.println("m1 call start");
		m2();
		System.out.println("m1 call end");
	}
	public void m2() {
		System.out.println("m2 call start");
		 m1();
		System.out.println("m2 call end");
	}

	public static void main(String[] args) {
		 
		one o = new one();
		System.out.println("main method call start");
		 o.m1();
		System.out.println("main method call end");

	}

}*/


