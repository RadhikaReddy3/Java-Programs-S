package Inheritance;

public class MTest {
	
	
 public static void main(String[] args) {
	 System.out.println("Child class methods"+"\n");
	 Mchild a = new Mchild();
	 a.m1(); a.m2(); a.m3(); a.m4();
	 
	 System.out.println("\n"+"Parent class methods"+"\n");
	 Mparent b= new Mparent();
	 b.m3(); b.m4(); 
	 
	 System.out.println("\n"+"Grandparent class methods"+"\n");
	 Mgparent c = new Mgparent();
	 c.m3();c.m4();
	 
	 System.out.println("\n"+"Parent class sub class oject child"+"\n");
	 Mparent d = new Mchild();
	 d.m2();  d.m3();  d.m4();	
	 System.out.println("\n"+"GParent class sub class oject Parent"+"\n");
	 Mgparent e= new Mparent();
	 e.m3(); e.m4();
	 System.out.println("\n"+"GParent class sub class oject Child"+"\n");
	 Mgparent f= new Mchild();
	  f.m3(); f.m4();
}
}
