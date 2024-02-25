package microsoft;

public class Calculatordynamic {
	int a; //instance variable
	int b; //instance variable
	int c;//instance variable
	 //instance method comes in to picture after creation of object
	void add()
	{
		
		 System.out.println("value of a: "+a);
		 System.out.println("value of b: "+b);
		 System.out.println("Addition of a&b: "+(a+b));
		 
	}
	
	void sub()
	{
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		System.out.println("Subtraction of a&b: "+(a-b));
	}
	
	void mul()
	{
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		System.out.println("Multiplication of a&b: "+(a*b));
		
	}
	
	void div()
	{
		System.out.println("value of a: "+a);
		System.out.println("value of c: "+c);
		System.out.println("Division of a&c"+(a/c));
		
	}
	
	
	void mdiv()
	{
		System.out.println("value of a:"+a);
		System.out.println("value of c:"+c);
		System.out.println("Mod division of a&c : "+(a%c));
		
	}
	
	public static void main(String[] args) {//main method is called by JVM no return
		Calculatordynamic ca = new Calculatordynamic();
		 ca.add();
		 ca.a=2;
		 ca.b=9;
		 ca.add();
		 ca.a=67;
		 ca.b=12;
		 ca.sub();
		 ca.a=63;
		 ca.b=15;
		 ca.mul();
		 ca.a=69;
		 ca.c=14;
		 ca.div();
		 ca.a=63;
		 ca.c=13;
		 ca.mdiv();
            

	}

}

/*In the provided code, the variables `a`, `b`, and `c` are not class variables (static variables); they are instance variables. Class variables are declared with the `static` keyword and are associated with the class itself, shared among all instances of the class. In contrast, instance variables are specific to individual instances of the class.

In your code:

```java
public class Calculatordynamic {
    int a; // instance variable
    int b; // instance variable
    int c; // instance variable

    // ... rest of your code ...
}
```

Here, `a`, `b`, and `c` are instance variables because they are declared within the class but outside of any method and are specific to each instance of the `Calculatordynamic` class. Each object of the class will have its own set of these instance variables.

To declare class variables, you would use the `static` keyword, like this:

```java
public class Calculatordynamic {
    static int classVariableA; // This is a class variable
    static int classVariableB; // This is another class variable

    // ... rest of your code ...
}
```

Now, `classVariableA` and `classVariableB` would be class variables shared among all instances of the `Calculatordynamic` class.*/









/* In the provided program, there are no class variables (static variables) defined. All the variables declared in the `Calculatordynamic` class are instance variables. Class variables are declared using the `static` keyword and are associated with the class itself, shared among all instances of the class. In your code, only instance variables are present, as shown below:

```java
public class Calculatordynamic {
    int a; // instance variable
    int b; // instance variable
    int c; // instance variable

    // ... rest of your code ...
}
```

To define class variables, you would declare them with the `static` keyword, like this:

```java
public class Calculatordynamic {
    static int classVariableA; // This is a class variable
    static int classVariableB; // This is another class variable

    // ... rest of your code ...
}
```

In this code, `classVariableA` and `classVariableB` would be class variables shared among all instances of the `Calculatordynamic` class.*/