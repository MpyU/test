package test7;

import java.util.concurrent.Callable;

public class ExampleCallable implements Callable<Integer> {
	private static int tickt = 100;
	private static Object obj = new Object();
	
	@Override
	public Integer call() throws Exception {
		if (tickt > 0) {
			synchronized (obj) {
				sellTicket();
			}
		}
		return tickt; // 返回剩余票数
	}

//售票方法
	private void sellTicket() throws Exception{
		while (tickt > 0) {
			Thread.sleep(10);
			// 线程名称
			String name = Thread.currentThread().getName();
			// 票数相减
			System.out.println("线程名称：" + name + " 票号：" + tickt--);
		}
	}
}