package com.slokam;

public class Housetest {

	public static void main(String[] args) {
		House h = new House();//create object/instance
		
		h.colour ="red";//These are object properties
		h.doors =4;
		h.windows=2;
		h.gate=1;
		
		System.out.println("colour of house: "+h.colour);
		System.out.println("No of doors of house: "+h.doors); 
		System.out.println("No of windows of house: "+h.windows);
		System.out.println("No of gates of house: "+h.gate);
		System.out.println("Address of house: "+h);
		
		System.out.println("--------------------------------Next");
		
		House h1 = new House();
		h1.colour ="blue";
		h1.doors =5;
		h1.windows=3;
		h1.gate=1;
		
		System.out.println("colour of house: "+h1.colour);
		System.out.println("No of doors of house: "+h1.doors);
		System.out.println("No of windows of house: "+h1.windows);
		System.out.println("No of gates of house: "+h1.gate);
		System.out.println("Address of house: "+h1);
		

	}

}
