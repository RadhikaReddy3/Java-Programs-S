package com.cisco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController {
	@Autowired
	private StudentDao sd;
	
	public void savedata(StudentPojo std) {
		System.out.println("StudentController Started the savemethod");
		sd.savedata(std);
		System.out.println("StudentController Completed the savedata");
	}
	

}
