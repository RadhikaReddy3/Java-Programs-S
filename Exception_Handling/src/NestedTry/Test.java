package NestedTry;
 
public class Test {
	public static void main(String[] args) {
	
	try {
		//System.out.println(10/0);
		System.out.println(10/4);
		try {
			String[] n= {"siva","Ram"};
			System.out.println(n[3]);
		}
		//catch(ArithmeticException e) 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Nested Try"+e);
		}
	}
	//catch(NullPointerException e){
	catch(ArithmeticException e){
		System.out.println("Main Try"+e);
	}

}}

/*package NestedTry;

public class Test {
	public static void main(String[] args) {
	
	try {
		System.out.println(10/2);
		try {
			String[] n= {"siva","Ram"};
			System.out.println(n[3]);
		}
		 
		catch(ArithmeticException e) {
			System.out.println("Nested Try"+e);
		}
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Main Try"+e);
	}

}}*/