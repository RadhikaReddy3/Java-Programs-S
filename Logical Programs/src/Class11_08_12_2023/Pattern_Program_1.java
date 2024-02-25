package Class11_08_12_2023;

public class Pattern_Program_1 {

	public static void main(String[] args) {
		 //i=1-5
		//j=5-i
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
