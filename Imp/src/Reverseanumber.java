import java.util.Scanner;
public class Reverseanumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	System.out.println("Enter a Number");	
	
	// 1. Using Algorithm
	int rev = 0;
	
	while(num!=0) {
		rev = rev*10 + num%10; //0*10 + 1234%10
		num = num/10;
		
		
	}
    System.out.println("Reverse Number is:"+rev); 
	}
}
