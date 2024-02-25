package Inheritance;

public class Htest {

	public static void main(String[] args) {
		 
		HC1 a = new HC1();
		boolean flag = a.submit("333", "333");
        if(flag) {
        	a.response();
        }
        else {
        	System.out.println("Invalid");
        }
        
        
		HC2 b = new HC2();
		boolean flag1 = b.submit("343", "333");
        if(flag1) {
        	b.response();
        }
        else {
        	System.out.println("Invalid");
        }
	}

}
