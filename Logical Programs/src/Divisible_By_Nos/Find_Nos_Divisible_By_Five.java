package Divisible_By_Nos;

public class Find_Nos_Divisible_By_Five {

	public static void main(String[] args) {
		 int arr[]= {5,2,12,10,89,90};
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%5==0) {
				 System.out.println(arr[i]);
			 }
		 }

	}

}
