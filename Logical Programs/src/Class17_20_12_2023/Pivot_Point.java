package Class17_20_12_2023;

public class Pivot_Point {
//Now values less than must go to left and values greater must go to right
	public static void main(String[] args) {
		int pivot=4;
		 int arr[]= {2,6,8,1,3,5,9,4};
		 int j=0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]<=pivot) {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				 j++;
			 }
		 }
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }

	}

}
