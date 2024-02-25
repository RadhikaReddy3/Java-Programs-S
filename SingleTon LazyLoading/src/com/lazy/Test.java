package com.lazy;

public class Test {

	public static void main(String[] args) {
		 
		STonLazyLoad s1 =STonLazyLoad.getsingletonObj();
		STonLazyLoad s2 =STonLazyLoad.getsingletonObj();
		STonLazyLoad s3 =STonLazyLoad.getsingletonObj();
		STonLazyLoad s4 =STonLazyLoad.getsingletonObj();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
