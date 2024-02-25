package com.pojo;

public class Three {

	public static void main(String[] args) {
		 
		String S1= new String("1,siva,33.43,se");
		String[] s2=S1.split(",");
		//String[] s2=S1.split("i");
		/*System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2[3]);*/
		
		
		for(int i=0;i<s2.length;i++) {
			System.out.println(s2[i]);
			
		}

	}

}
