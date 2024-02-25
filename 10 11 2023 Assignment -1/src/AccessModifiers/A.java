package AccessModifiers;

/*public class A {

	public int a = 12;
	
	public void m1() {
		System.out.println("public");
	}*/
//Class - public, default, final, abstract, interface, extends, 	
 class B{
	 
	 //Variables or properties-public, default,private,protected, final, static, transient, volatile
	 int b =13;
	    //Methods-public, default,private,protected,final, static,synronized abstract
	 public void m2() {
		 System.out.println(" default");
	 }
 
	
	public static void main(String[] args) {
		 
     /*A a = new A();
     System.out.println(a.a);
     a.m1();*/
     
     B b = new B();
     System.out.println(b.b);
     b.m2();
     
     
	}
	
	

}
