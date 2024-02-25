package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.emp;
 

public class All {

	 
public void getByAll() {
SessionFactory sf = GetSessionFactory.con();
Session s = sf.openSession();
Query q = s.createSQLQuery("CALL emppro.getempdata()").addEntity(emp.class);
List<emp> getall = q.list();

for(emp k:getall) {
	System.out.println(k);
}

 
}
public void Inpara(int eid, String ename) {
    SessionFactory sf = GetSessionFactory.con();
    Session s = sf.openSession();
    
    Query p = s.createSQLQuery("call emppro.BasedOnIdName1(:eid, :ename)")
            .addEntity(emp.class);
            p.setParameter("eid", eid);
            p.setParameter("ename", ename);

    
    List<emp> empList = p.list();
    for(emp e: empList) {
        System.out.println(e);
    }
}

  
 public static void update(int eid, String ename, double esal) {
	 SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();

		Transaction t=	s.beginTransaction();
		SQLQuery ss = s.createSQLQuery("call emppro.updatedata(:id, :name, :esal)").addEntity(emp.class);
		ss.setParameter("id", eid);
		ss.setParameter("name", ename);
		ss.setParameter("esal",  esal);
		ss.executeUpdate();
		t.commit();
		s.close();
}
 
 public void Inpara1(int eid, String ename) {
	    SessionFactory sf = GetSessionFactory.con();
	    Session s = sf.openSession();
	    
	    Query p = s.createSQLQuery("call emppro.BasedOnIdName(:eid, :ename, :esal, :ephno)");
	            p.setParameter("eid", eid);
	            p.setParameter("ename", ename);
	              

	    List<Object[]> empList = p.list();
	    for(Object[] r : empList) {
	         
	    	System.out.println(r[0]+","+r[1]+","+r[2]);
	    }
	}
  

 public void savedata() {
	 
	 SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		emp k = new emp();
		k.setEid(4);
		k.setEname("h");
		k.setEphno(2325677l);
		k.setEsal(67.5);
		s.save(k);
		t.commit();
		s.close();
		
 }
 

	public static void main(String[] args) {
          
	 All t = new All();   
	    //t.getByAll();
	 //t.Inpara2(1, "a");
	 //t.GetById(3);
	 //t.GetByName("b");
	 t.update(1, "Ram", 90.0);
	//t.savedata();	 
	}


}
