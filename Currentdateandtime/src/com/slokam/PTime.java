package com.slokam;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PTime {

	public static void main(String[] args) {
		
		LocalTime currentTime = LocalTime.now();
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a"); // Specify the desired time format
        String formattedTime = currentTime.format(timeFormat);

        System.out.println("Current Time: " + formattedTime);
		 

	}

}



/* The differences between the time patterns `"HH:mm:ss"`, `"hh:MM:ss"`, and `"hh:mm:SS"` are as follows:

1. `"HH:mm:ss"`:
   - `HH`: Represents the hour in a 24-hour format (00-23).
   - `mm`: Represents the minute (00-59).
   - `ss`: Represents the second (00-59).

   Example: 14:30:45 (2:30:45 PM in a 24-hour clock).

2. `"hh:MM:ss"`:
   - `hh`: Represents the hour in a 12-hour format with AM/PM (01-12).
   - `MM`: Represents the month (01-12).
   - `ss`: Represents the second (00-59).

   This pattern is a mix of time and month, and it's unusual for representing time.

   Example: 02:10:15 (2:10:15 AM) where 02 is interpreted as 2 AM, and 10 is interpreted as the month of October.

3. `"hh:mm:SS"`:
   - `hh`: Represents the hour in a 12-hour format with AM/PM (01-12).
   - `mm`: Represents the minute (00-59).
   - `SS`: Represents milliseconds (00-99).

   This pattern represents time with milliseconds.

   Example: 03:45:25 (3:45:25 AM) with 25 milliseconds.

To summarize, `"HH:mm:ss"` represents time in 24-hour format, `"hh:MM:ss"` combines time and month (which is unusual), and `"hh:mm:SS"` represents time with milliseconds. Make sure to use the appropriate pattern based on what you want to display or parse.*/
 