package test11;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
//		TreeSet<User> tree = new TreeSet<User>();
//		tree.add(new User(1,"����"));
//		tree.add(new User(2,"����"));
//		tree.add(new User(1,"����"));
//		tree.add(new User(2,"����"));
//		Iterator<User> iterator = tree.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		TreeSet<Animal> tree = new TreeSet<Animal>();
		tree.add(new Animal(1,"��"));
		tree.add(new Animal(2,"è"));
		tree.add(new Animal(3,"��"));
		tree.add(new Animal(4,"��"));
		Iterator<Animal> iterator = tree.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
