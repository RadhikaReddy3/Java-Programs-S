
/*public class DoAndWhileDifference {
	 
	public static void main(String[] args) {
		//Using for and while for same situation
		//printing the numbers from 1 to 5 using both a for loop and a while loop in Java:
		
		/*for (int i = 1; i <= 5; i++) 
		 * {
		    System.out.println(i);
		   }*/
		
		/*int count = 1;
		while (count <= 5) 
		{
		    System.out.println(count);
		    count++;
		}*/
		
		//Differences between for and while
		
		/*for (int i = 1; i <= 10; i++) {
		    System.out.println(i);
		}
		
	}

}*/
		
		import java.util.Scanner;

		public class  DoAndWhileDifference {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the user
		        String name = "";  // Initialize a String variable "name" and set it to an empty string

		        // Start a while loop that continues as long as the condition "!name.equals("John")" is true.
		        while (!name.equals("John")) {
		            System.out.print("Please enter your name: ");  // Prompt the user for input
		            name = scanner.nextLine();  // Read the user's input and store it in the "name" variable

		            // The loop checks if the user's input is not equal to "John" (using "!name.equals("John")").
		            // If the input is not "John," the loop continues, and it keeps prompting the user for their name.
		        }

		        // Once the user enters "John" (the condition becomes false), the loop exits, and the following line is executed:
		        System.out.println("Hello, John!");  // Print a greeting message.
		    scanner.close();
		    }
		}

