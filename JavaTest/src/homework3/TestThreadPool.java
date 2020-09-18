package homework3;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {
	
	public static void main(String[] args) {
		LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>(200);
		ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 20, 20, TimeUnit.SECONDS, queue);
	}
}
