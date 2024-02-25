package Class16_19_12_2023;

public class Sum_Of_Arrays_Recursive_Program {

	public static void main1(String[] args) {
		//int arr[]= {8,3,5,-1,2,0,6,1};
		 int arr[]= {8,3,5};
		 int acc=sumOfArray1(arr,0,0);
		 System.out.println(acc);
	}
	public static int sumOfArray1(int arr[],int index, int acc) {
		acc=acc+arr[index];/*i=0,1
		                 [11]a=0,8
		                 -------------
		                     i=1,2
		                 [16]a=8,11
		                 -------------
		                     i=2,3
		                 [16]a=11,16*/
		index++;
		if(index<arr.length) {
			sumOfArray1(arr,index,acc);
		}
		return acc;

	}
	public static void main(String[] args) {
		int arr[]= {8,3,5,-1,2,0,6,1};
		 //int arr[]= {8,3,5};
		 int acc=sumOfArray(arr,0,0);
		 System.out.println(acc);
	}
	public static int sumOfArray(int arr[],int index, int acc) {
		acc=acc+arr[index];/*i=0,1
		                 [11]a=0,8
		                 -------------
		                     i=1,2
		                 [16]a=8,11
		                 -------------
		                     i=2,3
		                 [16]a=11,16*/
		index++;
		if(index<arr.length) {
			acc=sumOfArray(arr,index,acc);
		}
		return acc;

	}

}
