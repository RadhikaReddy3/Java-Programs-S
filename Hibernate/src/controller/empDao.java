package controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import pojo.employee;

 
public class empDao {

	 public void savedata(employee em) {
		System.out.println("Saving the emp data to database partially");
		// System.out.println(em);
		 
		 Session s= getCon.con();
		  
		  Transaction t = s.beginTransaction();
		  s.save(em);
		  t.commit();
		  s.close();
	 }

 
 
	public void getByID(int eid) {
		System.out.println("Saving the emp data to database partially");
		
		 Session s= getCon.con();

		  employee e =(employee)s.get(employee.class, eid);
		  System.out.println(e);
		  s.close();
		
	}
	
	public void updatedata() {
		
		  Session s= getCon.con();
		  
		  Transaction t = s.beginTransaction();
		  employee e = (employee)s.get(employee.class, 1); 
		   
		  e.setEname("siva");
		  e.setEsal(456.7);
		  e.setEdes("se");
		  s.update(e);
		  t.commit();
		  s.close();
		
	}
	
public void deletedata() {
		
	 Session s= getCon.con();
		  
		  Transaction t = s.beginTransaction();
		  employee e = (employee)s.get(employee.class, 4);
		  s.delete(e);
		   
		  t.commit();
		  s.close();
		
	}

  public void getByAll() {
	System.out.println("Retrieving all the data");
	
	 Session s= getCon.con();

	  Query t =s.createQuery("from employee");
	   
	  List<employee>data=t.list();
	  for(employee p:data) {
		  System.out.println(p);
	  }
	  s.close();
	
}
  
//05/01/2024  
  public void getAllselect() {
		Session s = getCon.con();
		Query  q =s.createQuery("select e.ename, e.esal,e.edes from employee e");
		List<Object[]> g = q.list();
		for(Object[] o: g) {
			System.out.println(o[0]+"---"+o[1]+"----"+o[2]);
		}
		s.close();
	}
	public void getAllwhere() {
		Session s = getCon.con();
		Query  q =s.createQuery("select e.ename, e.esal, e.edes from employee e where e.eid>=2 and e.esal>=800");
		List<Object[]> g = q.list();
		for(Object[] o: g) {
			System.out.println(o[0]+"-----"+o[1]+"-----"+o[2]);
		}
		s.close();
	}
	public void getAllwheredynamic(int eid , double esal) {
		Session s = getCon.con();
		Query  q =s.createQuery("select e.ename, e.esal, e.edes from employee e where e.eid>=:eid and e.esal>=:esal");
		q.setParameter("eid", eid);
		q.setParameter("esal", esal);
		List<Object[]> g = q.list();
		for(Object[] o: g) {
			System.out.println(o[0]+"-----"+o[1]+"-----"+o[2]);
		}
		s.close();
	}
	public void updateselect(int eid,double esal, String edes) {
		Session s = getCon.con();
		Transaction t = s.beginTransaction();
		String h ="update employee set esal=:esal,  edes=:edes where eid=:eid";
		Query q = s.createQuery(h);
		q.setParameter("esal",esal);
		q.setParameter("edes",edes);
		q.setParameter("eid",eid);
		int r=q.executeUpdate();
		System.out.println("updated row:"+r);
		t.commit();
		s.close();
				
		
	}
	
	
	public void deleteusinghql(String ename) {
		Session s = getCon.con();
		Transaction t = s.beginTransaction();
		String h =" delete from employee where ename=:ename";
		Query q = s.createQuery(h);
		q.setParameter("ename",ename);
		int r=q.executeUpdate();
		System.out.println("deleted row:"+r);
		t.commit();
		s.close();
				
		
	}
	
	//Aggregate Functions
	
	 
	
	  public void orderby() {
			System.out.println("Retrieving all the data");
			
			 Session s= getCon.con();

			  
			  //Query t =s.createQuery("from employee order by esal");
			 /*List<employee>data=t.list();
			  for(employee p:data) {
				  System.out.println(p);
			  }
			  s.close();*/
			 Query t =s.createQuery("select ename, edes from employee order by esal");
			  List<Object[]>data=t.list();
			  for(Object []p:data) {
				  String ename =  (String) p[0];
			        String edes = (String) p[1];
			        System.out.println("Name: " + ename + ", Designation: " + edes);
			  }
			  s.close();
			
		}
	  
	  public void count() {
		  
		  Session s = getCon.con();
			Query  q =s.createQuery("select  count(*) from employee");
			List<Object> g = q.list();
			 System.out.println(g);
			s.close();
		  
	  }
	  
 public void max() {
		  
		  Session s = getCon.con();
			Query  q =s.createQuery("select  max(esal) from employee");
			List<Object> g = q.list();
			 System.out.println(g);
			s.close();
		  
	  }

 public void min() {
	  
	  Session s = getCon.con();
		Query  q =s.createQuery("select  min(esal) from employee");
		List<Object> g = q.list();
		 System.out.println(g);
		s.close();
	  
 }
 
 
 

 public void sum() {
	  
	  Session s = getCon.con();
		Query  q =s.createQuery("select  sum(esal) from employee");
		List<Object> g = q.list();
		 System.out.println(g);
		s.close();
	  
}
 
 public void getAllagg() {
	  
	  Session s = getCon.con();
		Query  q =s.createQuery("select  count(*),max(esal),min(esal),sum(esal) from employee");
		List<Object[]> g = q.list();
		  
		 
		 for(Object[] p: g ) {
			 System.out.println(p[0]+"---"+p[1]+"---"+p[2]+"---"+p[3]);
		 }
		s.close();
	  
}

 public void groupby() {
	  
	  Session s = getCon.con();
		Query  q =s.createQuery("select  count(*),max(esal),min(esal),sum(esal),edes from employee group by edes ");
		List<Object[]> g = q.list();
		  
		 
		 for(Object[] p: g ) {
			 System.out.println(p[0]+"---"+p[1]+"---"+p[2]+"---"+p[3]+"---"+p[4]);
		 }
		s.close();
	  
}
 
 public void groupbyandorderby() {
	  
	  Session s = getCon.con();
		Query  q =s.createQuery("select  max(esal),min(esal),sum(esal),count(*),edes from employee group by edes order by esal desc ");
		List<Object[]> g = q.list();
		  
		 
		 for(Object[] p: g ) {
			 System.out.println(p[0]+"---"+p[1]+"---"+p[2]+"---"+p[3]+"---"+p[4]);
		 }
		s.close();
	  
}

  
  
}
