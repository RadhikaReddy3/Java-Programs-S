package Class7_01_12_2023;

public class Small_Characters_In_A_String {

	public static void main(String[] args) {
		 
		String str = "Welcome To Hyderabad";
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)>=97&str.charAt(i)<=122) {
				count++;
				System.out.print(str.charAt(i)+", ");
			}
		}
		System.out.println("\n"+"Small Characters Count: "+count);

	}

}
