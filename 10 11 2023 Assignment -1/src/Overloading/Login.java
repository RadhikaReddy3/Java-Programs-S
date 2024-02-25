package Overloading;

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

	public static void main(String[] args) {
			
		Login a = new Login();
		a.submit();
		a.submit(1);
		a.submit(3, 3);
		a.submit(6, 6);
          
	}

}
