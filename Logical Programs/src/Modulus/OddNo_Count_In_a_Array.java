package Modulus;

public class OddNo_Count_In_a_Array {

	public static void main(String[] args) {
       int arr[] = {5,2,4,1,7,2,9,8};
		
		int accumulator =0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==1) {
				accumulator++;
			}
		}
		System.out.println("Count of Odd no's in array: "+accumulator);
 

	}

}
