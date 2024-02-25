package com.slokam;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class PDate {

	public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-YYYY"); // Specify the desired date format
        String formattedDate = currentDate.format(dateFormat);

        System.out.println("Current Date: " + formattedDate);
		 

	}

}


/*package com.slokam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.text.SimpleDateFormat;
import java.util.Locale;

public class PDate {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH); // Specify the desired date format
        String formattedDate = currentDate.format(dateFormat);

        System.out.println("Current Date: " + formattedDate);
    }
}*/
