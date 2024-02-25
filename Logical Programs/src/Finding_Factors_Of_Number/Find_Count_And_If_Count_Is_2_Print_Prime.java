package Finding_Factors_Of_Number;

public class Find_Count_And_If_Count_Is_2_Print_Prime {
	 

	public static void main(String[] args) {
		
		
		//int num=10;
        int num=7;
		//int num=3453559;
		int acc=0;
		 
   for(int i=1;i<=num;i++) {
	   if(num%i==0) {
		    acc++;
	   }
	   
   }
   if(acc==2) {
	   
   System.out.println(num+" is a prime number"); 
   }
   else {
	   System.out.println(num+" is not a prime number");
   }
   }

}
