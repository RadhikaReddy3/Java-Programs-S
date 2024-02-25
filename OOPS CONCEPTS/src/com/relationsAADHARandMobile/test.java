package com.relationsAADHARandMobile;

public class test {

	public static void main(String[] args) {
		 
		Person p = new Person();
		//properties pid int pname string page int det-Object
		//mob array of mob Objects
		//using the setter method
		
		p.setPid(101);
		p.setPname("Radhika");
		p.setPage(21);
		
		Adharcard a = new Adharcard();
		a.setAid(1);
		a.setAnum("AFVYJSWGF13T7824");
		a.setAad("hyd");
		
		p.setDet(a);//Aadhar details
		
		
		Mobile n =new Mobile();
		n.setMid(11);
		
		n.setMsim("jio");
		n.setMnum(9321654987L);
		
		Mobile n1 =new Mobile();
		n1.setMid(12);
		n1.setMsim("Airtel");
		n1.setMnum(9321656487L);
		
		Mobile[]b = {n,n1};
		p.setMob(b);//mob details
		
		System.out.println(p.getPid());
		System.out.println(p.getPname());
		System.out.println(p.getPage());
		System.out.println("---AADHAR CARD DETAILS---");
		Adharcard ad = p.getDet();
		System.out.println(ad.getAid());
		System.out.println(ad.getAnum());
		System.out.println(ad.getAad());
		System.out.println("---MOBILE DATA----");
		
		Mobile[] m =p.getMob();
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i].getMid()+"---"+m[i].getMsim()+"---"+m[i].getMnum());
			System.out.println("------"); 
		}
		
		 System.out.println("Completed");
		

	}

}
