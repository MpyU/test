package test7;

public class TicketWindow implements Runnable{
	
	private Ticket t;
	
	public TicketWindow(Ticket t) {
		this.t = t;
	}
	
	@Override
	public void run() {
			t.sellTickets();
	}

}
