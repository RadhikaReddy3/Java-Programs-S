package StaticandInstance;
//Static to Static : Possible
//Instance to Instance: Possible
//Instance to Static: Possible
//Static to Instance:Possible If and only if object created

public class Siva {
	 public int a = 12;
	 
	 public void m1() {
		 System.out.println(a=13);
		 System.out.println("I am at instance m1 method");
		 m2();
	 }
	 public void m2() {
		 System.out.println("I am at instance m2 method");
	 }
	 {
		 System.out.println("Instance Block");
	 }
	 
    public static int b = 14;
	 
	public static void m3()
	{
		 System.out.println("I am at static m3 method");  
	 }
	 public static void m4()
	 {
		 System.out.println("I am at static m4 method");
	 }
	 static
	 {
		 
		 System.out.println("Static Block");
	 }
	 
	 

	public static void main(String[] args) {
		
		System.out.println(b);
		m3();
		m4();
		
		Siva s = new Siva();
		System.out.println(s.a);
		s.m1();
		s.m2();
		

	}

}
