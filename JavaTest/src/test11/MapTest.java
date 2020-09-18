package test11;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("aa", "Kevin1");
		map.put("bb", "Kevin2");
		map.put("dd", "Kevin3");
		map.put("aa", "Kevin");
		
		map.forEach((n,m)->{
			System.out.println(n+"---->"+m);
		});
	}
}
