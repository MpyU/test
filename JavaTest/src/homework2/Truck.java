package homework2;

public class Truck extends Vehicles{
	private float load;
	
	public Truck() {
		
	}
	
	public Truck(float load,String brand,String color) {
		super(brand,color);
		this.load = load;
	}


	public float getLoad() {
		return load;
	}


	public void setLoad(float load) {
		this.load = load;
	}


	public void showTruck() {
		System.out.println("����Ʒ��Ϊ��"+this.brand+", ��ɫΪ��"+super.color+", ������(��)�� "+this.load);
	}
	
}
