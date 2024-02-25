package Class8_04_12_2023;

public class StringPalindrome {

	public static void main(String[] args) {
		 
		String str="abba";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

		if(str.endsWith(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
