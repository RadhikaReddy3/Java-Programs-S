package StaticandInstance;

public class New {

	 
		static int a = 33;//Static variable
		public static void m1() {
			System.out.println("I am at static method");//Static method
		}
		static //Static block
		{
			System.out.println("-------Static--------");
			System.out.println("Static variable: "+a);
			m1();
			System.out.println("I am at static block");
			
		}
		int b = 13; //Instance variable
		public void m2() {
			System.out.println("I am at Instance method");// Instance method
			
		}
		//Instance block
		{
			System.out.println("\n\n\n");
			System.out.println("------Instance------");
			System.out.println("Instance variable: "+b);
			m2();
			System.out.println("I am at Instance block");
			
			//m1();//(From instance to static it is possible to call But From static to instance it is not possible to call)
			//System.out.println("Static variable: "+a);
		}
		

		public static void main(String[] args) {
			
			System.out.println("I am at static main method");//Static main method
			a=43;//static variable modifying
			System.out.println("Static variable: "+a);//Printing static variable modified output
			m1();//Static method printing
			System.out.println("--------------------------");
			
			
			New n = new New();//Object creation(If and only if object creates instance block executes)(After that by the help of object reference the instance variable and instance method executes) 
			n.b =14;//Instance variable modifying
			System.out.println("Instance variable: "+n.b);//Printing Instance variable modified output
			n.m2();//Instance method printing
			System.out.println("------------------------");
			
			New n1 = new New();
			n1.b = 15;
			System.out.println("Instance variable: "+n1.b);
			n1.m2();
			a=56;
            System.out.println("Static variable: "+a);
			

	}

}
