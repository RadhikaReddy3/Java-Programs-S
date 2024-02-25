package Conditions_OR_BasicInstructions;

public class Swapping_of_two_variables {
	
	 
	
	public static void main(String[] args) {
		
		//METHOD-1: Swapping_of_two_variables by temp variable
		/*int a = 10;
		int b=20;
		
		//Logic starts here
		
		int temp =a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);*/
		
		
		//METHOD-2: Swapping_of_two_variables without temp variable by using arithmetic operators
				int a = 10;
				int b=20;
				
				//Logic starts here
				
			     a=a+b;
			     b=a-b;
			     a=a-b;
				
				System.out.println(a);
				System.out.println(b);
	}

}
