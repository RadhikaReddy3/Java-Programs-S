package com.slokam;

public class SwitchStatementisfallthrough {

	public static void main(String[] args) {
		//The Java switch statement is fall-through. It means it executes all statements after the first match if a break statement is not present.
        //Java Switch Example where we are omitting the break statement 
		int num = 300;
		switch(num) {
		case 100:
			System.out.println("100");
		case 200:
			System.out.println("200");
		case 300:
			System.out.println("300");
		case 400:
			System.out.println("400");
		default:
			System.out.println("not in 100,200,300&400");
		}
	}

}
