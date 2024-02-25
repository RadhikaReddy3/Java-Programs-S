package com.slokam;

public class Slkstd {
	
	void m1() 
	{
		System.out.println("Normal instance Method");
		System.out.println("Returntype it is not going to return anything to the calling method");
		System.out.println("Method call without any parameters");
		
	}
	
	void m2(int b, String k) 
	{
		System.out.println(b);
		System.out.println(k);
		System.out.println("Normal instance Method");
		System.out.println("Returntype it is not going to return anything to the calling method");
		System.out.println("Method call parameters:(byte, short, int, long, float, double, boolean, char, String)");
		
	}
	
	void m3(double[] marks,String[] subj) 
	{
		System.out.println("Student Marks Address:"+marks);
		for(int i=0;i<marks.length;i++) 
		{
			System.out.println("Marks Obtained: "+marks[i]);
		}
		System.out.println("Subjects Address: "+subj);
		for(int i=0;i<subj.length;i++) 
		{
			System.out.println("Subjects: "+subj[i]);
		}
        System.out.println("Normal instance method");
        System.out.println("returntype it was not returning anything to calling method");	
        System.out.println("Method call parameters:(byte[], short[], int[], long[], float[], double[], boolean[], char[], String[])");
	}
	void m4(Student std) 
	{
		System.out.println(std.sid);
		System.out.println(std.sname);
		System.out.println("Student Marks Address: "+std.marks);
		for(int i=0;i<std.marks.length;i++)
		{
			System.out.println("Marks Obtained: "+std.marks[i]);
		}
		System.out.println("Subjects Address: "+std.subj);
		for(int i=0;i<std.marks.length;i++)
		{
			System.out.println("Subjects: "+std.subj[i]);
		}
		      System.out.println("Normal instance method");
              System.out.println("returntype it was not returning anything to calling method");	
			  System.out.println("Method Call Parameter can be class instance/Object also");
		
		 
		
	}

}
