package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	public void save(Student se) {
		System.out.println("We are in Controller save started");
	    ss.save(se);
	    System.out.println("StudentDetails:"+se);
		System.out.println("We are in Controller save completed");
	}
	
	public void update(int sid, int sage, double smarks) {
		Student se = new Student();
		ss.update(sid, sage, smarks);
	}
	public void delete(int sid) {
		Student se = new Student();
		ss.delete(sid);
		
	}
	public Student GetById(int sid) {
		
		Student se = new Student();
		ss.GetById(sid);
		return se;
		
	}
public void GetAll() {
		
		Student se = null;
		ss.GetAll();
		 
		
	}

}
