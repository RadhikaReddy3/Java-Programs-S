package Class8_04_12_2023;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 String str1="car";
		 String str2="acr";
		 
		 //Step:1-Find length
		 
		 if(str1.length()== str2.length()) {
			 
			//Step:2-Convert each String in to character array
			 char Str1Arr[] = str1.toLowerCase().toCharArray();
			 char Str2Arr[] = str2.toLowerCase().toCharArray();
			 
			 //Step:3-Sort each char array
			 Arrays.sort(Str1Arr);
			 Arrays.sort(Str2Arr);
			 
			 //Step:4-compare both character Arrays
			 if(Arrays.equals(Str1Arr, Str2Arr)) {
				 System.out.println("They are Anagram");
			 }
			 else {
				 System.out.println("They are not Anagram");
			 }
		 }
		 else {
			 System.out.println("They are not Anagram by length");
			 	 
		 }

	}

}
