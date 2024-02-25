package com.cisco;

 
public class LetterCount {
    public static void main(String[] args) {
        String inputString = "Slokam";
        int[] letterCount = new int[26]; // Assuming we are only counting letters A-Z (case-insensitive)

        // Convert the input string to uppercase to make the counting case-insensitive
        inputString = inputString.toUpperCase();

        // Loop through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ch - 'A'; // Calculate the index for the letter A-Z
                letterCount[index]++;
            }
        }

        // Display the letter counts
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            int index = letter - 'A';
            int count = letterCount[index];
            if (count > 0) {
                System.out.println(letter + ": " + count);
            }
        }
    }
}





/*public class LetterCount {
    public static void main(String[] args) {
        String inputString = "Slokam";
        int[] letterCount = new int[26]; // Assuming we are only counting letters A-Z (case-insensitive)

        // Convert the input string to uppercase to make the counting case-insensitive
        inputString = inputString.toUpperCase();

        // Loop through each character in the modified inputString using an enhanced for loop
        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = ch - 'A'; // Calculate the index for the letter A-Z
                letterCount[index]++;
            }
        }

        // Display the letter counts
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            int index = letter - 'A';
            int count = letterCount[index];
            if (count > 0) {
                System.out.println(letter + ": " + count);
            }
        }
    }
}
*/

