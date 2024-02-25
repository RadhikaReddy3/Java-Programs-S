package com.cisco;

public class smarks {

	public static void main(String[] args) {
		 int[] marks = {45,56,67,34,89,90};
		 int tmarks = 0;
		 //boolean flag = true;
		 for(int i=0;i<= marks.length-1;i++) {
			 
			 tmarks = tmarks+marks[i];
			  if(marks[i]>=35) {
				  System.out.println("Pass"+"  "+"Marks Obtained: "+marks[i]);
			  }
			  else {
				  System.out.println("Fail"+"  "+"Marks Obtained: "+marks[i]);
			  }
			   
		 }
		 System.out.println("Total marks: "+tmarks);
		 System.out.println("Percentage: "+tmarks/(marks.length));
		 
		  

	}

}
