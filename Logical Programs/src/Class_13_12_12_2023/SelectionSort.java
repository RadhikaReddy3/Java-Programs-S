package Class_13_12_12_2023;

public class SelectionSort {
//Finding Minimum value or Smallest Number in an Array
	public static void main1(String[] args) {
		 
		int arr[]= {3,5,-1,2,8,0,6,1};
		int min=arr[0];
		for(int i=0;i<=7;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
      System.out.println("Mininum value in an Array: "+min);
	}
	
	//Finding Maximum value or Largest Number in an Array
	public static void main(String[] args) {
		int arr[]= {3,5,-1,2,8,0,6,1};
		int max=arr[0];
		for(int i=0;i<=7;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
      System.out.println("Maximum value in an Array: "+max);
		
	}

}
