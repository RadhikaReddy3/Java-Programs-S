package Finally;

public class One {

	public static void main(String[] args) {
		 
		try {
			//System.out.println(10/2);
			System.out.println(10/0);
			System.out.println("hii");
			System.out.println("hello"+10/2);
			
		}
		catch(Exception e) {
			System.out.println("catch block 1");
			System.out.println(e);
		//System.out.println(10/0);
		
		try {
			System.out.println(10/0);
			
		}
		catch(NullPointerException e2) {
			System.out.println("catch block 2");
			System.out.println(e2);
			
		}finally {
			System.out.println("I am at inside finally block");
		}

	}
		finally {
			System.out.println("I am at main finally block");
			try {
				System.out.println(10/0);
			}finally {
				System.out.println("Iam at finally finally finally");
			}
		}
 
}}
