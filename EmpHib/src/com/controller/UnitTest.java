package com.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.*;

public class UnitTest {
	
	
	public static void savedata(Employee p) {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
	    Transaction t=	s.beginTransaction();
	   
	    s.save(p);
	    
	    t.commit();
		s.close();
		sf.close();
	}
	
	public static void getByID(int eid) {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		//Query p =s.createQuery("from Employee where eid =:eid");
		Query p =s.createQuery("from Employee where eid >=:eid");
		p.setParameter("eid", eid);
		List<Employee> emp =p.list();
		for(Employee em: emp) {
			System.out.println(em);
		}
	}
	
	public static void getByName(String ename) {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query p =s.createQuery("from Employee where ename =:ename");
		p.setParameter("ename", ename);
		List<Employee> emp =p.list();
		for(Employee em: emp) {
			System.out.println(em);
		}
	}
	
	public static void getAll() {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query p =s.createQuery("select e.eid, e.ename, e.esal from Employee e");
		 
		List<Object[]> emp =p.list();
		for(Object[] em: emp) {
			System.out.println(em[0]+", "+em[1]+", "+em[2]);
		}
	}
	
	public static void update(int eid,String ename, double esal, String edes) {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Transaction k =s.beginTransaction();
		Query p =s.createQuery("update  Employee set  ename=:ename, esal=:esal, edes=:edes where eid=:eid");
	 
		 
		
		p.setParameter("ename", ename);
		p.setParameter("esal", esal);
		p.setParameter("edes", edes);
		p.setParameter("eid", eid);
		
		int result =p.executeUpdate();
		System.out.println(result);
		//s.update(p);
		k.commit();
		s.close();
		sf.close();
		
	}
	
	public static void delete(String ename) {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Transaction k =s.beginTransaction();
		Query p =s.createQuery("delete from Employee where ename=:ename");
        p.setParameter("ename", ename);
		
		int result =p.executeUpdate();
		System.out.println(result);
		//s.delete(p);
		k.commit();
		s.close();
		sf.close();
		
	}
	
	 

	public static void main(String[] args) {
		 
		UnitTest a = new UnitTest();
		
		Employee e = new Employee();
		e.setEname("anjan");
		e.setEsal(5.6);
		e.setEloc("chennai");
		e.setEdes("jd");
		
		//a.savedata(e);
		//a.getByID(1);
		//a.getByName("lilly");
		//a.update(1,"anj", 77.7,"dev");
		//a.delete("hj");
		a.getAll();

	}

}
 