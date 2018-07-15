package com.zscdumin.MultiThreadTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {
	private Lock lock = new ReentrantLock(false); //fair代表是否是公平锁，false不是公平锁

	public static void main(String[] args) {
		Demo test = new Demo();
		MyThread thread1 = new MyThread(test, "A");
		MyThread thread2 = new MyThread(test, "B");
		thread1.start();
		thread2.start();
	}

	public void insert(Thread thread) throws InterruptedException {
		lock.lockInterruptibly();
		try {
			System.out.println("线程 " + thread.getName() + "得到了锁...");
			Thread.sleep(10000);
		} finally {
			lock.unlock();
			System.out.println("线程 " + thread.getName() + "释放了锁");
		}
	}
}

class MyThread extends Thread {
	private Demo test;

	public MyThread(Demo test, String name) {
		super(name);
		this.test = test;
	}

	@Override
	public void run() {
		try {
			test.insert(Thread.currentThread());
		} catch (InterruptedException e) {
			System.out.println("线程 " + Thread.currentThread().getName() + "被中断...");
		}
	}
}