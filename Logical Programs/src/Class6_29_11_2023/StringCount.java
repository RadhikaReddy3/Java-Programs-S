package Class6_29_11_2023;

public class StringCount {

	public static void main1(String[] args) {
 
		String str="hello hyderabad";
		
		System.out.println(str.length());//OR
		/*int count =0;
		
		for(int i=0;i<=str.length()-1;i++ ) {
			count++;
		}
		System.out.println(count);*/
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(14));//OR
		System.out.println(str.charAt(str.length()-1));

		//For printing all characters
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		
		 
		

	}
	//Now I want count of specific letter. I want count of h in hellohyderabad
	public static void main(String[] args) {
		String str = "Hello hyderabad";
		int count = 0;
		
		for(int i=0;i<=str.length()-1;i++) {
		 if(str.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
