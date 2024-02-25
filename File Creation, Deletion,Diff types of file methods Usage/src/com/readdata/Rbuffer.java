package com.readdata;

import java.io.BufferedReader;
import java.io.FileReader;

public class Rbuffer {

	public static void main(String[] args) {
		
		try {
			FileReader fr= new FileReader("E:\\Slokam Files\\abc.txt");
			BufferedReader br = new BufferedReader(fr);
			//System.out.println(br.readLine());
			//System.out.println(br.readLine());
			for(String s = br.readLine(); s!=null; s=br.readLine()) {
			   System.out.println(s);	
			}
			
			 
			 
			System.out.println("Data read");
			br.close();
			fr.close();
	}
    catch(Exception e) {
    	System.out.println("Exception");
    }
		

	}

}
