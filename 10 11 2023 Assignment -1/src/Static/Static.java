package Static;

public class Static {

	public static int h = 12;
	public static void m1() {
		System.out.println("I am at static m1 method");
	}
	static {
		System.out.println("Static Block");
	}
	public static void main(String[] args) {
		   
           System.out.println(h);
           m1();
           
	}

}
