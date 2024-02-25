package Movie_Ticket_Booking;

public class User  {

	public static void main(String[] args) {
		 
		Ticketbooking t = new Ticketbooking();
		
		Thread p = new Thread(t) {
			public void run() {
			 
				t.ticket();
			}
		};
		p.start();
		
		
		Thread p1 = new Thread(t) {
			public void run() {
			   
				t.ticket();
			}
		};
		p1.start();
		
		
		Thread p2 = new Thread(t) {
			public void run() {
			 
				t.ticket();
			}
		};
		p2.start();
		

	}

}
