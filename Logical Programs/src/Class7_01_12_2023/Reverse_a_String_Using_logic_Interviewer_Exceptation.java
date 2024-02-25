package Class7_01_12_2023;

public class Reverse_a_String_Using_logic_Interviewer_Exceptation {

	public static void main(String[] args) {
		 
		String str = "hyderabad";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
