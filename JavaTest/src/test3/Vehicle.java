package test3;

public class Vehicle {
	private Integer speed;
	private Integer size;
	
	
	public Vehicle(Integer speed, Integer size) {
		super();
		this.speed = speed;
		this.size = size;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	
	public void speedUp() {
		System.out.println("¼ÓËÙ");
	}
	
	public void speedDown() {
		System.out.println("¼õËÙ");
	}
	
	
}
