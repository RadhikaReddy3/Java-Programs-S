package Conditions_OR_BasicInstructions;

public class AntiClockRotationOfArray {

	
	 
		public static void main(String[] args) {
			          // 0 1 2 3 4 5   
			int arr[] = {4,2,6,8,9,10,55,33,54};
			 		//   0 1 2 3 4 5 
			         // {4,4,4,4,4,4};
			// {2,6,8,9,10,1,3,4};
			System.out.println("Before AntiClock or right Rotation: ");
			 for(int i=0;i<arr.length;i++) {
				 System.out.println("Index is "+i + " value is:"+arr[i]); 
			 }
			 System.out.println("==========================");
			 
			 /*Basic Understanding:
			  arr[1]=arr[0];
			  arr[2]=arr[1];
			  arr[3]=arr[2];
			  arr[4]=arr[3];
			  arr[5]=arr[4];
			  arr[6]=arr[5];
			  arr[7]=arr[6];
			  
			  */
			 
			 
			 
			 /* 
			 Level 0:
			 int temp = arr[1];
			 arr[1]  = arr[0];
			 int temp2 = arr[2];
			 arr[2]  = temp;
			 int temp3 = arr[3];
			 arr[3]  = temp2;
			 int temp4 = arr[4];
			 arr[4]  = temp3;
			 int temp5 = arr[5];
			 arr[5]  = temp4;
			 
			 arr[0]  = temp5;
			 */
			 
			/* 
			 * Level 1
			 int temp = arr[5]; // {4,2,6,8,9,10} 
			
			 arr[5] = arr[4];  // {4,2,6,8,9,9}
			 arr[4] = arr[3];  // {4,2,6,8,8,9}
			 arr[3] = arr[2]; //  {4,2,6,6,8,9}
			 arr[2] = arr[1]; //  {4,2,2,6,8,9}
			 arr[1] = arr[0]; //  {4,4,2,6,8,9}
			 
			 arr[0] = temp;
			*/ 
			 // Level 2
			 /*
			 int temp = arr[5];
			 for(int i=5 ; i>=1;i--) {
				 arr[i] = arr[i-1];
			 }
			 arr[0] = temp;
			 */
			// Level 3
			 int temp = arr[arr.length-1];
			 for(int i=arr.length-1 ; i>=1;i--) {
				 arr[i] = arr[i-1];
			 }
			 arr[0] = temp;
			
			 System.out.println("After AntiClock or right Rotation: ");
			 for(int i=0;i<arr.length;i++) {
				 System.out.println("Index is "+i + " value is:"+arr[i]); 
			 }
			
		} 
		
	}


