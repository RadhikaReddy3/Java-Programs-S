package Class6_29_11_2023;

public class Perfect_Number {

	public static void main(String[] args) {
		 
		int num=33550336;
		int value =1;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				//System.out.print(i+",");
				value=value+i;
			}
		}
		if(num==value) {
			System.out.println(value+" is a perfect Number");
		}
		else {
			System.out.println(value+" is not perfect number");
		}

	}

}
