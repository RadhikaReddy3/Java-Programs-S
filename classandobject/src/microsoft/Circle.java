package microsoft;

public class Circle {
	
	void circlearea() {
		double pi = 3.14;
		double r = 5.5;
		double area = pi*(r*r);
		System.out.println(area);
		
	}
	
	void circlearea1(double pi, double r) 
	{
		double area = pi*(r*r);
		System.out.println(area);
		
	}
	
	 double circlearea2() {
		 
		    double pi = 3.14;
			double r = 5.5;
			double area = pi*(r*r);
			return area;
	}
	 
	 double circlearea3(double pi, double r) {
		 
			double area = pi*(r*r);
			return area;
	}
	

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.circlearea();
		System.out.println("circle area is above"+"\n");
		
		
		c.circlearea1(3.14,5.5);
		System.out.println("circle area1 is above"+"\n");
		
		double value = c.circlearea2();
		System.out.println(value);
		System.out.println("circle area2 is above"+"\n");
		
		
		double value1 = c.circlearea3(3.14,5.5);
		System.out.println(value1);
		System.out.println("circle area3 is above");
		
		
		

	}

}
