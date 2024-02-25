package Class12_11_12_2023;

public class Pyramid7hw6 {

	public static void main(String[] args) {
		//i=5-1
		//k=(i-1)-1>>/1-(i-1)<<
		//j=5-1
		
		for(int i=5;i>=1;i--) {
			for(int k=1;k<=i-1;k++) {
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
