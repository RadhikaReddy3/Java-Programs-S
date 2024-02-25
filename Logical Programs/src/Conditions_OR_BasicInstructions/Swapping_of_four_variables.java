package Conditions_OR_BasicInstructions;

public class Swapping_of_four_variables {

	public static void main(String[] args) {
		//METHOD-1: Swapping_of_four_variables by temp variable
		//A to B, B to C, C to D and D to A[O/P: 40, 10, 20, 30]
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		
	   /*int temp=a;
	   a=d;
	   d=c;
	   c=b;
	   b=temp;*/
	   
	   /*int temp=b;
	   b=a;
	   a=d;
	   d=c;
	   c=temp;
	   */
		
		/*int temp=c;
		c=b;
		b=a;
		a=d;
		d=temp;
		
	   
	   
	   System.out.println(a+"\n"+b+"\n"+c+"\n"+d);*/
		
		
		//METHOD-2: Swapping_of_four_variables without temp variable by using arithmetic operators
		
		/* b=b+c;//20+30=50
		   c=b-c;//50-30=20
		   b=b-c;//50-20=30
		 
	       b=b+a;//30+10=40
	       a=b-a;//40-10=30
	       b=b-a;//40-30=10
	     
	       d=d+a;//40+30=70
	       a=d-a;//70-30=40
	       d=d-a;//70-40=30*/
		
		  // Swapping without a temporary variable using XOR
            
		    b = b ^ c ^ (c = b);
            a = a ^ b ^ (b = a);
            d = d ^ a ^ (a = d);

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);

	}

}
