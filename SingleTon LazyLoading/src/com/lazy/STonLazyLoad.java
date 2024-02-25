package com.lazy;

//It is an Example for method should be retrived if and only if it is called
public class STonLazyLoad {
	
	private static STonLazyLoad sl = null;
	
	private STonLazyLoad() {
		
	}
	
	public static STonLazyLoad getsingletonObj() {
		
		if(sl==null) {
			
			System.out.println("I am inside if");
			sl = new STonLazyLoad();
			return sl;
		}
		else return sl;
		
	}

}
