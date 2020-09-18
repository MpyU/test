package homework2;

public class Vehicles {
	public String brand;
	public String color;
	
	public Vehicles() {}
	
	public Vehicles(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}
	
	public void run() {
		System.out.println("我已经开动");
	}
	
	public void showInfo() {
		System.out.println("brand: "+this.brand+"......color: "+this.color);
	}
	
}
