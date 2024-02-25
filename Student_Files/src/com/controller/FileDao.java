package com.controller;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


import com.pojo.Stdpojo;

public class FileDao {
	
	
	public void getdata() {
		System.out.println("getting the datafrom file");
		
		try {
			FileReader fr = new FileReader("E:\\Slokam Files\\def.txt" );
			
			//For Character by Character reading
			/*int h = fr.read();
			char c =(char)h; //Conversion ascii in to character
			System.out.println(c); 
			int h1 = fr.read();
			System.out.println(h1);//gives second letter ascii value
			int h2 = fr.read();
			System.out.println(h2);
			int h3 = fr.read();
			System.out.println(h3);*/
			
			//For line by line Reading
			
			/*BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			System.out.println(s);
			String s1 = br.readLine();
			System.out.println(s1);
			String s2 = br.readLine();
			System.out.println(s2);
			String s3 = br.readLine();
			System.out.println(s3);
			String s4 = br.readLine();
			System.out.println(s4);*/
			
			//if 1000 lines are there above is not correct process use for loop
			BufferedReader br = new BufferedReader(fr);
			for(String str = br.readLine();str!=null; str = br.readLine()) {
				System.out.println(str);
			}
			br.close();
			fr.close();
		}
		catch(Exception e){System.out.println(e);}
	}
 
	 
        public void insert(Stdpojo std) {
        	System.out.println("File Started");
        	try {
        	FileWriter fw = new FileWriter("E:\\Slokam Files\\def.txt",true);
        	BufferedWriter bw = new BufferedWriter(fw);
        	
        	String data = std.getSid()+","+std.getSname()+","+std.getSage()+","+std.getSmarks()+"\n";
            //fw.write(data);
        	bw.write(data);
        	bw.newLine();
        	bw.close();
        	fw.close();
        	System.out.println("File Saved");
        	}
        	catch(Exception e) {
        		System.out.println("exception");
        	}
        	 
        }
	}


