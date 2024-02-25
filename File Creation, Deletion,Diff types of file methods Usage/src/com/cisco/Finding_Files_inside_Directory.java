package com.cisco;
import java.io.File;
 
public class Finding_Files_inside_Directory {

	public static void main(String[] args) {
		 
		File f = new File("E:\\html");
		 	
		 
		//System.out.println(f.isDirectory());
		
		File[] data=f.listFiles();
	     
		//String[] n=f.list();//It gives only file names
	    
		 for(int i=0;i<data.length;i++) {
			 System.out.println(data[i]);
			 System.out.println("File name: "+data[i].getName());
			 System.out.println("Is a directory: "+data[i].isDirectory());
			 
			 if(data[i].isDirectory()) 
			 {
				 System.out.println("Directory Exists: "+ data[i].getName()+"\n");
				 String[]  b = data[i].list();//You can give file[] also for files
				 
				 for(int z=0;z<b.length;z++) 
				 {
					 System.out.println(b[z]+"\n");
				 }
			 }
		 }
		 /*if(f.exists()) {
				System.out.println(f.canRead());
				System.out.println(f.canWrite());
			}
			else {
				System.out.println("No file exists");
			}*/
		 
}		
}				
			
			 
		
	
	

