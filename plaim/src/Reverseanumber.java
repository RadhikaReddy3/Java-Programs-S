import java.util.Scanner;
public class Reverseanumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number:");
		 
		 int num = sc.nextInt();
		 
		 //1. Using Algorithm
		 
		 /*int rev = 0;
		 
		 while(num!=0)
		 {
			 rev =rev*10 + num%10;
			 num = num/10;
		 }*/
		 
		 
		 //2. Using String Buffer class
		 //In string buffer ther is a method called reverse method by using that method we can directly reverse a string
		 /*StringBuffer rev;
		 StringBuffer sb = new StringBuffer(String.valueOf(num));
		 rev = sb.reverse();
		 System.out.print("Reverse Number is: "+rev);*/
		 
		 
		 //3. Using String Builder Class
		 
		 StringBuilder sbl = new StringBuilder();
		 sbl.append(num);
		 StringBuilder rev = sbl.reverse();
		 System.out.print("Reverse Number is: "+rev);
		 sc.close();
		 
	}

}
