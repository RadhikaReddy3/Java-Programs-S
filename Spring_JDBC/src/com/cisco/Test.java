package com.cisco;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
		ApplicationContext c = new AnnotationConfigApplicationContext(OurConfiguration.class);
		 //StudentController std =c.getBean(StudentController.class);
		 //std.savedata(new StudentPojo(3,"RamReddy",99.5,21));
         
		StudentDao st = c.getBean(StudentDao.class);
         //st.updatedata(1, "Janu", 100);
         //st.deletedata(1);
         //st.getById(1);
         ArrayList<StudentPojo> data1 = st.getAll();
    	 System.out.println(data1);

	}

}
