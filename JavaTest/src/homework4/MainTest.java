package homework4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTest {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();	
		list.add(new Account(10.00,"1234"));
		list.add(new Account(15.00,"5678"));
		list.add(new Account(0,"1010"));
		
		Map<Long,Account> map = new HashMap<>();
		
		list.forEach(account->{
			map.put(account.getId(), account);
		});
		
		map.forEach((key,val)->{
			System.out.println("id£º"+key+"...."+"Óà¶îÎª£º"+val.getBalance());
		});
	}
}
