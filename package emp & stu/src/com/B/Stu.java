package com.B;
import java.util.Scanner;
public class Stu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter student id");
		int sid = s.nextInt();
		System.out.println("Student id: "+sid);
		System.out.println("please enter student name");
		String sname = s.next();
		System.out.println("Student Name: "+sname);
		System.out.println("please enter student mail");
		String smail = s.next();
		System.out.println("Student Mail: "+smail);
		System.out.println("please enter student hindi marks");
		int shindi = s.nextInt();
		System.out.println("please enter student english marks");
		int senglish = s.nextInt();
		System.out.println("please enter student telugu marks");
		int stelugu = s.nextInt();
		System.out.println("please enter student maths marks");
		int smaths = s.nextInt();
		System.out.println("please enter student science marks");
		int sscience = s.nextInt();
		System.out.println("please enter student social marks");
		int ssocial = s.nextInt();
		double totalmarks = (shindi+senglish+stelugu+smaths+sscience+ssocial);
		System.out.println("total marks "+totalmarks);
		double percentage = (totalmarks/6);
		System.out.println("percentage "+percentage);

		if(shindi <=34) {
			System.out.println("Hindi fail");
			
		}else if(senglish <=34) {
			System.out.println("English fail");
		}
		
		else if(stelugu <=34) {
			System.out.println("Telugu fail");
		}
		
		else if(smaths <=34) {
			System.out.println("Maths fail");
		}
		
		else if(sscience <=34) {
			System.out.println("Science fail");
		}
		
		else if(ssocial <=34) {
			System.out.println("Social fail");
		}
		
		else if(shindi >= 35 && senglish >= 35 && stelugu >= 35 && smaths >= 35 && sscience >= 35 && ssocial >=35 ) {
			System.out.println("pass");
		}
		s.close();
	}

}