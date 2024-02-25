package control;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.*;

public class OneToOne {
	
	public void savedata() {
		
		Session d = getCon.con();
		Transaction t = d.beginTransaction();
		
		person p = new person();
		p.setPid(1);
		p.setPname("siva");
		p.setPage(55);
		p.setPqual("MA");
		
		passport q = new passport();
		q.setPtid(1);
		q.setPnum("AB123C");
		q.setPexp("2043");
		
		p.setPpt(q);
		d.save(p);
		t.commit();
		 
		d.close();
	}

	public static void main(String[] args) {
		 OneToOne m = new OneToOne();
		 m.savedata();

	}

}
