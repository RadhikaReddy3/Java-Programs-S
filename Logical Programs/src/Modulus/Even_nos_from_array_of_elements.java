package Modulus;

public class Even_nos_from_array_of_elements {

	public static void main(String[] args) {
		 int arr[] = {5,2,4,1,7,2,9,8};
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2==0) {
				 System.out.println("Even no in array: "+arr[i]);
			 }
		 }

	}

}
