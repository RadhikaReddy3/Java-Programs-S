
/*--------Aggregation Functions Using the Queries(Query) and without using Queries(Criteria)-------*/
package com.controller;

import java.util.List;

import org.apache.poi.sl.usermodel.PlaceableShape;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.security.access.method.P;

import com.pojo.Person;

public class ProjectionAggregationFunctions {
	
	
	
	public static void AggusingQueriesOnlycount() {
		//This method is by using Queries
		
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
	    Query p = s.createQuery("select count(*)from Person ");
	    List<Object[]> data = p.list();
	    System.out.println(data);
		
	}
	
	public static void AggusingQueriesAll() {
		//This method is by using Queries
		
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
	    Query p = s.createQuery("select count(*), max(page),min(page), sum(page), avg(page) from Person p group by page having page>=40 order by page desc ");
	    List<Object[]> data = p.list();
	     
	    for(Object[] n: data) {
	    	System.out.println("Count: "+n[0]+"\n"+"Maximum Age: "+n[1]+"\n"+"Minimum Age: "+n[2]+"\n"+"Sum of All ages: "+n[3]+"\n"+"Avg of all ages: "+n[4]);
	    }
	    
		
	}
	
	public static void AggUsingCriteria() {
		//This method is without using Queries. we will use Criteria.
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
	    Criteria c =s.createCriteria(Person.class, "p");
	    
	   
	   //Now I want to keep restrictions on data which have all passport, mobile, courses
	   
	   ProjectionList pl =Projections.projectionList();
	    
	   //pl.add(Projections.countDistinct("page"));
	   pl.add(Projections.max("page"));
	   pl.add(Projections.min("page"));
	   pl.add(Projections.avg("page"));
	   pl.add(Projections.sum("page"));
	   pl.add(Projections.count("page"));
	   pl.add(Projections.groupProperty("page"));
	    
	   
	   c.setProjection(pl);
	   c.addOrder(Order.desc("page"));
	   c.add(Restrictions.gt("page",30));
	     
	    List<Object[]> data = c.list();
	    //System.out.println(data);
	   for(Object[] n: data) {
	    	System.out.println(n[0]+"---"+n[1]+"-----"+n[2]+"---"+n[3]+"----"+n[4]+"---"+n[5]);
	    }
	    
	}
 
	    public static void main(String[] args) {
	    	ProjectionAggregationFunctions k = new ProjectionAggregationFunctions();
	    	 //k.AggusingQueriesOnlycount();
             //k.AggusingQueriesAll();
	    	k.AggUsingCriteria();
	}

}
