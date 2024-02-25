package Divisible_By_Nos;

public class Count_Of_Nos_Divisible_By_Five_In_an_Array {

	public static void main(String[] args) {
		int arr[]= {5,2,12,10,89,90};
		int acc=0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%5==0) {
				 acc++;
			 }
		 }
		 System.out.println(acc);


	}

}
