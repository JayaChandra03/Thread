package com.thread.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueMain {
	
	public static void main(String[] args) {
		BlockingQueue<Food> bq = new LinkedBlockingQueue<>(4);
		FoodFactory foodFactory = new FoodFactory();
		Producer<Food> p = new Producer<Food>(bq,foodFactory);
		Consumer<Food> c = new Consumer<>(bq);
		new Thread(p).start();
		new Thread(c).start();
	}

}
