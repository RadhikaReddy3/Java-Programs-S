package com.controller;

import java.io.BufferedReader;
import java.io.FileReader;

import com.pojo.Student;

public class Btechdata implements Filedata{
	@Override
	public Student[] getalldata() {
		 System.out.println("Student BTech data");
		 try {
			 FileReader fr = new FileReader("E:\\Slokam Files\\student.txt");
			 BufferedReader br = new BufferedReader(fr);
		 
			 for(String s=br.readLine();s!=null;s=br.readLine()) {
				 
				 String[] data = s.split(",");
				 if(data[3].equals("btech")) 
				 {
				 System.out.println(s);
			 }
			}
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		return null;
	}
}
		 
	

	 
