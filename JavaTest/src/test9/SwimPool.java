package test9;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SwimPool implements Runnable{

	private static int count = 1;
	private CyclicBarrier barrier;
	
	public SwimPool(CyclicBarrier barrier) {
		this.barrier = barrier;
	}
	
	private static Object obj = new Object();
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"�x�ֵ�λ........");
		try {
			barrier.await();
			if(count == 1) {
				synchronized (obj) {
					if(count == 1) {
						System.out.println("�����x�֣� �ҿ����ِ�_ʼ��");
						count++;
					}
				}
			}
			TimeUnit.MILLISECONDS.sleep(3000);
			
			TimeUnit.MILLISECONDS.sleep(1000);
			barrier.await();
			System.out.println(Thread.currentThread().getName()+"��ɱ�ِ");
			
			
			
		}catch(Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		int threadNum = 8;
        CyclicBarrier barrier = new CyclicBarrier(threadNum, new Runnable() {
            
            @Override
            public void run() {
            	
            }
        });
        ExecutorService pool = Executors.newFixedThreadPool(8);
        
        for(int i = 0; i < threadNum; i++) {
            pool.execute(new SwimPool(barrier));
        }
        
        
        
	}

}
