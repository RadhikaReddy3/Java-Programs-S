package Abstract;

public class Rectangle extends Shape {

	@Override
	public void printArea() {
		 System.out.println("Area of Rectangle"+"\n");
		 System.out.println("Enter length and breadth: ");
		 int length = s.nextInt();
		 int breadth = s.nextInt();
		 System.out.println("Area of Rectangle: "+(length*breadth));
		
	}
	
	

}
