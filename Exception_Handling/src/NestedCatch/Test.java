/*package NestedCatch;

public class Test {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			try {
				String[] n= {"siva","Ram"};
				System.out.println(n[3]);
			 
			}
			catch(ArrayIndexOutOfBoundsException d) {
				System.out.println("Nested Catch"+d);
		}
			System.out.println(e);

	}
		System.out.println("Hello");

}}*/


package NestedCatch;

public class Test {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			try {
				//System.out.println(10/5);
				System.out.println(10/0);
			 
			}
			catch(ArithmeticException e1) {
				//catch(NullPointerException e1) {
				System.out.println("Inner Catch: "+e1);
		}
		System.out.println("Main try: "+e); 

		}
		System.out.println("Hello");

}}
