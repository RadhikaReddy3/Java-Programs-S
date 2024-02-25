package RuntimeORDynamicPolymorphism;

public class Child extends Parent {
	
	public void m1() {
		System.out.println("Hello--Child class m1 method");
	}
	public void m3() {
		System.out.println("Hello--Child class m3 method");
	}

	public static void main(String[] args) {
		System.out.println("Child class object Creation with Child class refernce"+"\nss");
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m5();
		System.out.println("\n"+"Child class object creation with Parent class reference"+"\n");
		
		Parent p = new Child();
		p.m1();
		p.m2();
		p.m3();
		p.m4();
		p.m5();
		
		System.out.println("\n"+"Parent class object creation with Parent class reference"+"\n");
		
		Parent p1 = new Parent();
		p1.m1();
		p1.m2();
		p1.m3();
		p1.m4();
		p1.m5();
		 

	}

}
