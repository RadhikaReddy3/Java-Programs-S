package microsoft;

public class Calculator {
	int a = 123;//instance variables
	int h;//instance variable
    int b;
    int c;
	//instance method - if we call it need execute its functionality
	//return type,method name
	//Add parameters to dynamic
	void add()
	{
		
		//body
		
		int a =12;//local variables
		int b = 13;
		int c = a+b;
		System.out.println("Add---"+c);
	}
	
	void sub()
	{
		int a = 95;//local variables
		int b = 29;
		int c = a-b;
		System.out.println("sub---"+c);
		
	}
	
	void mul()
	{
		int a = 95;//local variables
		int b = 29;
		int c = a*b;
		System.out.println("mul---"+c);
		
	}
	
	void div()
	{
		int a = 155;//local variables
		int b = 29;
	    double c = a/b;
		System.out.println("div---"+c);
		
	}
	
	
	void mdiv()
	{
		int a = 155;//local variables
		int b = 29;
		int c = a%b;
		System.out.println("mdiv---"+c);
		
	}
	//What is 67% 0f 1200
	void per()
	{
		double a = 1200.0;//local variables
		double b = 67.0;
		double per = (b/100.0)*a;//1200*0.67
		
		System.out.println("per---"+per);
		
	}
	
	void perc() {
		double a = 33.0;
		double b = 44.0;
		double c = 55.0;
		double d = 66.0;
		double e = a + b + c + d;
		double f = 12.0;
		double per = (f / 100.0) * e;
		System.out.println("perc---"+per);
		
				
				
	
	}
//dont write methods inside main method
	public static void main(String[] args) {
		 Calculator c = new Calculator();
		 System.out.println(c.a);
		 c.add();
		 c.sub();
		 c.mul();
		 c.div();
		 c.mdiv();
		 c.per();
         c.perc();    
	}

}
/* The actual formula to calculate a percentage of a number is:
   
    Percentage=( Whole/Part)×100%

In this formula:

- "Percentage" is the result you want to find.
- "Part" is the portion of the whole that you are interested in.
- "Whole" is the total amount.

In the context of your question, to find 67% of 1200:

- "Percentage" is 67% (0.67 as a decimal).
- "Part" is what you want to calculate.
- "Whole" is 1200.

So, using the formula:

 Part = (Percentage/100)*whole

You can calculate the part, which is 67% of 1200.*/