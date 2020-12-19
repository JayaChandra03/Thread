package com.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Counter implements Runnable{
	
	private CountDownLatch thisLatch;
	
	public Counter(CountDownLatch cntd) {
		thisLatch = cntd;
		
	}

	@Override
	public void run() {
         try {
        	 System.out.println("waiting..."+Thread.currentThread().getName());
     		Thread.sleep(5000);
     	} catch (InterruptedException e) {
     		e.printStackTrace();
     	}
        thisLatch.countDown();
	}

}
