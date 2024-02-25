package Throw;

public class Server extends RuntimeException{
	
	//Creation of RuntimeException or UncheckedException which need not be handled
	public Server(String msg) {
		super(msg);
	}

}
