package Class14_15_12_2023;

public class Selection_Sort {
//finding smallest value.
	public static void main1(String[] args) {
	 int arr[]= {8,3,5,-1,2,0,6,1};
	 for(int i=0;i<=6;i++) {
		 int s=arr[i];
		 for(int j=i;j<=7;j++) {
			 if(s>arr[j]) {//8>8,8>3,3>5,3>-1,-1>2,-1>0,-1>6,-1>1
				 s=arr[j];
			 }
		 }
		 arr[i]=s;
	 }
	 for(int i=0;i<=6;i++) {
		 System.out.println(arr[i]);
	 }

	}
	
//Finding Smallest Position and Smallest Value 
 
		public static void main2(String[] args) {
			 int arr[]= {8,3,5,-1,2,0,6,1};
			 for(int i=0;i<=6;i++) {
				 /*The reason for stopping at 6 is that when you're sorting elements, the last element is already in its correct place after the previous iterations. As a result, there's no need to include it in the remaining iterations of the outer loop. The inner loop (for(int j=i+1; j<8; j++)) takes care of finding the minimum element in the unsorted part of the array.*/
				 int s=i;
				 for(int j=i;j<=7;j++) {
					 if(arr[s]>arr[j]) {
						 s=j;
					 }  
				 }
				 System.out.println(s+"   "+arr[s]);
			 }}
//Actual Selection sort program
			 public static void main(String[] args) {
				 int arr[]= {8,3,5,-1,2,0,6,1};
				 for(int i=0;i<=6;i++) {
					 /*The reason for stopping at 6 is that when you're sorting elements, the last element is already in its correct place after the previous iterations. As a result, there's no need to include it in the remaining iterations of the outer loop. The inner loop (for(int j=i+1; j<8; j++)) takes care of finding the minimum element in the unsorted part of the array.*/
					 int s=i;
					 for(int j=i;j<=7;j++) {
						 if(arr[s]>arr[j]) {
							 s=j;
						 }  
					 }
					 int temp=arr[i];
					 arr[i]=arr[s];
					 arr[s]=temp;
				 }
				 for(int i=0;i<arr.length;i++) {
					 System.out.println(arr[i]);
				 }} }
