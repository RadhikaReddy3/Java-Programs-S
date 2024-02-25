package Class12_11_12_2023;

public class Pyramid3hw2 {

	public static void main(String[] args) {
		/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5*/
		 for(int i=1;i<=5;i++) {
			 for(int k=4;k>=i;k--) {
				 System.out.print (" ");
			 }
			 for(int j=1;j<=i;j++) {
				 System.out.print (i+" ");
			 }
			 System.out.println();
		 }

	}

}
