package com.thread.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer<T> implements Runnable {

	private BlockingQueue<T> queue;

	public Consumer(BlockingQueue<T> bq) {
		this.queue = bq;
	}

	@Override
	public void run() {
		while (true) {
				T t = null;
				try {
					t = queue.take();
					System.out.println(t + " cosumed");
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}

}
