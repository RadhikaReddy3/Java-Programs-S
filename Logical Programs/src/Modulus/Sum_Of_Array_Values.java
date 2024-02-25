package Modulus;

public class Sum_Of_Array_Values {

	public static void main(String[] args) {
		 int arr[] = {5,2,4,1,7,2,9,8};
		 
		 int acc = 0;
		 for(int i=0;i<arr.length;i++) {
			 acc=acc+arr[i];
		 }
		 System.out.println("Sum of Array Values: "+acc);

	}

}
