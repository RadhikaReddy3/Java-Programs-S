package com.spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	@Autowired
	private Dao da;
	
	
    public void save(Empdata emp) 
    {
		System.out.println("Iam in service save started");
		da.save(emp);
		System.out.println("Iam in service save ended");
	}
	public void update(int eid, String ename, int eage) {
		
		System.out.println("Iam in service update started");
		da.update(eid, ename, eage);
		System.out.println("Iam in service update ended");
		
	}
	public void delete(int eid) {
		System.out.println("Iam in service delete started");
		da.delete(eid);
		System.out.println("Iam in service update ended");
		
	}
	public Empdata getById(int eid) {
		System.out.println("Iam in Service GetById started");
		Empdata empl =da.getById(eid);
		System.out.println("Iam in Service GetById ended");
		return empl;
		
	}
	public List<Empdata> getAll(){
		System.out.println("Iam in Service GetByAll started");
		List<Empdata> empl =da.getAll();
		System.out.println("Iam in Service GetByAll ended");
		return empl;
		
	}

	

}
