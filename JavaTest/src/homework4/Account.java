package homework4;

public class Account {
	private long id;
	private double balance;
	private String password;
	
	public Account() {
	}
	
	public Account(double balance, String password) {
		this.balance = balance;
		this.password = password;
		this.id = (long)(Math.random()*100+1);
	}
	
	public Account(long id, double balance, String password) {
		super();
		this.id = id;
		this.balance = balance;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", password=" + password + "]";
	}
	
	
}
