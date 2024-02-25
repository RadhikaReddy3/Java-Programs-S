package com.cisco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JDBCtemplatestd {
	
	@Autowired
	private JdbcTemplate ju;
	
	public void save(Student se) {
		
		System.out.println("We are in the JDBCTemplate save method started");
		ju.update("insert into springtem.student(sid,sname,smarks,sage) values(?,?,?,?)", se.getSid(),se.getSname(),se.getSmarks(),se.getSage());
		System.out.println("We are in the JDBCTemplate save method completed");
	}

public void update(int sid, String sname, int sage) {
		
		System.out.println("We are in the JDBCTemplate update method started");
		ju.update("update springtem.student set sname =?, sage =? where sid =?",sname, sage, sid);
		System.out.println("We are in the JDBCTemplate update method completed");
	}

public void delete(int sid) {
	
	System.out.println("We are in the JDBCTemplate delete method started");
	ju.update("delete from springtem.student where sid =?", sid);
	System.out.println("We are in the JDBCTemplate delete method completed");
}

public Student getByid(int sid)
{
	 System.out.println("I am at JDBC template getById method");
	 Student s = ju.queryForObject("select * from springtem.student where sid=?",BeanPropertyRowMapper.newInstance(Student.class),sid);
	System.out.println(s);
	 return s;
	
}
public List<Student> getAll() {
	System.out.println("iam at JDBC template getAll method");
	List<Student> d = ju.query("select * from springtem.student", BeanPropertyRowMapper.newInstance(Student.class));

	for(Student s : d) {
		System.out.println(s);
	}
	
	return d;
	
}

}
