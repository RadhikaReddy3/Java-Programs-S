package com.cisco;

public class Stest {

	public static void main(String[] args) {
		 
		Student s = new Student();
		s.setSid(1);
		s.setSname("Radhika");
		s.setSmarks(76.70);
		
		Course v = new Course();
		v.setCid(101);
		v.setCname("Java");
		v.setCduration(34);
		
		Course v1 = new Course();
		v1.setCid(102);
		v1.setCname("Mysql");
		v1.setCduration(43);

		
		Course[] data = {v,v1};
		s.setCou(data);

		
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		System.out.println(s.getSmarks());
		Course[] b = s.getCou();
		
		//System.out.println(s.getCou());
	    for(int i=0;i<=b.length-1;i=i+1) {
	    	
	    
		System.out.print(b[i].getCid()+" ");
		System.out.print(b[i].getCname()+" ");
		System.out.println(b[i].getCduration());
		
	}

}
}
