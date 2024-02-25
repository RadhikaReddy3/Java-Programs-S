package Finding_Factors_Of_Number;

public class Factors_Of_A_Particular_Number {

	public static void main(String[] args) {
		  
		int num=10;//59;//3453559;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}

	}

}
