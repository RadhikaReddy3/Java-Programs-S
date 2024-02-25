package com.controller;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import com.pojo.*;
public class unitperson {
	public void savedata() {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
	    Transaction t=	s.beginTransaction();
	    Person p = new Person();
	    /*p.setPname("Manju");
	    p.setPage(22);
	    p.setPqual("MCA");*/
	    
 
	    p.setPname("Manju");
	    p.setPage(24);
	    p.setPqual("BSC");
	    
	    int r =(int) s.save(p);
	    System.out.println(r);
	    //s.persist(p);
	    //s.saveOrUpdate(p);
	    //[save(), persist(), saveOrUpdate(), Update()]
	    
	    
	    t.commit();
		s.close();
		sf.close();
		
	}
	
	 public void updatedata(int pid) {
			SessionFactory sf = GetSessionFactory.con();
			Session s = sf.openSession();
			//Transaction t = s.beginTransaction();
		    Person p =(Person)s.get(Person.class, pid);
		    p.setPname("SRIRAMA");
			s.close();
			 
		    SessionFactory sf1 = GetSessionFactory.con();
			Session s1 = sf.openSession();
			Transaction t = s1.beginTransaction();
		    Person p1 =(Person)s1.get(Person.class, pid);
		    p1.setPname("SRI");
		    
		    //s1.update(p);
		    s1.merge(p);
		    
		    
		    
		    
		    t.commit();
			s1.close();
			sf1.close();
			
		}
	 public void clear() {
		 
		 SessionFactory sf = GetSessionFactory.con();
			Session s = sf.openSession();
		    Transaction t=	s.beginTransaction();
		    Person p = new Person();
		    p.setPid(5);
		    p.setPname("Manjula");
		    p.setPage(22);
		    p.setPqual("BCOM");
		     
		  
		    Session s1 = sf.openSession();
		    Transaction t1 = s1.beginTransaction();
		    Person p1 = new Person();
		    p1.setPid(1);
		    p1.setPname("lly");
		    p1.setPage(23);
		    p1.setPqual("MA");
		    
		    
		    s.update(p);
		    s1.update(p1);
		    //s1.evict(p1);
		    //s.clear();
		    t.commit();
		    t1.commit();
		    
		    
		    s.close();
		    s1.close();
		    sf.close();
		     
	 }
	 
	 public void savedata1() {
		 
		 //By save method evit(), clear(), close() are not working. But update they are working properly.
			SessionFactory sf = GetSessionFactory.con();
			Session s = sf.openSession();
		    Transaction t=	s.beginTransaction();
		    Person p = new Person();
		     
		    
		   
		    p.setPname("lilly flower");
		    p.setPage(25);
		    p.setPqual("MSC");
		    
		     
		    //s.evict(p);
		    s.save(p);
		    s.evict(p);
		    //s.clear();
		    //s.close();
		    t.commit();
		    //s.evict(p);
			 
			s.close();
			sf.close();
			
		}
		
	 
  
	public static void main(String[] args) {
		 unitperson t = new unitperson();
		 //t.savedata();
		 //t.updatedata(2);
		 //t.savedata1();
		 //t.updatedata(4);
		 t.clear();
		  

	}

}
