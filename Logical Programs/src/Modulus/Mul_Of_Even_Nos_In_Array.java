package Modulus;

public class Mul_Of_Even_Nos_In_Array {

	public static void main(String[] args) {
         int arr[] = {5,2,4,1,7,2,9,8};
		
		int accumulator =1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				accumulator=accumulator*arr[i];
			}
		}
		System.out.println("Mul of Even no's in array: "+accumulator);



	}

}
