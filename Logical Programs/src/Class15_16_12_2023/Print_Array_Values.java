package Class15_16_12_2023;

public class Print_Array_Values {

	//Array values in ascending order
	 public static void main(String[] args) {
		 int arr[]= {8,3,5,-1,2,0,6,1};
		 printArr(arr,0);

	}
	
	public static void printArr(int arr[],int index) {
		 
		
		if(index<=arr.length-1) {
			System.out.println(arr[index]);
		printArr(arr,index+1);
	}} 
	
	//Array values in descending order
		/*public static void main(String[] args) {
			 int arr[]= {8,3,5,-1,2,0,6,1};
			 printArr(arr,0);

		}
		
		public static void printArr(int arr[],int index) {
			 
			if(index<=arr.length-1) {
			printArr(arr,index+1);
			System.out.println(arr[index]);
		}
	}*/

}
