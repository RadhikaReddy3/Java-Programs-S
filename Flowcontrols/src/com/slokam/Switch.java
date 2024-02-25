//Switch Board Program
package com.slokam;

public class Switch {

	public static void main(String[] args) {
		 String option = "Fann";
		 
	switch(option) {
	                case "Fan" :System.out.println("Fan on");
	                break;
	                case "light":System.out.println("Light on");
	                break;
	                case "TV":System.out.println("TV on");
	                break;
	                case "AC":System.out.println("AC on");
	                break;
	                default: System.out.println("Invalid");
	}
	 
  

	}

}












// Using else nested if else  


/*package com.slokam;

public class Switch {

    public static void main(String[] args) {
        String option = "Fann"; // Typo: Should be "Fan" instead of "Fann"

        if ("Fan".equals(option)) 
        {
            System.out.println("Fan on");
        } 
        else 
        {
            if ("light".equals(option)) 
            {
                System.out.println("Light on");
            } 
            else 
            {
                if ("TV".equals(option)) 
                {
                    System.out.println("TV on");
                } 
                else 
                {
                    if ("AC".equals(option)) 
                    {
                        System.out.println("AC on");
                    } 
                    else 
                    {
                        System.out.println("Invalid");
                    }
                }
            }
        }
    }
}
/*   thecode you provided is an example of "else nested if-else" statements, also known as "else-if ladder" statements. In this structure, a series of if conditions are nested within else blocks, and each if condition is checked if the previous ones fail. The program executes the first block of code where the condition is true and then exits the entire structure.

Here's the correct breakdown:

The outermost if statement checks "Fan".equals(option).
If that condition is not met, it enters the else block, where another if statement checks "light".equals(option).
If that condition is not met, it enters another else block, where another if statement checks "TV".equals(option).
If that condition is not met, it enters yet another else block, where the final if statement checks "AC".equals(option).
So, it's a series of if-else statements where each if condition is checked after the previous ones have failed. This structure is commonly referred to as "else-if ladder" or "else nested if-else."*/



/*In this code, I've used nested if statements to mimic the behavior of the original switch statement. Each if statement checks the value of option, and if it doesn't match, it proceeds to the next nested if. If none of the conditions match, it eventually reaches the else block and prints "Invalid."

Please note that this approach can make the code less readable and harder to maintain, especially if you have a larger number of options. Using a switch statement or a Map as previously shown would generally be a more efficient and maintainable approach in such cases.*/

//Using if else if
/*package com.slokam;

public class Switch {

    public static void main(String[] args) {
        String option = "Fann"; // Typo: Should be "Fan" instead of "Fann"

        if ("Fan".equals(option)) {
            System.out.println("Fan on");
        } else if ("light".equals(option)) {
            System.out.println("Light on");
        } else if ("TV".equals(option)) {
            System.out.println("TV on");
        } else if ("AC".equals(option)) {
            System.out.println("AC on");
        } else {
            System.out.println("Invalid");
        }
    }
}*/

