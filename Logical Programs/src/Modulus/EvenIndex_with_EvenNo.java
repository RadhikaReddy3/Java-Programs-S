package Modulus;

public class EvenIndex_with_EvenNo {

	public static void main(String[] args) {
		 
		int arr[] = {5,2,4,1,7,2,9,8};
		
		 
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0 & arr[i]%2==0) {
				System.out.println("EvenIndex & No Values in index : "+arr[i]);
			}
		}

	}

}
