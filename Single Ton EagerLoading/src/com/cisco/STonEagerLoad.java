package com.cisco;

//It is Example for Hibnerate SessionFactory--heavy Object
public class STonEagerLoad {
	
	private static STonEagerLoad st = new STonEagerLoad();
	
	private STonEagerLoad() {
		
	}
	
	public static STonEagerLoad getsingletonobject() {
		return st;
	}

}
