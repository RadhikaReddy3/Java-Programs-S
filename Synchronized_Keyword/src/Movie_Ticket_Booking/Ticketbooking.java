package Movie_Ticket_Booking;

public class Ticketbooking extends Thread {
	
	public synchronized void ticket(){
		 
		for(int i=1;i<=15;i++) {
			
			 
			System.out.println("Ticket Booked for: "+i+" time for "+Thread.currentThread().getName()+" "+"person");
			
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
	}

	 

}
