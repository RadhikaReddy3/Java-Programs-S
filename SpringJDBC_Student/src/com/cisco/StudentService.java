package com.cisco;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

	@Autowired
    private StudentDao sd;
    public void save(Student se) {
		System.out.println("We are in Controller save started");
		sd.save(se);
		System.out.println("We are in Controller save completed");
	}
    public void update(int sid, int sage, double smarks) {
		Student se = new Student();
		sd.update(sid, sage, smarks);
	}
    
    public void delete(int sid) {
		Student se = new Student();
		sd.delete(sid);
		
	}
public Student GetById(int sid) {
		
		Student se = new Student();
		sd.GetById(sid);
		return se;
		
	}
public ArrayList<Student> GetAll() {
	
	//Student se = null;
	//sd.GetAll();
	return sd.GetAll();
	
}
}