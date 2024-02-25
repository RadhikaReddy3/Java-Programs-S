package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.pojo.Person;

public class Projectionwith_AND_OR {
 
	    public static void main(String[] args) {
			SessionFactory sf = GetSessionFactory.con();
			Session s =sf.openSession();
		    Criteria c =s.createCriteria(Person.class, "p");
		    c.createAlias("p.ppt", "pt");
		    c.createAlias("p.mob", "m");
		    c.createAlias("p.cou", "c");
		   
		  
		   ProjectionList pl =Projections.projectionList();
		   pl.add(Projections.property("p.pname"));
		   pl.add(Projections.property("pt.pnum"));
		   pl.add(Projections.property("m.msim"));
		   pl.add(Projections.property("c.cfee"));
		   pl.add(Projections.property("c.cname"));
		   
		   c.setProjection(pl);
		   
		    //c.add(Restrictions.gt("c.cfee",30.0));
		   //c.add(Restrictions.gt("m.msim","jio"));
		   
		 //Now I am going to perform  and & or, 
		   Criterion cfee = Restrictions.gt("c.cfee", 30.0);
		   Criterion msim = Restrictions.ilike("m.msim","jio");

		  // ,by using Logical Expression
		   LogicalExpression andExp = Restrictions.and(cfee, msim);
		   c.add(andExp );
		  // LogicalExpression orExp = Restrictions.or(cfee, msim);
		  //c.add(orExp);
		   
		    
		     
		    List<Object[]> data = c.list();
		    for(Object[] n: data) {
		    	System.out.println(n[0]+"---"+n[1]+"-----"+n[2]+"---"+n[3]+"----"+n[4]);
		    }
		    

	}

}
