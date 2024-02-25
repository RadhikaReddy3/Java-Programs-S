package com.slokam;

public class WrapperInSwitchCaseExample {

	public static void main(String[] args) {
		//Java allows us to use four wrapper classes: Byte, Short, Integer and Long in switch statement.
		Integer age = 21;
		switch(age)
		{
		case(16):
			System.out.println("you are under 18");
		    break;
		case(21):
			System.out.println("you eligible for vote");
		    break;
		case(35):
			System.out.println("Adult");
		    break;
		default:
			System.out.println("Please give valid age");
		    break;
			
		}
		}

	}


