package com.RelationslikeAADHARandMOBILE;

public class Stest {

	public static void main(String[] args) {
		
		Address a = new Address(1,"hyd","knr");
		Address v = new Address(1,"scd","wrgl");
		Address h[]= {a,v};
		
		Student s =new Student (1, "Radhika",56.66, new pancard(134,"jdwi3r3343","Lucky"),h);

		System.out.println(s.getSid()+"---"+s.getSname()+"---"+s.getSmarks()+"---"+s.getPa().getPid()+"---"+s.getPa().getPnum()+"---"+s.getPa().getPname());
	    
		Address[] b = s.getAd();
		for(int i=0;i<b.length;i++) {
			System.out.println("Address ID: "+b[i].getAid()+"\n"+"Address Ploc: "+b[i].getPloc()+"\n"+"Address Nloc: "+b[i].getNloc()+"\n");
		}
	
	}

}
