package Multiple_Inheritance;

public class C implements A,B{
	@Override
	public void m1() {
		 System.out.println("Child Class");
		
	}

	public static void main(String[] args) {
		
		C c = new C();
		c.m1();
		
		//System.out.println(c.p);/*c.p is ambiguous*/
		
		System.out.println(c);
		//System.out.println(c.y);/*c.y is not ambiguous because y is present in only A interface*/
		System.out.println(A.p);
		System.out.println(B.p);
		
		 

	}

	 

}
