package Class9_5_12_2023;

 

public final class BubbleSort {

	public static void main1(String[] args) {
		 
		int arr[] = {6,3,1,8,2,9};
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]>arr[i+1]) {
				 int temp=arr[i];
				 arr[i]=arr[i+1];
				 arr[i+1]=temp;	
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	public static void main(String[] args) {
		  
		int arr[] = {6,3,1,8,2,9};
		/*      *****
		  *     ****
		  *     ***
		  *     **
		  *     *
		  */


		
		for(int j=arr.length-1;j>=1;j--) {
		for(int i=0;i<j;i++) {
			
			if(arr[i]>arr[i+1]) {
				 int temp=arr[i];
				 arr[i]=arr[i+1];
				 arr[i+1]=temp;	
			}
		}}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
