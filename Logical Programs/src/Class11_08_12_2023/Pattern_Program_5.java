package Class11_08_12_2023;

public class Pattern_Program_5 {

	public static void main(String[] args) {
		 //i=1-5
		    //k=4-i
		    //j=1-i
		for(int i=1;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
