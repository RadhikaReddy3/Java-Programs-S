package com.spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Dao {
	@Autowired
	private JdbcTemplate jt;
	
	
    public void save(Empdata emp) 
    {
		 System.out.println("Iam in Dao save started");
		 jt.update("insert into emp.empdata values (?,?,?,?)", emp.getEid(),emp.getEname(),emp.getEage(),emp.getEqual());
		 System.out.println("Iam in Dao save ended");
	}
	public void update(int eid, String ename, int eage) {
		
		System.out.println("Iam in Dao update started");
		 jt.update("update emp.empdata set ename =?, eage =? where eid =?", ename, eage, eid);
		 System.out.println("Iam in Dao update ended");
		
	}
	public void delete(int eid) {
		
		System.out.println("Iam in Dao delete started");
		 jt.update("delete from emp.empdata where eid =?", eid);
		 System.out.println("Iam in Dao delete ended");
		
	}
	public Empdata getById(int eid) {
		System.out.println("Iam in Dao GetById started");
		Empdata da = jt.queryForObject("select*from emp.empdata where eid =?",  BeanPropertyRowMapper.newInstance(Empdata.class),eid);
		 System.out.println("Iam in Dao GetById ended");
		return da;
		
	}
	public List<Empdata> getAll(){
		System.out.println("Iam in Dao GetByAll started");
		List<Empdata> empl =jt.query("select*from emp.empdata", BeanPropertyRowMapper.newInstance(Empdata.class));
		System.out.println("Iam in Dao GetByAll ended");
		return empl;
		
	}


}
