package FinalKeyword;

public class Fchild extends Fparent{

	 
		public void m1() {
			System.out.println("Hello--Child class m1 method");
		}
		public void m3() {
			System.out.println("Hello--Child class m3 method");
		}

		public static void main(String[] args) {
			System.out.println("Child class object Creation with Child class refernce"+"\n");
			Fchild c = new Fchild();
			c.m1();
			c.m2();
			c.m3();
			c.m4();
			c.m5();
			System.out.println("\n"+"Child class object creation with Parent class reference"+"\n");
			
			Fparent p = new Fchild();
			p.m1();
			p.m2();
			p.m3();
			p.m4();
			p.m5();
			
			System.out.println("\n"+"Parent class object creation with Parent class reference"+"\n");
			
			Fparent p1 = new Fparent();
			p1.m1();
			p1.m2();
			p1.m3();
			p1.m4();
			p1.m5();
			 

		}


	}


