package Modulus;

public class OddIndex_with_OddNo {

	public static void main(String[] args) {
		 
		int arr[] = {5,2,4,1,7,2,9,8};
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==1 & arr[i]%2==1) {
				System.out.println("OddIndex & No Values in index : "+arr[i]);
			}
		}

	}

}
