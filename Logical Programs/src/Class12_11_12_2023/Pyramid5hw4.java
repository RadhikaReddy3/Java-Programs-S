package Class12_11_12_2023;

public class Pyramid5hw4 {

	public static void main(String[] args) {
		 //i=5-1
		//k=1-i
		//j=5-i
		 
			/*		    5
					   4 4
					  3 3 3
					 2 2 2 2
					1 1 1 1 1

			*/		 for(int i=5;i>=1;i--) {
						 for(int k=1;k<i;k++) {
							 System.out.print(" ");
						 }
						 for(int j=5;j>=i;j--) {
							 System.out.print(i+" ");
						 }
						 System.out.println();
					 }
					 

	}

}
