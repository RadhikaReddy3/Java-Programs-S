package Conditions_OR_BasicInstructions;

public class Swapping_of_three_variables {

	public static void main(String[] args) {
		
		
		//METHOD-1: Swapping_of_three_variables by temp variable
		//A to B, B to c, C to A     o/p =30,10,20
		int a=10;
		int b=20;
		int c=30;
		
		//Logic starts here
		
		/*int temp=a;
		a=c;
		c=b;
		b=temp;*/
		
		/*int temp =b;
		b=a;
		a=c;
		c=temp;*/
		
		/*int temp=c;
		c=b;
		b=a;
		a=temp;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
		//METHOD-2: Swapping_of_three_variables without temp variable by using arithmetic operators
		
		 b=b+c;//20+30=50
		 c=b-c;//50-30=20
		 b=b-c;//50-20=30
		 
	     b=b+a;//30+10=40
	     a=b-a;//40-10=30
	     b=b-a;//40-30=10
	     

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		
		

	}

}
