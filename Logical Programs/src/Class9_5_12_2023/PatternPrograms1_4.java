package Class9_5_12_2023;

public class PatternPrograms1_4 {

	public static void main1(String[] args) {
		for(int i=1;i<=5;i++) {
			/*
			 * 
			 * 
			 * 
			 * 
			 */
		 System.out.println("* ");
		}
	}
	public static void main2(String[] args) {
		for(int i=1;i<=5;i++) {
			/*      *****     */
		 System.out.print("* ");
		}
	}
	public static void main3(String[] args) {
		/*
		          
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * *      */
		for(int j=1;j<=5;j++) {
		for(int i=1;i<=5;i++) {
		 System.out.print("* ");
		}
		System.out.println();
		
	}}
	
	public static void main(String[] args) {
	 /*             1 2 3 4 5 
                    1 2 3 4 5 
                    1 2 3 4 5 
                    1 2 3 4 5 
                    1 2 3 4 5 
       */
		for(int j=1;j<=5;j++) {
		for(int i=1;i<=5;i++) {
		 System.out.print(i+" ");
		}
		System.out.println();
		
	}}
}
