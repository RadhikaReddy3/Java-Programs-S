package Class12_11_12_2023;

public class PatternProgram2 {

	public static void main(String[] args) {
   /* 
		 1
	    22
	   333
	  4444
	 55555
*/
		 for(int i =1;i<=5;i++) {
			 for(int k=4;k>=i;k--) {
				 System.out.print(" ");
			 }
			 for(int j =1;j<=i;j++) {
				 System.out.print(i);
			 }
			 System.out.println();
		 }

	}

}
