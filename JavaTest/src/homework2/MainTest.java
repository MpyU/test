package homework2;

public class MainTest {
	public static void main(String[] args) {
		Car vCar = new Car(6,"°ÂµÏ","ºìÉ«");
		Truck vTruck = new Truck(2.5f," Ä´É","À¶É«");
		
		vCar.run();
		vCar.showCar();
		System.out.println("--------------------------");
		vTruck.run();
		vTruck.showTruck();
		
	}
}
