package Modulus;

public class Odd_nos_from_array_of_elements {

	public static void main(String[] args) {
		int arr[] = {5,2,4,1,7,2,9,8};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
			System.out.println("Odd no is array is: "+arr[i]);
		}}

	}

}
