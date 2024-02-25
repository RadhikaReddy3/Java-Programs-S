package com.relationsAADHARandMobile;

public class PTest {

	public static void main(String[] args) {
		 
		Panper p = new Panper();
		p.setPid(111);
		p.setPname("Radhika");
		p.setPad(234);
		
		Pancard c = new Pancard();
		p.setPan(c);
		c.setPid(222);
		c.setPisd("2euyer37");
		c.setPn(1234567890L);
		
		Car d = new Car();
		d.setCid(1);
		d.setCb("Kia");
		d.setCn("TS0923");
		d.setCra(15.12);
		
		Car d1 = new Car();
		d1.setCid(2);
		d1.setCb("Audi");
		d1.setCn("TS0323");
		d1.setCra(16.12);
		
		Car[]e = {d,d1};
		p.setCa(e);
		
		
		System.out.println("--PERSON DETAILS--");
		System.out.println("Person Id: "+p.getPid());
		System.out.println("Person Name: "+p.getPname());
		System.out.println("Person Address no: "+p.getPad());
		
		System.out.println("--PERSON PANCARD DETAILS--");
		Pancard f = p.getPan();
		System.out.println("Person Pan ID: "+f.getPid());
		System.out.println("Person Pan det: "+f.getPisd());
		System.out.println("Person name: "+f.getPn());
		
		System.out.println("--PERSON CARS DETAILS--");
		Car[] r = p.getCa();
		for(int i=0;i<r.length;i++) {
			System.out.println("Car no: "+r[i].getCid()+"---"+"Car Brand: "+r[i].getCb()+"---"+"Car name plate no: "+r[i].getCn()+"---"+"Car range: "+r[i].getCra());
		}

	}

}
