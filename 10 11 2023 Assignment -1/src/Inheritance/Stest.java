package Inheritance;

public class Stest {

	public static void main(String[] args) {
		 Schild a = new Schild();
		 a.m1();
		 a.m2();
		 System.out.println(a.cars+" "+a.bikes);
		 
		 Sparent b = new Sparent();
		 b.m2();
		 System.out.println(b.bikes);
		 
		 Sparent c = new Schild();
		 c.m2();
		 System.out.println(c.bikes);
		 

	}

}
