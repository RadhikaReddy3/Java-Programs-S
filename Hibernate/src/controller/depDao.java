package controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.department;

 

public class depDao {
	

		 public void savedata(department dep) {
			System.out.println("Saving the emp data to database partially");
			// System.out.println(em);
			 
			 Session s= getCon.con();
			  
			  Transaction t = s.beginTransaction();
			  s.save(dep);
			  t.commit();
			  s.close();
		 }

	 
	 
		public void getByID(int did) {
			System.out.println("Saving the emp data to database partially");
			
			 Session s= getCon.con();

			  department e =(department)s.get(department.class, did);
			  System.out.println(e);
			  s.close();
			
		}
		
		public void updatedata() {
			
			 Session s= getCon.con();
			  
			  Transaction t = s.beginTransaction();
			  department e = (department)s.get(department.class, 2); 
			   
			  e.setDname("IT");
			  e.setDloc("Hyd");
			  e.setDphno(9876543210l);
			  s.update(e);
			  t.commit();
			  s.close();
			
		}
		
	public void deletedata() {
			
		 Session s= getCon.con();
			  
			  Transaction t = s.beginTransaction();
			  department e = (department)s.get(department.class, 2);
			  s.delete(e);
			   
			  t.commit();
			  s.close();
			
		}

	  public void getByAll() {
		System.out.println("Retrieving all the data");
		
		 Session s= getCon.con();

		  Query t =s.createQuery("from department");
		  List<department>data=t.list();
		  for(department p:data) {
			  System.out.println(p);
		  }
		  s.close();
		
	}
	  public void getAllBySelect() {
		  System.out.println("retrieving data by select");
		  
		  Session s = getCon.con();
		  
		  Query t =s.createQuery("Select d.dname, d.loc from department d");
		  List<department> g =t.list();
		  for(department k:g) {
			  System.out.println(k);
		  }
		  s.close();
	  }
	  
	  public void getAllByWhere() {
		  System.out.println("retrieving data by select");
		  
		  Session s = getCon.con();
		  
		  Query t =s.createQuery("Select d.dname, d.loc from department d where eid>2");
		  List<department> g =t.list();
		  for(department k:g) {
			  System.out.println(k);
		  }
		  s.close();
	  }

}
