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
		return tickt; // ����ʣ��Ʊ��
	}

//��Ʊ����
	private void sellTicket() throws Exception{
		while (tickt > 0) {
			Thread.sleep(10);
			// �߳�����
			String name = Thread.currentThread().getName();
			// Ʊ�����
			System.out.println("�߳����ƣ�" + name + " Ʊ�ţ�" + tickt--);
		}
	}
}