package CompiletimePolymorphismAndStaticPolmorphism;

public class Login {
	
	public void submit() {
		System.out.println("Hi");
	}
	public void submit(int h) {
		System.out.println("Hello"+h);
		
	}
	public void submit(byte a,byte b) {
		System.out.println("byte,byte");
	}
	public void submit(int a, int b) {
		System.out.println("int, int");
		
	}
	public void submit(float a,int b) {
		System.out.println("float,int");
		
	}
	public void submit(int a, float b) {
		System.out.println("int, float");
		
	}
	public void submit(double d, double h) {
		System.out.println("double,double");
	}

	public static void main(String[] args) {
		 Login l = new Login();
		 l.submit();
		 l.submit(127)
		            ;
		 l.submit(13,14);
		 l.submit(-128,127);
		 l.submit(12.45f, 13);
		 l.submit(15,13.67f);//if not this it will execute for double,double
		 l.submit(384.21,32.32);
		 l.submit(22.32,12);//Double,integer
		 l.submit(23.34f,123.12);//float,double
		 l.submit(10,20);//(int,float&float,int equal capability so ambiguity state comes)
		 

	}

}
