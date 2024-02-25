package Class7_01_12_2023;

public class Print_A_to_Z {

	//Print A to Z by the Alphabets
	public static void main1(String[] args) {
		 
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+", ");
		}
	}
	
	//Print A to Z by the ASCII(Conversion of ASCII to character)
	public static void main(String[] args) {
		 
		for(int i=65;i<=90;i++) {
			System.out.print((char)i+", ");
		}
	}

}
