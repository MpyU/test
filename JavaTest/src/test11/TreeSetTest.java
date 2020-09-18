package test11;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
//		TreeSet<User> tree = new TreeSet<User>();
//		tree.add(new User(1,"张三"));
//		tree.add(new User(2,"李四"));
//		tree.add(new User(1,"张三"));
//		tree.add(new User(2,"王五"));
//		Iterator<User> iterator = tree.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		TreeSet<Animal> tree = new TreeSet<Animal>();
		tree.add(new Animal(1,"狗"));
		tree.add(new Animal(2,"猫"));
		tree.add(new Animal(3,"猪"));
		tree.add(new Animal(4,"兔"));
		Iterator<Animal> iterator = tree.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
