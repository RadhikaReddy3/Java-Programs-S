package com.cisco;

import java.io.File;
 
public class Filecreation {

	public static void main(String[] args) {
 
		//File f = new File("E:\\Slokam Files\\Emp.txt");
	
		 
		//File f = new File("E:\\Slokam Files\\Emp");
		//f.delete();
		
		File f = new File("E:\\Slokam Files\\def.txt");
		
		if(f.exists()) {
			System.out.println("File already exists");
		}
		else {
			try 
			{
				System.out.println("creating new file");
				f.createNewFile();
			}
			catch(Exception e)
			{
				System.out.println("Exception");
			}
		}
		  
		  

	}

}
