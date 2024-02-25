package microsoft;

public class CalculatorParameters {
	   void add(int a, int b) 
	   {
		System.out.println(a+b);
	   }
	   
	   void add(int a, int b, int c) 
	   {
		System.out.println(a+b);
	   }
	   
	   void sub(int a, int b)
	   {
		   System.out.println(a-b);
		   System.out.println(a*b);
	   }
	   
	   void mul(int a, int b)
	   {
		   System.out.println(a*b);
	   }
	   
	   void div(int a, int b)
	   {
		   System.out.println(a/b);
	   }
	   
	   void mdiv(int a, int b)
	   {
		   System.out.println(a%b);
	   }
		

	public static void main(String[] args) {
		 
		 CalculatorParameters c = new CalculatorParameters();
		 
		 c.add(23,33);
		 c.add(2,3,4);
		 c.mul(4, 3);
		 c.sub(4,3);
		 c.div(10, 5);
		 c.mdiv(10, 5);
		}

	

}

/*   In the `CalculatorParameters` class you provided, `a` and `b` are method parameters, not local or instance variables.

Method parameters are variables that are declared in the method signature and serve as placeholders for values that are passed into the method when it is called. They are scoped to the method and exist only within the method's block. In your case, `a` and `b` are parameters for the various methods like `add`, `sub`, `mul`, `div`, and `mdiv`. They are local to those methods and cannot be accessed outside of them.

Local variables, on the other hand, are variables declared within a method or block and have a limited scope within that method or block. They are not method parameters, nor are they instance variables that belong to an object of the class. In your code, there are no local variables declared within methods because the methods use the parameters `a` and `b` directly for their calculations.

Instance variables, which belong to an instance of the class, are declared at the class level but outside of any method or block. In your code, there are no instance variables declared in the `CalculatorParameters` class.*/


/*   In the `CalculatorParameters` class you provided, the variables `a` and `b` are actually method parameters. Method parameters are also sometimes referred to as function parameters or formal parameters. They are variables that are declared in the method's parameter list and serve as placeholders to accept values when the method is called. These parameters are local to the method and can only be used within that method.

In summary:

- `a` and `b` are method parameters in your code.
- Method parameters are also called function parameters or formal parameters.
- They are local to the methods where they are declared and can only be used within those methods.
- They allow you to pass values into a method when you call it, enabling the method to work with different data each time it's invoked.*/