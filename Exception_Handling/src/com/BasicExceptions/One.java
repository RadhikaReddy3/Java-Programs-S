package com.BasicExceptions;

public class One {
 
	
	 
	public static void main(String[] args) {
		
		
		String[] n= {"siva","ram"};
		
		 /* System.out.println(n[0]);
		 System.out.println(n[1]);
		 System.out.println(10/0);
		 System.out.println(n[2]);
		 System.out.println(n[3]); */
		 
		
		/*System.out.println(n[3]); 
		System.out.println(n[0]);  
		System.out.println(n[1]);
		System.out.println(10/0);
		System.out.println(n[2]);*/
		
		/*try {
			System.out.println(n[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println(n[0]);  
		System.out.println(n[1]);
		//System.out.println(10/0);*/
		
		
		/*try {
			System.out.println(n[3]); 
			System.out.println(n[0]);  
			System.out.println(n[1]);
			System.out.println(10/0);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}*/
		
		
		try {
			System.out.println(10/0);
			System.out.println(n[3]);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		catch(ArrayIndexOutOfBoundsException d) {
			System.out.println(d);
		}
		System.out.println(n[0]);  
		System.out.println(n[1]);
		

	}

}
