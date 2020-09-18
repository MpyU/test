package test11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		showByForeach(list);
		showByFor(list);
		showByIterator(list);
	}
	
	public static void showByForeach(List<String> list) {
		System.out.println();
		System.out.println(".......foreach.......");
		list.forEach((val)->{
			System.out.print(val+"  ");
		});
		System.out.println();
	}
	
	public static void showByFor(List<String> list) {
		System.out.println();
		System.out.println(".......for.......");
		for(String str : list) {
			System.out.print(str+"  ");
		}
		System.out.println();
	}
	
	public static void showByIterator(List<String> list) {
		System.out.println();
		System.out.println(".......foreach.......");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String val = iterator.next();
			System.out.print(val+"  ");
		}
		System.out.println();
	}
}
