package test7;

public class Ticket {
	private int ticket = 100;
	
	public Ticket() {
		
	}
	
	public Ticket(int ticket) {
		this.ticket = ticket;
	}
	
	public void sellTickets() {
		while(ticket > 0) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.ticket--;
			System.out.println(Thread.currentThread().getName()+"�Ŵ�����Ʊһ�ţ�ʣ��Ʊ���� "+ticket);
			
		}
	}
}
