package com.controller;
import java.io.FileReader;
import java.io.BufferedReader;
import com.pojo.Student;

public class Studentdata implements Filedata {

	@Override
	public Student[] getalldata() {
		 System.out.println("Get All Student Details ");
		 
		 
		 try {
			 FileReader fr = new FileReader("E:\\Slokam Files\\student.txt");
			 BufferedReader br = new BufferedReader(fr);
			 for(String s=br.readLine();s!=null;s=br.readLine()) {
				 System.out.println(s);
			 }
			 
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		return null;
	}

	
	public static void main(String[] args) {
		
		
		 

	}
}
