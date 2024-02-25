package Class6_29_11_2023;

public class Interview_Question {

	public static void main1(String[] args) {
		 
		//Even digit sum count
		int num=1234;
		 int sum = 0;
		 
		 for(;num>0;) {
			 int digit = num%10;
			 if(num%2==0) {
				 sum=sum+digit;
			 }
			 num=num/10;
			 
		 }
		 System.out.println("Even digit sum count: "+sum);
	} 
		 public static void main(String[] args) {
			 
				//	Odd digit sum count
				int num=1234;
				 int sum = 0;
				 
				 for(;num>0;) {
					 int digit = num%10;
					 if(num%2==1) {
						 sum=sum+digit;
					 }
					 num=num/10;
					 
				 }
				 System.out.println("odd digit sum count: "+sum);
				 
	}

}
