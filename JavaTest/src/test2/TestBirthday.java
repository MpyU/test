package test2;

public class TestBirthday {
	public static void main(String[] args) {
		Birthday b1 = new Birthday(15,9,2020);
		Birthday b2 = new Birthday(15,9,2020);
		System.out.println(b1);
		change(b1);
		System.out.println(b1);
	}
	
	public static void change(Birthday b) {
//		b = new Birthday(6,6,2020);
		b.setDay(20);
	}
}
