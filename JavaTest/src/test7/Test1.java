package test7;

import java.util.concurrent.FutureTask;

public class Test1 {
	
	public static void main(String[] args) throws Exception {
		FutureTask<Integer> ft = new FutureTask<>(new ExampleCallable ());
		FutureTask<Integer> ft1 = new FutureTask<>(new ExampleCallable ());
		FutureTask<Integer> ft2 = new FutureTask<>(new ExampleCallable ());
		FutureTask<Integer> ft3 = new FutureTask<>(new ExampleCallable ());
		Thread t1=new Thread(ft);
		Thread t2=new Thread(ft1);
		Thread t3=new Thread(ft2);
		Thread t4=new Thread(ft3);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("返回结果完成"+ft1.get());
	}
}
