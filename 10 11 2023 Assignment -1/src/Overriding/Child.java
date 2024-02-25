package Overriding;

public class Child extends Parent{

	public void m1() {
		System.out.println("Apple MOBILE");
	}
	
	public void m2() {
		System.out.println("Audi car");
	}
	public static void main(String[] args) {
		 
         Child c = new Child();
         c.m1();
         c.m2();
         
         Parent d = new Parent();
         d.m1();
         d.m2();
         
         Parent e = new Child();
         e.m1();
         e.m2();
	}

}
