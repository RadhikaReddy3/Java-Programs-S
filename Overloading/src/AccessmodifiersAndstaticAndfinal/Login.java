package AccessmodifiersAndstaticAndfinal;

 

public class Login {

	 
		 

		public void submit() {
			System.out.println("Hi");
		}
		private void submit(int h) {
			System.out.println("Hello"+h);
			
		}
	    protected void submit(byte a,byte b) {
			System.out.println("byte,byte");
		}
		 char submit(int a, int b) {
			System.out.println("int, int");
			return 'A';
			
		}
		public static boolean submit(float a,int b) {
			System.out.println("float,int");
			return true;
			
		}
		public final double submit(int a, float b) {
			System.out.println("int, float");
			return 45.55;
			
		}
		public int submit(double d, double h) {
			System.out.println("double,double");
			return 5;
		}

		public static void main(String[] args) {
			 Login l = new Login();
			 l.submit();
			 l.submit(127)
			            ;
			 l.submit(13,14);
			 l.submit(-128,127);
			 l.submit(12.45d, 13);
			 l.submit(15,13.67f);
			 l.submit(384.21,32.32);
			 l.submit(22.32,12);//Double,integer
			 l.submit(23.34f,123.12);//float,double
			 
			 

	}

}
