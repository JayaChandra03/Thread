/**
 * 
 */
package com.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Manoharan Jayabal
 *
 */
public class LongRunningTask implements Runnable {
	
	private CountDownLatch latch;
	
	public LongRunningTask(CountDownLatch latch) {
		this.latch = latch;
		
	}

	@Override
	public void run() {
		
		System.out.println("Running long task 1...");
		try {
			Thread.sleep(5000);
			latch.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
