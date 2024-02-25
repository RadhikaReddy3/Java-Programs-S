package com.readdata;

import java.io.FileReader;
public class Rdata {

	public static void main(String[] args) {
	 
		try {
			FileReader fr= new FileReader("E:\\Slokam Files\\abc.txt");
			
			for(int i= fr.read();i!=-1; i= fr.read()) {
				
				char c = (char)i;
				System.out.print(c);
				 
			}
			System.out.println(fr);
			System.out.println("File read--");
		}
           catch(Exception e) {
        	 System.out.println("Exception");  
           }
	}	}