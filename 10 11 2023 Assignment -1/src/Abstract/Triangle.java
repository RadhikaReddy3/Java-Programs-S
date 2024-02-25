package Abstract;

public class Triangle extends Shape{

	@Override
	public void printArea() {
		 
		System.out.println("Area of Triangle");
		System.out.println("Enter base and height");
		int base = s.nextInt();
		int height = s.nextInt();
		System.out.println("Area of Triangle: "+(base*height)/2);
		
	}
	

}
