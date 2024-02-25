package com.cisco;

public class Test {

	public static void main(String[] args) {
		 
	             STonEagerLoad s1=STonEagerLoad.getsingletonobject();
	             STonEagerLoad s2=STonEagerLoad.getsingletonobject();
	             STonEagerLoad s3=STonEagerLoad.getsingletonobject();
	             
	             System.out.println(s1);
	             System.out.println(s2);
	             System.out.println(s3);

	}

}
