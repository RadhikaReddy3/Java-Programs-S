package com.wipro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 

public class Test {

	public static void main(String[] args) {
		ApplicationContext ap = new AnnotationConfigApplicationContext(OurCon.class);
		ProductDao std= ap.getBean(ProductDao.class);
		std.save(new ProductEntity(2, "Choc", new java.sql.Date(System.currentTimeMillis()) ,"Thursday", new java.sql.Time(System.currentTimeMillis())));

	}

}