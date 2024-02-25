
public class pbill1 {

	public static void main(String[] args) {
		  //declare variable along with intialization
		 int pu = 600;
		 int cu = 800;
		 int units = cu - pu;
		 double price = 4.5;
		 double fbill = (units *price);
		 System.out.println("No of previous units---"+pu);
		 System.out.println("No of current units---"+cu);
		 System.out.println("No of units consumed---"+units);
		 System.out.println("Each unit price---"+price);
		 System.out.println("final bill---"+fbill);
	}

}
