package com.slokam;

import java.io.FileReader;

public class Capital_Characters_Count {

	public static void main(String[] args) {
		try { 
			FileReader fr = new FileReader("E:\\Slokam Files\\slo.txt");
			
			int  CapitalCount = 0;
			for(int i=fr.read();i!=-1;i=fr.read()) {
				if(i>=65&&i<=90) {
				  CapitalCount++;
				  char c=(char)i;
				  System.out.print(c);
				  
			}
			}
			fr.close();
			System.out.println(" ");
			System.out.println("Total_Count of Capital characters :"+ CapitalCount);
			}
			catch(Exception e) {
				System.out.println("Exception");
			}
		}


	}


