package com.slokam;

public class Age {

	public static void main(String[] args) {
		 byte age;
		 
		 //0-12 kids
		 //age = 12;
		 //13-18 teenage
		 age = 13;
		 //19-32 adult
		 //age = 23;
		 //33-45 young age
		 //age = 33;
		 //46-60 middle age
		 //age = 56;
		 //61-80 old age
		 //age = 63;
		 
		 if(age>=0 && age<=12) {
			 System.out.println("kid");
		 }
		 if(age>=13 && age <=18) {
			 System.out.println("teenage");
		 }
		 if(age>=19 && age<=32) {
			 System.out.println("adult");
		 }
		 if(age>=33 && age<=45) {
			 System.out.println("young age");
		 }
		 if(age>=46 && age<=60) {
			 System.out.println("middle age");
		 }
		 if(age>=61 && age<=80) {
			 System.out.println("old age");
			 }
		 }

}

/*
//Nested if 1 st apporach

package com.slokam;

public class Age {

    public static void main(String[] args) {
        byte age = 33;

        if (age >= 0 && age <= 12) {
            System.out.println("kid");
        } else if (age >= 13 && age <= 18) {
            System.out.println("teenage");
        } else if (age >= 19 && age <= 32) {
            System.out.println("adult");
        } else if (age >= 33 && age <= 45) {
            System.out.println("young age");
        } else if (age >= 46 && age <= 60) {
            System.out.println("middle age");
        } else if (age >= 61 && age <= 80) {
            System.out.println("old age");
        }
    }
}*/


/*// Nested if 2 nd Apporach
package com.slokam;

public class Age {

    public static void main(String[] args) {
        byte age = 80;

        if (age >= 0 && age <= 12) {
            System.out.println("kid");
        } else if (age <= 18) {
            System.out.println("teenage");
        } else if (age <= 32) {
            System.out.println("adult");
        } else if (age <= 45) {
            System.out.println("young age");
        } else if (age <= 60) {
            System.out.println("middle age");
        } else if (age <= 80) {
            System.out.println("old age");
        } else {
            System.out.println("Invalid age");
        }
    }
}*/


