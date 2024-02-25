package com.writedata;

import java.io.FileWriter;
import java.io.BufferedWriter;
 

public class Wdata {

	public static void main(String[] args) {
		try {
			FileWriter fw= new FileWriter("E:\\Slokam Files\\ghi.txt",true);
			BufferedWriter b = new BufferedWriter(fw);
			b.write("2,Sita,B.TECH,95%");
			b.newLine();
			 
			b.close();
			fw.close();
			
			System.out.println("Record inserted");
	}
    catch(Exception e) {
    	System.out.println("Exception");
    }
}}
