package com.spring;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class Test {

	public static void main(String[] args) {
		ApplicationContext ap = new AnnotationConfigApplicationContext(OurConf.class);
		Controller std= ap.getBean(Controller.class);
		 //std.save(new Empdata(1,"siva",23,"BTECH"));
		//std.update(1, "sivaram", 21);
		//Empdata e =std.getById(1);
		//System.out.println(std.getById(1));
		
		List<Empdata>d=std.getAll();
		//System.out.println(d);
		for(Empdata da:d) {
			System.out.println(da);
		}

	}

}
