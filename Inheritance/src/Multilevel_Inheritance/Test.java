package Multilevel_Inheritance;

public class Test {

	public static void main(String[] args) {
		 System.out.println("-----sub class-----"+"\n");
		 child c = new child();
		 c.m1();c.m2();c.m3();c.m4();c.m5(); c.m6();
		 
		 System.out.println("\n"+"-----super class-----"+"\n");
		 parent m = new parent();
		 m.m3(); m.m4(); m.m5(); m.m6(); m.m1();
		 System.out.println("\n"+"-----Super-Super class-----"+"\n");
		 grandparent g = new grandparent();
		 g.m5(); g.m6(); g.m1();
		 
         System.out.println("\n"+"------Grand parent class holding parent object-----"+"\n");
		 grandparent mg = new parent();//m5,m6,m1    m3,m4,m5
		 //mg.m3();mg.m4();(we cannot call these methods because object reference is taken as grandparent.Grand parent doesnot contain m3, m4 methods)
		 mg.m5(); mg.m1(); mg.m6();
		 
		 
		 System.out.println("\n"+"------Grand parent class holding child object-------"+"\n");
		 grandparent g1 = new child();// m5,m6,m1 m1,m2,m3
		 //g1.m4(); g1.m2(); g1.m3();
		 g1.m1(); g1.m5(); g1.m6();
		 
		 System.out.println("\n"+"------Parent class holding child object------"+"\n");
		 parent p = new child(); // m3,m4,m5    m1,m2,m3
		 
		 
		 //p.m2();
		 p.m3();
		 p.m4();
		 p.m5();
		 p.m1();
		 p.m6();
	}

}
