/**
 * 
 */
package com.thread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Manoharan Jayabal
 *
 */
public class ConsolidatorThread implements Runnable{
	
	private CyclicBarrier ourBarrier;
	
	public ConsolidatorThread() {
		this.ourBarrier = new CyclicBarrier(2);
		
	}

	@Override
	public void run() {
		//Consolidate thread will wait here for other threads to complete
		//if 2 means both thread were completed their jobs
		Thread t1 = new Thread(new UrlLinkShortnerThread(ourBarrier));
		Thread t2 = new Thread(new WeatherReportThread(ourBarrier));
		t1.start();
		t2.start();
		try {
			Thread.sleep(20000);
			System.out.println("consolidator awake...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Consolidated!");
	}

}
