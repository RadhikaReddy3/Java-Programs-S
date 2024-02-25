package Class_13_12_12_2023;

public class BubbleSort {

	public static void main1(String[] args) {
		 int arr[]= {3,5,-1,2,8,0,6,1};
		 
		 for(int i=0;i<=6;i++) {
			 if(arr[i]>arr[i+1]) {
				  int temp=arr[i];
				  arr[i]=arr[i+1];
				  arr[i+1]=temp;
			 }
		 }
		 for(int i=0;i<=7;i++) {
			 System.out.print(arr[i]+" ");
		 }

	}
	public static void main2(String[] args) { 
		int arr[]= {3,5,-1,2,8,0,6,1};
		 
		 for(int i=0;i<=6;i++) {
			 if(arr[i]>arr[i+1]) {
				  int temp=arr[i];
				  arr[i]=arr[i+1];
				  arr[i+1]=temp;
			 }
		 }
		 for(int i=0;i<=7;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 
		 System.out.println("\n\n");
		 for(int i=0;i<=5;i++) {
			 if(arr[i]>arr[i+1]) {
				  int temp=arr[i];
				  arr[i]=arr[i+1];
				  arr[i+1]=temp;
			 }
		 }
		 for(int i=0;i<=7;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println("\n\n");
		 for(int i=0;i<=4;i++) {
			 if(arr[i]>arr[i+1]) {
				  int temp=arr[i];
				  arr[i]=arr[i+1];
				  arr[i+1]=temp;
			 }
		 }
		 for(int i=0;i<=7;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println("\n\n");
		 for(int i=0;i<=3;i++) {
			 if(arr[i]>arr[i+1]) {
				  int temp=arr[i];
				  arr[i]=arr[i+1];
				  arr[i+1]=temp;
			 }
		 }
		 for(int i=0;i<=7;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println("\n\n");
		 for(int i=0;i<=2;i++) {
			 if(arr[i]>arr[i+1]) {
				  int temp=arr[i];
				  arr[i]=arr[i+1];
				  arr[i+1]=temp;
			 }
		 }
		 for(int i=0;i<=7;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println("\n\n");
		 for(int i=0;i<=1;i++) {
			 if(arr[i]>arr[i+1]) {
				  int temp=arr[i];
				  arr[i]=arr[i+1];
				  arr[i+1]=temp;
			 }
		 }
		 for(int i=0;i<=7;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println("\n\n");
	}
	//Actual Bubble Sort Program
	public static void main(String[] args) {
		 int arr[]= {3,5,-1,2,8,0,6,1};
		 
		 /*0 1 2 3 4 5 6  //0-6
		  *0 1 2 3 4 5    //0-5
		  *0 1 2 3 4      //0-4
		  *0 1 2 3        //0-3
		  *0 1 2          //0-2
		  *0 1            //0-1
		  *0
		  */
		 //i:6-1
		  //j:0-i
		 
		 for(int i=6;i>=1;i--) {
			 for(int j=0;j<=i;j++) {
				 if(arr[j]>arr[j+1]) {
					  int temp = arr[j];
					  arr[j]=arr[j+1];
					  arr[j+1]=temp;
					 
				 }
			 }
		 }
		 
		 for(int k=0;k<=7;k++) {
			 System.out.print(arr[k]+" ");
		 }
	}

}
