package Class7_01_12_2023;

public class Replace_Specific_Character_At_A_Specific_Index {

	//First print that specific special character
	public static void main1(String[] args) {
		 String str="Slokam@tech";
		 int num=str.indexOf('@');//This mechanism is reverse to charAt
		 System.out.println(num);
	}
	
	//Approach-1:This Logic works for only one special character
	public static void main2(String[]args) {
		String str="Slokam@tech";
		String first=str.substring(0,str.indexOf('@'));
		String second=str.substring(str.indexOf('@')+1);
		String fina=first+"*"+second;
		System.out.println(fina);
	}
	//Approach-2:This Logic works for multiple special character
	public static void main(String[]args) {
		String str="Slokam@tech@Welcome@";
		 
		String finalstr="";
		for(int i=0;i<str.length();i++) {
		        if(str.charAt(i)=='@') {
		        	finalstr=finalstr+"&";
		        }
		        else {
		        	finalstr=finalstr+str.charAt(i);
		        }
		       
		}
		System.out.println(finalstr);
		 
		}

}
