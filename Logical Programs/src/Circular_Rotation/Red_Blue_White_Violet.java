package Circular_Rotation;

public class Red_Blue_White_Violet {

	public static void main(String[] args) {
		int arr[]= {5,2,12,10,89,90,98,4,30,40,45,46,77,43};
		for(int i=0;i<arr.length;i++) {
			 if(i%4==0) {
				 System.out.println("Red: "+arr[i]);
			 }
			 else if(i%4==1) {
				 System.out.println("Blue: "+arr[i]);
			 }
			 else if(i%4==2) {
				 System.out.println("White: "+arr[i]);
			 }
			 else {
				 System.out.println("Violet: "+arr[i]);
			 }
		}

	}

}
