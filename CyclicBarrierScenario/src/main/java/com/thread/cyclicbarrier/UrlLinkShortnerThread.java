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
public class UrlLinkShortnerThread implements Runnable {

	private CyclicBarrier cb;

	public UrlLinkShortnerThread(CyclicBarrier cb) {
		this.cb = cb;
	}

	@Override
	public void run() {
		try {
			System.out.println("UrlLinkShortner on wait...");
			Thread.sleep(7000);
			System.out.println("awake url link shortner thread.");
			Thread.sleep(2000);
			if(cb.getNumberWaiting() == 1) {
				System.out.println("1 party reached!!");
				Thread.sleep(1000);
			}
			int i = cb.await();
			System.out.println(" UrlLinkShortner"+i+" >> awaited released from the barrier");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("done from UrlLinkShortner");

	}

}
