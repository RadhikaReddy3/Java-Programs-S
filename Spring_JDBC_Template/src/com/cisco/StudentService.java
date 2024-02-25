package com.cisco;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

	@Autowired
    private JDBCtemplatestd jtd;
    public void save(Student se) {
		System.out.println("We are in Student Service save started");
		System.out.println("We are going to JDBCtemplatestd from Student servixe");
		jtd.save(se);
		System.out.println("We are in Student Service save completed");
	}
    
    public void update(int sid, String sname, int sage) {
		System.out.println("We are in Student Service update started");
		System.out.println("We are going to JDBCtemplatestd from Student service");
		 jtd.update(sid, sname, sage);
		System.out.println("We are in Student Service update completed");
	}
    
    public void delete(int sid) {
		System.out.println("We are in Student Service delete started");
		System.out.println("We are going to JDBCtemplatestd from Student service");
		 jtd.delete(sid);
		System.out.println("We are in Student Service delete completed");
	}
    public Student getByid(int sid)
	{
		return	jtd.getByid(sid);
	}
	public List<Student> getAll() {
		return jtd.getAll();
	}

    
}
