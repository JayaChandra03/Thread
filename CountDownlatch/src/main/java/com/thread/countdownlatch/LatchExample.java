package com.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class LatchExample {

	public static void main(String[] args) {
		
		CountDownLatch cntltch = new CountDownLatch(2);
		Thread t1 = new Thread(new Counter(cntltch));
		t1.setName("t1");
		Thread t2 = new Thread(new Counter(cntltch));
		t2.setName("t2");
		t1.start();
		t2.start();
		try {
			//put on hold the running main thread until the count become 0
			cntltch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread Done!");
		
		
	}
}
