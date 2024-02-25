package com.slokam;

public class Switchtest {

	public static void main(String[] args) {
		String h="Maths";
		
		
		switch(h)//Switch -case should be string- case cannot be repeated with same variable name
		{
		
		case "Science":System.out.println("Science");
		break;
		case "English":System.out.println("English");
		break;
		case "Maths":System.out.println("Maths");
		break;
		default:System.out.println("No match");
		}
      System.out.println("I am efficient in above subject");
	}

}
