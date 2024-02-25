package com.slokam;

import java.io.FileReader;
public class Total_Characters_Count {

	public static void main(String[] args) {
		try { 
		FileReader fr = new FileReader("E:\\Slokam Files\\slo.txt");
		
		int  Count = 0;
		for(int i=fr.read();i!=-1;i=fr.read()) {
			  Count++;
			  char c=(char)i;
			  System.out.print(c);
		}
		fr.close();
		System.out.println(" ");
		System.out.println("Total_Count of characters :"+ Count);
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}

}
