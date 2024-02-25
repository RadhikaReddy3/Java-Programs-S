package Class8_04_12_2023;

public class Capital_to_Small_And_ViceVersa {

	public static void main(String[] args) {
	 
		String str="HelloHyderabadHowAreYou";
		
		//Output: hELLOhYDERABADhOWaREyOU
		
		String finalstr="";
		 
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			 
			if(ch>=65&&ch<=90) {
				ch=(char)(ch+32);
			}
			else {
				ch=(char)(ch-32);
			}
			finalstr=finalstr+ch;	 
		}
	 
		System.out.println(finalstr);
		
		

	}

}
