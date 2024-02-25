package Conditions_OR_BasicInstructions;

public class ClockRotationOfArray {
	 
	public static void main(String[] args) {
		          // 0 1 2 3 4 5 6
		int arr[] = {4,2,6,8,9,5,7};
		          //O/P:{2,6,8,9,5,7,4}
		
		
		
		System.out.println("Before Clock or Left Rotation: ");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("Index is "+i + " value is:"+arr[i]); 
		 }
		 System.out.println("==========================");
		 
		 /*Basic Understanding:
		  arr[0]=arr[1];
		  arr[1]=arr[2];
		  arr[2]=arr[3];
		  arr[3]=arr[4];
		  arr[4]=arr[5];
		  arr[5]=arr[6];
		  arr[6]=arr[0];
		  
		  */
		 
		 
		 
		 
		 //Level 0:
		 /*int temp=arr[0];
		 arr[0]=arr[1];
		 arr[1]=arr[2];
		  arr[2]=arr[3];
		  arr[3]=arr[4];
		  arr[4]=arr[5];
		  arr[5]=arr[6];
		  arr[6]=temp;*/
		 
		 
		// level 1:
		/*
		 int temp = arr[0]; // {4,2,6,8,9}
		 arr[0] = arr[1];  //  {2,2,6,8,9}
		 arr[1] = arr[2];  //  {2,6,6,8,9}
		 arr[2] = arr[3];  //  {2,6,8,8,9}
		 arr[3] = arr[4];  //  {2,6,8,9,9}
		 
		 arr[4] = temp;  //    {2,6,8,9,4}
		 */
		/*
		 * Level 2:
		 int temp = arr[0]; // {4,2,6,8,9}
		 for(int i=0 ;i <=3 ; i++) {
			arr[i] = arr[i+1];
		 }
		 arr[4] = temp;  //    {2,6,8,9,4}
		 */
		 
		 
		 //Level-3:
		 int temp = arr[0]; // {4,2,6,8,9}
		 for(int i=0 ;i <=arr.length-2; i++) {
			arr[i] = arr[i+1];
		 }
		 arr[arr.length-1] = temp;  //    {2,6,8,9,4}
		 
		 
		 
		 System.out.println("After Clock or left Rotation: ");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("Index is "+i + " value is:"+arr[i]); 
		 }
		 

		
		
	}
	}


