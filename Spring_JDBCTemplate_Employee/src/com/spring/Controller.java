package com.spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	
	@Autowired
	private Service ser;
	
	public void save(Empdata emp) 
	{
	System.out.println("Iam in Controller save started");
	ser.save(emp);
	System.out.println("Iam in Controller save ended");
	}
	public void update(int eid, String ename, int eage) {
	
		System.out.println("Iam in Controller update started");
		ser.update(eid, ename, eage);
		System.out.println("Iam in Controller update ended");
	}
	public void delete(int eid) {
		
		System.out.println("Iam in Controller delete started");
		ser.delete(eid);
		System.out.println("Iam in Controller update ended");
		
	}
	public Empdata getById(int eid)
	{
		System.out.println("Iam in Controller GetById started");
		Empdata empl =ser.getById(eid);
		System.out.println("Iam in Controller GetById ended");
		return empl;
		
	}
	public List<Empdata> getAll(){
		System.out.println("Iam in Controller GetByAll started");
		List<Empdata> empl =ser.getAll();
		System.out.println("Iam in Controller GetByAll ended");
		return empl;
		
	}
	 
}
