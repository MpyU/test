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
		System.out.println("卡车品牌为："+this.brand+", 颜色为："+super.color+", 载重量(吨)： "+this.load);
	}
	
}
