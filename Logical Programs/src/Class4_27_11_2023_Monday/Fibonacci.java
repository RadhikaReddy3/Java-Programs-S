package Class4_27_11_2023_Monday;

public class Fibonacci {

	public static void main1(String[] args) {
	//1st Apporach	 
	  int a=0;
	  int b=1;
	  int c=a+b;
	  System.out.println(c);
	  a=b;
	  b=c;
	  c=a+b;
	  System.out.println(c);
	  a=b;
	  b=c;
	  c=a+b;
	  System.out.println(c);
	  a=b;
	  b=c;
	  c=a+b;
	  System.out.println(c);
	}	
		
	  public static void main(String[] args) {
		int a=0;
		System.out.print(a+",");
		int b=1;
		System.out.print(b+",");
		int c=0;
		for(int i=1;i<=10;i++) {
			 
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
			
		}
		

	}

}
