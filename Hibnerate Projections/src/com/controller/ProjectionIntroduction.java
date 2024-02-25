package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.pojo.Person;

public class ProjectionIntroduction {
//This gives person ,passport,mobile,course data only
	public static void main1(String[] args) {
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
	    Criteria c =s.createCriteria(Person.class, "p");
	    c.createAlias("p.ppt", "pt");
	    c.createAlias("p.mob", "m");
	   c.createAlias("p.cou", "c");
	    
	     
	    List<Person> data = c.list();
	    for(Person n: data) {
	    	System.out.println(n);
	    }
 }
	    public static void main(String[] args) {
			SessionFactory sf = GetSessionFactory.con();
			Session s =sf.openSession();
		    Criteria c =s.createCriteria(Person.class, "p");
		    c.createAlias("p.ppt", "pt");
		    c.createAlias("p.mob", "m");
		   c.createAlias("p.cou", "c");
		   
		   //Now I want to keep restrictions on data which have all passport, mobile, courses
		   
		   ProjectionList pl =Projections.projectionList();
		   pl.add(Projections.property("p.pname"));
		   pl.add(Projections.property("pt.pnum"));
		   pl.add(Projections.property("m.msim"));
		   pl.add(Projections.property("c.cfee"));
		   pl.add(Projections.property("c.cname"));
		   
		   c.setProjection(pl);
		   c.add(Restrictions.gt("c.cfee",30.0));
		     
		    List<Object[]> data = c.list();
		    for(Object[] n: data) {
		    	System.out.println(n[0]+"---"+n[1]+"-----"+n[2]+"---"+n[3]+"----"+n[4]);
		    }
		    

	}

}
