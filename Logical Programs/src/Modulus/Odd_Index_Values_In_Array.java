package Modulus;

public class Odd_Index_Values_In_Array {

	public static void main(String[] args) {
		
		int arr[] = {5,2,4,1,7,2,9,8};
		//1,3,5,7=(2,1,2,8)
		for(int i=0;i<arr.length;i++) {
			if(i%2==1) {
				System.out.println("Values in Odd Indexes: "+arr[i]);
			}
		}

	}

}
