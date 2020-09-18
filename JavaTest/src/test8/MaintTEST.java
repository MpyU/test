package test8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MaintTEST {
	public static void main(String[] args) {
		MaintTEST test = new MaintTEST();
		test.testSingle();
		test.testFixed();
		test.testCache();
		test.testScheduled();
	}
	
	public void testSingle() {
		ExecutorService es = Executors.newSingleThreadExecutor();
		for( int i = 0;i<2;i++) {
			es.execute(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+"...."+"testSingle");
				}
			});
		}
	}
	
	public void testFixed() {
		ExecutorService es = Executors.newFixedThreadPool(10);
		for( int i = 0;i<15;i++) {
			es.execute(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+"...."+"testFixed");
				}
			});
		}
	}
	
	public void testCache() {
		ExecutorService es = Executors.newCachedThreadPool();
		for( int i = 0;i<15;i++) {
			es.execute(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+"...."+"testCache");
				}
			});
		}
	}
	
	public void testScheduled() {
		ScheduledExecutorService es = Executors.newScheduledThreadPool(10);
		for( int i = 0;i<15;i++) {
			es.schedule(()->{
				System.out.println(Thread.currentThread().getName()+"...."+"testScheduled");
			}, 2, TimeUnit.SECONDS);
		}
	}
}
