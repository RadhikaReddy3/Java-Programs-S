package com.cisco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ap = new AnnotationConfigApplicationContext(OurConf.class);
		StudentDao std= ap.getBean(StudentDao.class);
		//std.save(new StudentEntity(4,"ra",97.5,98237892l));
        //std.update(3, 87892, "dev");
		//std.delete(4);
		//std.GetById(1);
		//std.GetAll();
		

	}

}
