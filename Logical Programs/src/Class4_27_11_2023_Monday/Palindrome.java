package Class4_27_11_2023_Monday;

public class Palindrome {

	public static void main(String[] args) {
		//Common mistake not taking temp 
		/*int a = 121;
		int rev = 0;
		
		for(;a>0;) {
			rev=(rev*10)+a%10;
			a=a/10;
		}
		System.out.println(rev);
		//when a=0 only it comes out loop everyone do this mistake
		//0==121
		if(a==rev) {
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("Not Palindrome");
		}

	}*/
		int a = 121;
		int temp = a;
		int rev = 0;
		
		for(;a>0;) {
			rev=(rev*10)+a%10;
			a=a/10;
		}
		System.out.println(rev);
		//when a=0 only it comes out loop everyone do this mistake
		//0==121
		if(temp==rev) {
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("Not Palindrome");
		}	
		

	}}
