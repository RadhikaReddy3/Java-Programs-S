package com.cisco;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
		ApplicationContext ap = new AnnotationConfigApplicationContext(JDBCutility.class);
		StudentController std= ap.getBean(StudentController.class);
		//std.save(new Student(3,"a",97.5,57));
		//std.update(3, "Akhi", 21);
		//std.delete(4);
		//System.out.println(std.getByid(2)); 
		
		/*
		 * List<Student> st = std.getAll(); for(Student stdd: st) {
		 * System.out.println(stdd); }
		 */
		std.getByid(2);
		//std.getAll();
         
		 
	}

}
