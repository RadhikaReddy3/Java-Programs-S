package Class12_11_12_2023;

public class Pattern_Program3 {

	public static void main(String[] args) {
/*		    5
		   44
		  333
		 2222
		11111

*/		 for(int i=5;i>=1;i--) {
			 for(int k=1;k<i;k++) {
				 System.out.print(" ");
			 }
			 for(int j=5;j>=i;j--) {
				 System.out.print(i);
			 }
			 System.out.println();
		 }
		 
	}

}
