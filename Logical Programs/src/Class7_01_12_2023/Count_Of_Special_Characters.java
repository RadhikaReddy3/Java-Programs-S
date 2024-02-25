package Class7_01_12_2023;

public class Count_Of_Special_Characters {

	public static void main(String[] args) {
		 
		String str = "Hello@Hyderabad_!*";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i)>=48&&str.charAt(i)<=57)&&!(str.charAt(i)>=65&&str.charAt(i)<=90)&&!(str.charAt(i)>=97&&str.charAt(i)<=122)) {
			 
				count++;
				System.out.print(str.charAt(i)+", ");
			}
		}
		System.out.println("\n");
		System.out.println(count);

	}

}
