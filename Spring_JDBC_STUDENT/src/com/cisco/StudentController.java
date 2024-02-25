package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	public void save(StudentEntity se) {
		System.out.println("We are in Controller save started");
	    ss.save(se);
	    System.out.println("StudentDetails:"+se);
		System.out.println("We are in Controller save completed");
	}

}
