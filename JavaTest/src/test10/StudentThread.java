package test10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StudentThread{
	
	private static int c1 = 0;
	private static int c2 = 0;
	
	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		for(int i = 1;i<=50;i++) {
			int count = i;
			es.execute(()->{
				Map<Integer,Integer> map = new HashMap<Integer,Integer>();
				for(int j = 0;j<7;j++) {
					if(j<5) {
						vertifyAdd(map,0);
					}else {
						vertifyAdd(map,1);
					}
				}
				if(Thread.currentThread().getName().equals("pool-1-thread-1")) {
					List<Integer> list = mapToList(map);
					System.out.println("第"+(count)+"個同學從前門進入教室，拿到的號碼牌為："+list);
					c1++;
				}else {
					List<Integer> list = mapToList(map);
					System.out.println("第"+(count)+"個同學從後門進入教室，拿到的號碼牌為："+list);
					c2++;
				}
			});
		}
		
		Thread.sleep(2000);
		System.out.println("從前門進的人共有： "+c1);
		System.out.println("從後門進的人共有： "+c2);
	}
	
	public static void vertifyAdd(Map<Integer,Integer> map,int state) {
		boolean flag = false;
		while(true) {
			int num;
			if(state == 0) {
				num = (int)(Math.random()*33+1);
			}else {
				num = (int)(Math.random()*12+1);
			}
			if(!map.containsKey(num)) {
				map.put(num, num);
				flag = true;
			}
			if(flag) {
				break;
			}
		}
	}
	
	public static List<Integer> mapToList(Map<Integer,Integer> map) {
		List<Integer> list = new ArrayList<Integer>();
		map.forEach((n,m)->{
			list.add(n);
		});
		
		return list;
	}

}
