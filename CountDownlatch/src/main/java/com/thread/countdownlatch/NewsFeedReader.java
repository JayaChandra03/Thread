/**
 * 
 */
package com.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Manoharan Jayabal
 *
 */
public class NewsFeedReader implements Runnable {
	
	private CountDownLatch latch;
	
	public NewsFeedReader(CountDownLatch latch) {
		 this.latch = latch;
	}

	@Override
	public void run() {
		try {
			latch.await();
			System.out.println("NewsFeed thread done its work "
					+ "after the two long running tasks has terminated.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
