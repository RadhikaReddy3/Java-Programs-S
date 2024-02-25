package Stack;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		 
		Stack s = new Stack<>();
		
		//For Adding data we have three methods in Stack
		s.add("Siva");
		s.addElement(34.5);
		 
		
		System.out.println("ADD Data: "+s);
        System.out.println("Before Push: "+s);
		s.push("CSE");//Push
		System.out.println("After Push: "+s);
		System.out.println(s.firstElement());
		
		 
		
		System.out.println("Before peek: "+s);
		s.peek();
		System.out.println("After peek: "+s);
		
		
		System.out.println("Before Pop: "+s);
	    s.pop();
		System.out.println("After pop: "+s);
	}

}
