/**
 * 
 */
package com.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Manoharan Jayabal
 *
 */
public class LatchExample2 {
	
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(2);
		LongRunningTask t1 = new LongRunningTask(latch);
		LongRunningTask2 t2 = new LongRunningTask2(latch);
		NewsFeedReader news = new NewsFeedReader(latch);
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(news);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
