/**
 * 
 */
package com.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Manoharan Jayabal
 *
 */
public class WeatherReportThread implements Runnable{
	
	private CyclicBarrier cb;
	
	public WeatherReportThread(CyclicBarrier cb) {
		this.cb = cb;
	}

	@Override
	public void run() {
		 try {
			 System.out.println("WeatherReportThread on wait...");
			 Thread.sleep(3000);
			 int i = cb.await();
			 System.out.println("WeatherReportThread released:"+i+">>  >> awaited released from the barrier");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("done from weather");
	}

}
