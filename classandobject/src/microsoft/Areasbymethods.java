package microsoft;

public class Areasbymethods {
	
	void rec(int len, int bre) {
		System.out.println("Area of Rectangle: "+(len*bre));
		System.out.println("Perimeter of Rectangle: "+(2*(len+bre))+"\n\n");
	}
	
	void squ(int area) {
		System.out.println("Area of square: "+(area*area));
		System.out.println("Perimeter of square: "+(4*area)+"\n\n");
	}

	void circle(int radius, double pi) {
		System.out.println("Area of Circle: "+(pi*radius*radius));
		System.out.println("Perimeter of Circle: "+(2*pi*radius)+"\n\n");
	}
	
	void triangle(int base, int height, int s1, int s2, int s3) {
		System.out.println("Area of Triangle: "+(0.5*base*height));
		System.out.println("Perimeter of Circle: "+(s1+s2+s3)+"\n\n");
	}
	
	void Parallelogram(int bre, int height, int s1, int base) {
		System.out.println("Area of Parallelogram : "+(base*height));
		System.out.println("Perimeter of Parallelogram: "+2*(s1+base)+"\n\n");
	}
	
	void Rhombus(int side, int d1, int d2) {
		System.out.println("Perimeter of Rhombus: "+(0.5*d1*d2));
		System.out.println("Area of Rhombus: "+(4*side)+"\n\n");
	}
	

	public static void main(String[] args) {
		Areasbymethods a = new Areasbymethods();
		a.rec(3, 4);
		a.squ(13);
		a.circle(6,3.14);
		a.Parallelogram(2, 3, 4, 5);
		a.triangle(2, 3, 4, 5, 6);
		a.Rhombus(5, 6, 4);
		 
	}

}
