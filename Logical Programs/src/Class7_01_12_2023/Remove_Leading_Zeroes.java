package Class7_01_12_2023;

public class Remove_Leading_Zeroes {

	public static  void main(String[] args) {
		 
		String str="0000fr12300";
		StringBuffer sb = new StringBuffer(str);
		//while(sb.length()>0&&sb.charAt(sb.length()-1)=='0') {
		 for(;sb.length()>0&&sb.charAt(0)=='0';){
		 
			sb.deleteCharAt(0);
			//sb.setLength(sb.length()-1);
		}
		str=sb.toString();
		System.out.println(str);
		 

	}

}
