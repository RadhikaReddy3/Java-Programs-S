package Finding_Factors_Of_Number;

public class Find_the_Count_Of_Factors_Of_A_Number {

	public static void main(String[] args) {
	 
		int num=10;
		int acc=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				 acc++;
			}
		}
		System.out.println(acc);

	}

}
