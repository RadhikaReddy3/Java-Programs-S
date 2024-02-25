package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.pojo.AadharCard;
public class AadharTest {
	public static void savemethod() {
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		AadharCard p = new AadharCard();
		p.setAname("lucky");
		p.setAnum("75342465");
		p.setAaddress("knr");
		s.save(p);
		t.commit();
		s.close();
	}
	
	public void updatedata(int aid)
	{
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		AadharCard p =(AadharCard)s.get(AadharCard.class, aid);
	    p.setAname("Radhika");
	    p.setAnum("32154245123");
	    p.setAaddress("KNR");
	    s.update(p);
	    t.commit();
		s.close();		
}
	 
	public static void main(String[] args) {
		AadharTest m = new AadharTest();
		//m.savemethod();
		m.updatedata(1);

	}

}
