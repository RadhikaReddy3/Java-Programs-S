package com.cisco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	public void save(Student se) {
		System.out.println("We are in Controller save started");
		System.out.println("We are going to Service from controller");
	    ss.save(se);
	    //System.out.println("StudentDetails:"+se);
		System.out.println("We are in Controller save completed"+"\n"+se);
	}
	
	public void update(int sid, String sname, int sage) {
		System.out.println("We are in Controller update started");
		System.out.println("We are going to Service from controller");
	    ss.update(sid, sname, sage);
	    //System.out.println("StudentDetails:"+se);
		System.out.println("We are in Controller update completed"+"\n"+sid+","+sname+","+sage);
	
	}
	public void delete(int sid) {
		System.out.println("We are in Controller delete started");
		System.out.println("We are going to Service from controller");
	    ss.delete(sid);
	    //System.out.println("StudentDetails:"+se);
		System.out.println("We are in Controller delete completed"+"\n"+sid );
	
	}
	public Student getByid(int sid)
	{
		return	ss.getByid(sid);
	}
	public List<Student> getAll() {
		
		return ss.getAll();
	}

	
	 
}
