package microsoft;

public class test {//return types can be byte, short, int,long,float,double, boolean,char,String
	/*void add (int a, int b) {
		
		int c= a+b;
		 System.out.println(c);
	}*/
	
    int add(int a, int b) {
		
		int c= a+b;
	    return c;
	}
	
	
	

	public static void main(String[] args) {
		test t = new test();
		//t.add(12, 23);
	    int value =	t.add(12, 23);
		System.out.println(value);
	}

}
