package com.slokam;

public class Clock {

	public static void main(String[] args) {
		 //for(int i=1;i<=24;i=i+1) 
		for(int i=1;i<=1;i=i+1)
		{
			 System.out.println("Hours:" +i);
			 for(int m=1;m<=60;m=m+1) 
			 {
				 System.out.println("Hours:" +i+" Minutes:" +m);
				 for(int s=1; s<=60;s=s+1) 
				 {
				      System.out.println("Hours:" +i+" Minutes:" +m+" Seconds:" +s);
				 }
			 }
		 }

	}

}


/*After "hour," "minute," and "second," the next unit of time in the standard timekeeping hierarchy is "millisecond."

The timekeeping hierarchy typically progresses as follows:

1. Century

2. Decade

3. Year

4. Month

5. Week

6. Day

7. Hour

8. Minute

9. Second

10. Millisecond

11. Microsecond

12. Nanosecond

13. Picosecond

14. Femtosecond

Each unit represents a smaller fraction of time, with millisecond being 1/1000th of a second, microsecond being 1/1,000,000th of a second, and so on.

It's worth noting that there are even smaller units of time used in specialized scientific fields, but the above list covers the commonly used units in everyday timekeeping and computing.*/
