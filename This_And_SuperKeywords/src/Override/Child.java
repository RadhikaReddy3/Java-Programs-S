package Override;

public class Child extends Parent {

	int j=12;
	
	public void m1() {
		System.out.println(" Child m1: "+this.j);
		 super.m1();
		
		
	}
	public void m2() {
		System.out.println("Child m2: "+super.j);
		this.m1(); //Donot call this.m2
	}
	
	public static void m3() {
		System.out.println("child m3");
	}
	
	public static void main(String[] args) {
		 
          Child c = new Child();
          c.m1();
          c.m2();
          m3();
          //System.out.println(this.j);
          //this.m1();
          
	}

}


/*In the provided code, you're trying to use `this.j` and `this.m1()` within the `main` method, which is declared as a static method. The keyword `this` is used to refer to the current instance of an object. However, in a static method like `main`, there is no specific instance associated with the method, as static methods belong to the class itself, not to instances of the class. Therefore, you cannot use `this` to access instance-specific members (non-static members) or instance methods within a static method.

To access the non-static members or instance methods of the `Child` class from within the `main` method, you need to create an instance of the `Child` class and use that instance to access the members and methods. Here's the corrected code:

```java
package Override;

public class Child extends Parent {

    int j = 12;

    public void m1() {
        System.out.println("Child m1: " + this.j);
        super.m1();
    }

    public void m2() {
        System.out.println("Child m2: " + super.j);
        this.m1(); // Call m1, not m2
    }

    public static void main(String[] args) {
        Child c = new Child(); // Create an instance of Child
        System.out.println(c.j); // Access 'j' using the instance 'c'
        c.m1(); // Call m1 from the instance 'c'
    }
}
```

In this code, we create an instance `c` of the `Child` class and then access `j` and call `m1` using this instance. This is the correct way to access instance-specific members and methods within a static method like `main`.*/