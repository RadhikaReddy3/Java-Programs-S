package com.cisco;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
		ApplicationContext ap = new AnnotationConfigApplicationContext(JDBCutility.class);
		StudentController std= ap.getBean(StudentController.class);
		//std.save(new Student(1,"radhika",95.7,51));
        // std.update(1, 21, 95.5);
		//std.delete(1);
		//std.GetById(6);
		//std.GetAll();
		std.GetAll();
	}

}
