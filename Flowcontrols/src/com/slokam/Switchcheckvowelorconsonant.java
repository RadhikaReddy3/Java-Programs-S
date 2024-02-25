 
package com.slokam;
import java.util.Scanner;

public class Switchcheckvowelorconsonant {

	public static void main(String[] args) {
		
	char c;
	Scanner sc = new Scanner(System.in);//The line Scanner scanner = new Scanner(System.in);is used to create a new instance of the Scanner class in Java, which is used for reading input from various sources, including the standard input stream (System.in).Here's what each part of that line means:Scanner: This is the name of the Java class that provides methods for reading input.

//scanner: This is a variable name that you are choosing to use to refer to the Scanner object you are creating. You can choose any valid variable name you like.

//= new Scanner(System.in): This part of the line is creating a new instance of the Scanner class and initializing it with the standard input stream System.in. This means that the scanner object will be able to read input from the keyboard when you use its methods.

//So, in summary, the line Scanner scanner = new Scanner(System.in); creates a new Scanner object that can be used to read input from the keyboard, and it associates this object with the variable scanner so that you can use it in your program to read user input.
		
	System.out.println("Enter a alphabet: ");
	c=sc.next().charAt(0);
	//The line c = scanner.next().charAt(0); is used to read a character input from the user and store it in the variable c. Here's what each part of that line means:  scanner: This is the Scanner object you created earlier, which is used for reading input.next(): This method of the Scanner class is used to read the next token (word) from the input. In this case, it reads the next word entered by the user, which is expected to be a single character.next(): This method of the Scanner class is used to read the next token (word) from the input. In this case, it reads the next word entered by the user, which is expected to be a single character.next(): This method of the Scanner class is used to read the next token (word) from the input. In this case, it reads the next word entered by the user, which is expected to be a single character.
	//	.charAt(0): After reading the word, this part extracts the first character of that word (i.e., the character entered by the user). In Java, characters in a string are indexed starting from 0, so .charAt(0) gets the first character.
	//	c: This is a variable where the extracted character is stored.
	
	//So, overall, c = scanner.next().charAt(0); reads a single character input from the user and assigns it to the variable c.
		
	
	switch(c) {
	   case 'A':
	   case 'E':
	   case 'I':
	   case 'O':
	   case 'U':
	   case 'a':
	   case 'e':
	   case 'i':
	   case 'o':
	   case 'u':
		   System.out.println(c+" dis an vowel");
		   break;
		   default:
			   System.out.println(c+" is a consonant");
			   }
	// Close the scanner to release resources
    sc.close();	
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* //Static program
		char ch = 'O';
		 switch(ch)
		 {
		 case 'A': System.out.println("Vowel");
		 break;
		 case 'B': System.out.println("Consonant");
		 break;
		 case 'C': System.out.println("Consonant");
		 break;
		 case 'O': System.out.println("Vowel");
		 break;
		 default: System.out.println("Nor a Vowel or Consonant");
		 break;
		 
		 
		 }
		 System.out.println("Alphabets consists of vowels and consonants ");*/

	


