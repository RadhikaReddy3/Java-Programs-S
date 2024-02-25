
public class marks {

	public static void main(String[] args) {
		 
		int marks[]= {73, 86, 95,34,31,56};
		
		int i =0;
		double tmarks = 0;
		
		while(i<=marks.length-1) {
			
			if(marks[i]>=35) {
				System.out.println("Pass"+"  "+marks[i]);
			}
			else {
				System.out.println("Fail"+"  "+marks[i]);
			}
			
	            tmarks = tmarks+marks[i];
	            i=i+1;
			
		}
		System.out.println("Total Marks: "+tmarks);
		System.out.println("Percentage: "+" "+tmarks/marks.length);
		
		

	}

}




 
