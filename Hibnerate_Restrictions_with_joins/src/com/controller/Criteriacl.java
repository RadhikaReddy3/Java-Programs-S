package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.pojo.Person;

public class Criteriacl {

	public static void main(String[] args) {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
	    Criteria c= s.createCriteria(Person.class);
	   //c.setFirstResult(3);
	   //c.setMaxResults(2);
	   //c.add(Restrictions.between("page", 23, 60));
	   //c.add(Restrictions.gt("page", 50));
	   //c.add(Restrictions.lt("page", 23));
	   //c.add(Restrictions.like("pname", "%c%"));
	   //c.addOrder(Order.asc("page"));
	   /*String dt[] = {"Lucky","AAA", "CCC"};
	   c.add(Restrictions.in("pname", dt));*/
	   
	   //c.add(Restrictions.ge("page", 50));
	   //c.add(Restrictions.le("page", 25));
	   
	   
	   List<Person> per =c.list();
	   for(Person pers: per) {
		   System.out.println(pers);
	   }
	   
	   

	}

}
