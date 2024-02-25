package com.slokam;

import java.io.FileReader;

public class Special_Characters {

	public static void main(String[] args) {
		try { 
			FileReader fr = new FileReader("E:\\Slokam Files\\slo.txt");
			
			int  SpecialCount = 0;
			for(int i=fr.read();i!=-1;i=fr.read()) {
				//32–47 / 58–64 / 91–96 / 123–126
				if((i>=32&&i<=47)||(i>=58&&i<=64)||(i>=91&&i<=96)||(i>=123&&i<=126)) {
				  SpecialCount++;
				  char c=(char)i;
				  System.out.print(c);
				  
			}
			}
			fr.close();
			System.out.println(" ");
			System.out.println("Total_Count of Special characters :"+ SpecialCount);
			}
			catch(Exception e) {
				System.out.println("Exception");
			}
       
	}
 
}
