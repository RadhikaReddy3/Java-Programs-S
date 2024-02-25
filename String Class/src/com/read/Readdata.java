package com.read;
import java.io.FileReader;
import java.io.BufferedReader;
public class Readdata {

	public static void main(String[] args) {
		try { 
		FileReader fr = new FileReader("E:\\Slokam Files\\Std.txt");
		BufferedReader br = new BufferedReader(fr);
		 
		for(String  s= br.readLine() ;s!=null;s=br.readLine()) {
			//System.out.println(s);
			String[] e= s.split(",");
			System.out.println("eid: "+e[0]);
			System.out.println("ename: "+e[1]);
			System.out.println("eage: "+e[2]);
			System.out.println("esal: "+e[3]);
			System.out.println("edes: "+e[4]);
			
			System.out.println("----next employee details----");
			
			 
		 
		}
		br.close();
		fr.close();
 
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
