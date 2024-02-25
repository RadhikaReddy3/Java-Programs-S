package Multilevel_Inheritance;

public class MTest {

	public static void main(String[] args) {
		 
		mchild a = new mchild();
		System.out.println("Mchild: "+a.a);
        a.m1();
        System.out.println("Mparent: "+a.b);
        a.m2();
        System.out.println("Mgrandparent: "+a.c);
        a.m3();
        System.out.println("\n"+"----------------------------"+"\n");
        mparent b = new mparent();
        System.out.println("Mparent: "+b.b);
        b.m2();
        System.out.println("Mgrandparent: "+b.c);
        b.m3();
        System.out.println("\n"+"----------------------------"+"\n");
        mgrandparent c = new mgrandparent();
        System.out.println("Mgrandparent: "+c.c);
        c.m3();
       
	
	
	}

}
