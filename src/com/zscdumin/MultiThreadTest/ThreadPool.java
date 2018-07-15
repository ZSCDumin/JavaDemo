package com.zscdumin.MultiThreadTest;

import java.util.concurrent.*;

public class ThreadPool {
	/**
	 * 五种创建线程池的方法：
	 * 1. Single Thread Executor(单线程池)
	 * 2. Cached ThreadPool(线程复用，超过60s的将会被删除)
	 * 3. Fixed Thread Pool(固定大小的线程池)
	 * 4. Scheduled Thread Pool(用来调度即将执行任务的线程池)
	 * 5. Single Thread Scheduled Pool(只有一个线程池，用来调度任务在指定的时间执行)
	 */

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		//ExecutorService pool = Executors.newCachedThreadPool();
		//ExecutorService pool = Executors.newSingleThreadExecutor();
		//ExecutorService pool = Executors.newFixedThreadPool(3);
		//ExecutorService pool = Executors.newScheduledThreadPool(5);
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
		//ExecutorService pool = Executors.newSingleThreadScheduledExecutor();
		for (int i = 0; i < 10; i++) {

//			pool.execute(new Runnable() {
//				@Override
//				public void run() {
//					System.out.println(Thread.currentThread().getName());
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			});

			//Callable有返回结果，Runnable无返回结果
			Future<String> future = pool.submit(new Callable<String>() {
				@Override
				public String call() throws InterruptedException {
					Thread.sleep(2000);
					return Thread.currentThread().getName();
				}
			});

			//此处会阻塞主线程，原因是要等待子线程执行完才有返回结果
			System.out.println(future.get());

			//执行定时任务
//			pool.schedule(new Runnable() {
//				@Override
//				public void run() {
//					System.out.println(Thread.currentThread().getName());
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}, 10, TimeUnit.SECONDS);
		}
		pool.shutdown();
	}
}
