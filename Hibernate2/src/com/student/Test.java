package com.student;

public class Test {

	public static void main(String[] args) {
		 
		student s = new student ();
		
		s.setSid(1);
		s.setSname("Ram");
		s.setSmarks(56.9);
		s.setSloc("HYD");
		
		stuDao g = new stuDao();
		g.savedata(s);
		
		//System.out.println(g);

	}

}
