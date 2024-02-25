package Modulus;

public class Multiplication_Of_All_Array_Values_Whose_Index_Is_Odd {

	public static void main(String[] args) {
		 int arr[] = {5,2,4,1,7,2,9,8};
 
		 
		 int acc=1;
		 for(int i=0;i<arr.length;i++) {
			 if(i%2==1) {
				 acc=acc*arr[i];
			 }
		 }
		 System.out.println("Multiplication_Of_All_Array_Values_Whose_Index_Is_Odd: "+acc);
		 
	}

}
