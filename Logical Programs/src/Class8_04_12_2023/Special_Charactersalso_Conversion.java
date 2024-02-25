package Class8_04_12_2023;

public class Special_Charactersalso_Conversion {

	public static void main(String[] args) {
		 
		String str = "Hello*How23AreYou?";
		String finalstr="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=65&&ch<=90) {
				 ch=(char)(ch+32);
			}
			else if(ch>=97&&ch<=122){
				ch=(char)(ch-32);	
			}
			 
			finalstr=finalstr+ch;
		}
		System.out.println(finalstr);

	}

}
