package Modulus;

public class Multiplication_of_All_Array_Values {

	public static void main(String[] args) {
		 int arr[] = {5,2,4,1,7,2,9,8};
		 
		 int acc =1;
		 for(int i=0;i<arr.length;i++) {
			 acc=acc*arr[i];
		 }
		 System.out.println("Multiplication Of Array Values: "+acc);

	}

}
