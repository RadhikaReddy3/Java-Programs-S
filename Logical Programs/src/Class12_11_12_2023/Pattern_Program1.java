package Class12_11_12_2023;

public class Pattern_Program1 {

	public static void main(String[] args) {
		 
	 /*  1
	    21
	   321
	  4321
	 54321*/
		
		
		for(int i =1;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
			 
		}
		 
		 

	}

}
