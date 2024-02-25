package Modulus;
//From Given Index of values. Take the Even index and go inside it and print the value inside it.
public class Even_Index_Values_In_Array {

	public static void main(String[] args) {
		int arr[] = {5,2,4,1,7,2,9,8};
		 for(int i=0;i<arr.length;i++) {
			 if(i%2==0) {
				 //Zero is even number,2,4,6 = (5,4,7,9)
				 System.out.println("Values in Even Indexes: "+arr[i]);
			 }
			 
		 }

	}

}



















/*Sir Said Program

 package com.slokam;

public class Module {
 
	public static void main1(String[] args) {
		
		int a = 15;
		System.out.println(a/15);
		System.out.println(a%15);
		
	}
	public static void main2(String[] args) {
		
		int num = 36;
		System.out.println(num/2);
		System.out.println(num % 2); // 0 or 1
		
		if( num % 2 == 0  ) {
			System.out.println("It is even");
		}else {
			System.out.println("It is odd");
		}
		
	}
	public static void main3(String[] args) {
		// even values.
		int arr[] = {5,2,4,1,7,2,9,8};
		
		for(int i=0; i<=arr.length-1; i++) {
			
			 if( arr[i] % 2 == 0 ) {
				 System.out.println(arr[i]);
			 }
		}
		
	}
	public static void main4(String[] args) {
		          // 0 1 2 3 4 5 6 7
		int arr[] = {5,2,4,1,7,2,9,8};
		for(int i=0;i<arr.length;i++) {
			
			if( i % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main5(String[] args) {
				//   0 1 2 3 4 5 6 7 8
		int arr[] = {5,2,4,1,7,2,9,8,10};
		
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0 & arr[i]%2==0 ) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main6(String[] args) {
		int arr[] = {5,2,4,1,7,2,9,8,10};
		int acc=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] %2 ==0) {
				acc++;
			}
		}
		System.out.println(acc);
	}
	
	public static void main7(String[] args) {
		int arr[] = {5,2,4,1,7,2,9,8,10};
		int acc=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				acc =acc + arr[i];
			}
		}
		System.out.println(acc);
	}
	
	public static void main(String[] args) {
		int arr[] = {5,2,4,1,7,2,9,8,10};
		int acc=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 ==0) {
				acc = acc * arr[i];
			}
		}
		System.out.println(acc);
	}
}



 */
  