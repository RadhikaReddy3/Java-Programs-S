
public class powerbill {

	public static void main(String[] args) {
		int bill = 20000;
		int gst = 30;
		int dis = 10;
	    int fbill;
		System.out.println("gst---percentage=="+gst);
		int gstv = (bill/100)*gst;
		System.out.println("gst value on bill=="+gstv);
		System.out.println("disc ---percentage"+dis);
		int disv = (bill/100)*dis;
		System.out.println("disv value on percentage"+disv);
	    fbill = (bill+gstv)-disv;
		
		System.out.println("final bill for customer=="+fbill);		
		
		
		  
	}

}
