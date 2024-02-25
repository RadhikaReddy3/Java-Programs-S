package Modulus;

public class EvenOROdd {
	public static void main1() {
		int a = 15;
		System.out.println(a%5);//modulus operator it will give you remainder(0)
		System.out.println(a/5);//division operator it will give you quotient(3)
	}

	public static void main(String[] args) {
		 
          int num = 37;//35//36
          System.out.println(num%2);
          System.out.println(num/2);
          
          if(num%2 == 0 ) {
        	  System.out.println("It is a even number: "+num);
          }
          else {
        	  System.out.println("It is a odd number: "+num);
          }
	}

}
