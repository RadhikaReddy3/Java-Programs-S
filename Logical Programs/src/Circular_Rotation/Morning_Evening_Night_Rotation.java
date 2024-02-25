package Circular_Rotation;

public class Morning_Evening_Night_Rotation {

	public static void main(String[] args) {
		int arr[]= {5,2,12,10,89,90,98,4,30,40,45,46,77,43};
		
		for(int i=0;i<arr.length;i++) {
			if(i%3==0) {
				System.out.println("Morning: "+arr[i]);
			}
			else if(i%2==1) {
				System.out.println("Evening: "+arr[i]);
			}
			else {
				System.out.println("Night: "+arr[i]);
			}
		}

	}

}
