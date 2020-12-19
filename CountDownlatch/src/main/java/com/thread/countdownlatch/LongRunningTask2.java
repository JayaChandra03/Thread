/**
 * 
 */
package com.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Manoharan Jayabal
 *
 */
public class LongRunningTask2 implements Runnable{
	
     private CountDownLatch latch;
	
	public LongRunningTask2(CountDownLatch latch) {
		this.latch = latch;
		
	}

	@Override
	public void run() {
		
		System.out.println("Running long task 2...");
		try {
			Thread.sleep(2000);
			latch.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
