package Class4_27_11_2023_Monday;

public class Reverse {

	public static void main(String[] args) {
		 //Take any big number and do modulus(%) by 10 it gives you last number

		/*int a = 34;
		System.out.println(a/10);
		System.out.println(a%10);*/
		
		//1st Apporoach
		/*int a=123;
		System.out.print(a%10);
		a=a/10;
		System.out.print(a%10);
		a=a/10;
		System.out.println(a%10);*/
		
		//2nd Apporoach
		/*int a=123;
		for(;a>0;) {
			System.out.print(a%10);
			a=a/10;
			 
		}*/
		//3rd Apporach
		int a =123;
		int rev = 0;
		for(;a>0;) {
			rev=(rev*10)+a%10;
			a=a/10;
		}
		System.out.println(rev);
		 
		
		
		
		
		
		
	
		
     
		
		
		
		
		 
		 
		
	}

}
