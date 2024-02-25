package StaticandInstance;

public class Updatevalue {
	
	public int h = 23;
	static public int a =13;
	

	public static void main(String[] args) {
		Updatevalue v = new Updatevalue();
		System.out.println("Instance variable: "+v.h);
		System.out.println("Instance variable: "+v);
		v.h=25;//If instance variable changed in one object it cannot be changed in another object 
		System.out.println("Updated Instance variable: "+v.h);
		System.out.println("Static variable: "+a);
		//System.out.println("Static variable called by object: "+v.a);
		a=14;//If static variable changed in one object it will be changed in all objects
		System.out.println(a);
		//System.out.println("Updated Static variable called by object: "+v.a);
		
		Updatevalue v1 = new Updatevalue();
		System.out.println(v1.h);
		v1.h=27;
		System.out.println(v1.h);
		//System.out.println(v1.a);
		 

	}

}
