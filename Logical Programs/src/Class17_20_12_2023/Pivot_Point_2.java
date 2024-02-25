package Class17_20_12_2023;

public class Pivot_Point_2 {

	public static void main(String[] args) {
		 int arr[]= {-7,6,8,1,3,-5,9,4,2};
		 int pivot=arr[arr.length-1];
		 int track=0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>pivot) {
				 int temp=arr[i];
				 arr[i]=arr[track];
				 arr[track]=temp;
				 track++;
			 }
			 
		 }
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
	}

}
