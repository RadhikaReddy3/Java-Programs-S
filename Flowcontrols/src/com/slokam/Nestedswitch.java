package com.slokam;

public class Nestedswitch {

	public static void main(String[] args) {
		 //C - CSE, E - ECE, M - Mechanical  
        char branch = 'C';                 
        int collegeYear = 4;  
        switch( collegeYear )  
        {  
            case 1:  
                System.out.println("English, Maths, Science");  
                break;  
            case 2:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Operating System, Java, Data Structure");  
                        break;  
                    case 'E':  
                        System.out.println("Micro processors, Logic switching theory");  
                        break;  
                    case 'M':  
                        System.out.println("Drawing, Manufacturing Machines");  
                        break;  
                }  
                break;  
            case 3:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Computer Organization, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
                        break;  
                    case 'M':  
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                        break;  
                }  
                break;  
            case 4:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Data Communication and Networks, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Embedded System, Image Processing");  
                        break;  
                    case 'M':  
                        System.out.println("Production Technology, Thermal Engineering");  
                        break;  
                }  
                break;  
        }  
      System.out.println("Your subject is mentioned");
	}

}

/*This Java program is a nested switch statement example that prints out a course list based on the college year and branch (CSE, ECE, or Mechanical). Here's an explanation of the program:

char branch = 'C';: This line declares a character variable branch and initializes it with the value 'C', which represents the branch of study (CSE - Computer Science and Engineering in this case).

int collegeYear = 4;: This line declares an integer variable collegeYear and initializes it with the value 4, which represents the current college year.

The program uses a switch statement to determine which courses to print based on the collegeYear.

If collegeYear is 1, it prints the courses for the first year.
If collegeYear is 2, 3, or 4, it enters nested switch statements to further check the branch.
Inside the nested switch statements, the program checks the value of branch to determine which courses to print for the respective year and branch of study.

The break statements are used to exit the switch statements after the correct case is executed.

Here's a breakdown of the course outputs based on the values of collegeYear and branch:


If collegeYear is 1, it prints "English, Maths, Science."


If collegeYear is 2, it enters the second switch and prints courses based on the branch.
For branch 'C', it prints "Operating System, Java, Data Structure."
For branch 'E', it prints "Micro processors, Logic switching theory."
For branch 'M', it prints "Drawing, Manufacturing Machines."


If collegeYear is 3, it enters the third switch and prints courses based on the branch.
For branch 'C', it prints "Computer Organization, MultiMedia."
For branch 'E', it prints "Fundamentals of Logic Design, Microelectronics."
For branch 'M', it prints "Internal Combustion Engines, Mechanical Vibration."


If collegeYear is 4, it enters the fourth switch and prints courses based on the branch.
For branch 'C', it prints "Data Communication and Networks, MultiMedia."
For branch 'E', it prints "Embedded System, Image Processing."
For branch 'M', it prints "Production Technology, Thermal Engineering."
The program demonstrates how nested switch statements can be used to make decisions based on multiple conditions (college year and branch of study) and print corresponding outputs.*/





