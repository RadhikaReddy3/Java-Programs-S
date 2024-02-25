package Finally;

public class StopFinally {

	public static void main(String[] args) {
		 try {
			 System.out.println("Hiii");
			 System.exit(0);
			 System.out.println("Hi: "+10/0);
			 
			 
		 }
		 catch(Exception e){
			 //System.exit(0);
			System.out.println(e); 
			  
		 }
		 finally {
			 System.out.println("Iam at finally block");
		 }

	}

}
