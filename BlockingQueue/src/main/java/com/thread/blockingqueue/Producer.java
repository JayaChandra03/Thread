package com.thread.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer<T> implements Runnable {

	private BlockingQueue<T> blockingQueue;

	private Factory<T> factory;

	public Producer(BlockingQueue<T> bq, Factory<T> factory) {
		this.blockingQueue = bq;
		this.factory = factory;
	}

	@Override
	public void run() {
		while (true) {
			try {
				blockingQueue.put(factory.produce());
				Thread.sleep(500);
				if (!blockingQueue.isEmpty()) {
					blockingQueue.stream().forEach(e -> {
						System.out.print(e + ", ");
					});
					System.out.println("");
				}
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}

	}

}
