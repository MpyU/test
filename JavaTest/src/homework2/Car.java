package homework2;

public class Car extends Vehicles{
	private Integer seats;

	public Car() {}
	
	public Car(Integer seats,String brand,String color) {
		super(brand,color);
		this.seats = seats;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	
	public void showCar() {
		System.out.println("����Ʒ��Ϊ��"+this.brand+", ��ɫΪ��"+super.color+", ������λ���� "+this.seats);
	}
	
}
