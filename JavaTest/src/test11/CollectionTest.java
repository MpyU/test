package test11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionTest {
	public static void main(String[] args) {
		Collection<String> col = new ArrayList<String>();
		col.add("a");
		col.add("b");
		col.add("c");
		col.add("d");
		col.add("e");
		
		Iterator<String> iterator = col.iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.forEach((n,m)->{
			System.out.println(n+"...."+m);
		});
		System.out.println("-------------------");
		col.forEach((n)->{
			System.out.println(n);
		});
	}
}
