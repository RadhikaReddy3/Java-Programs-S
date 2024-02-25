package Class8_04_12_2023;

import java.util.Arrays;

public class Compare_Arrays_without_Arrays_equals_Method {

	public static void main(String[] args) {
		
		//Step-1: Taking char Array itself
		char arr1[]= {'a','c','r'};
		char arr2[]= {'c','a','r'};
		
		  //Step-2: Find the length
		  if(arr1.length==arr2.length) {
			  
			  //Step-3: Sort each char Array
			  Arrays.sort(arr1);
			  Arrays.sort(arr2);
			  
			    boolean flag=true;
			     
			      //Step-4: Compare both char Arrays
			      for(int i=0;i<arr1.length;i++) {
			    	  if(arr1[i]!=arr2[i]) {
			    		 flag=false;
			    		 System.out.println("Not same");
			    		 break;
			    	  }
			    	   
			      }
			      if(flag) {
			    	  System.out.println("Same Arrays");
			      }
		  }
			      else{
			    	 System.out.println("Not Same"); 
			      }
			      
		  }
		}
//for comparing first to last we use this technique .Flag technique is very useful	
				   
			   
		 
