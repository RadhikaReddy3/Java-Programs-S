package Class15_16_12_2023;

public class Recursive_Functionality {
//Normal Method call
	/*public static void main(String[] args) {
	 
		test(10);

	}
	public static void test(int a) {
		System.out.println(a);
		 
	}*/

	//Recursive method call-without termination
	/*public static void main(String[] args) {
		 
		test(10);

	}
	public static void test(int a) {
		System.out.println(a);
		test(a);
	}*/
	
	//Recursive method call-with termination(Apporaoch-1)
	public static void main(String[] args) {
		 
		test(10);

	}
	public static void test(int a) {
	 
		System.out.println(a);
		a=a-1;
		if(a>=0) {
			 
		test(a);
		 
	}}
	
	
	//Recursive method call-with termination -Apporach 2
		/*public static void main(String[] args) {
			 
			test(10);

		}
		public static void test(int a) {
		 
			 
			 
			// Check if a is greater than or equal to 0
	        if (a >= 0) {
	            // Recursively call the test method with a decremented value
	            test(a - 1);
	            
	            // Print the current value of a
	            System.out.println(a);
		}
	}*/
}
