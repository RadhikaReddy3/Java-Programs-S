package Class5_28_11_2023;

public class Armstrong_Number {

	public static void main1(String[] args) {
		//This Logic works for only three digit Number 
		int num=153;
		int temp=num;
		int value = 0;
		
		while(num>0) {
			int l = num%10;
			value= value+(l*l*l);
			num=num/10;
		}
		System.out.println(value);
		if(value==temp) {
			System.out.println("ArmStrong Number");
		}
		else {
			System.out.println("Not ArmStrong Number");
		}

	}
	public static void main(String[] args) {
	//This Logic works for any armstrong number
		//int num=3;
		//int num=153;
		//int num=1634;
		//int num=92727;
		//int num=548834
		int num=1741725;
		int temp1=num;
		int temp2=num;
		int acc =0;
		while(temp1>0) {
			acc++;
			temp1=temp1/10;
			
		}
		System.out.println("Count of no's: "+acc); 
		double value = 0;
		
		while(num>0) {
			int l = (num%10);
			value=  (value+(Math.pow(l, acc)));
			num=num/10;
		}
		System.out.println(value);
		if(value==temp2) {
			System.out.println("ArmStrong Number");
		}
		else {
			System.out.println("Not ArmStrong Number");
		}

		
	}

}
