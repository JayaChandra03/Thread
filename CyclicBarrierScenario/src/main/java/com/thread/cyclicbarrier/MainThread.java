/**
 * 
 */
package com.thread.cyclicbarrier;

/**
 * @author Manoharan Jayabal
 *
 */
public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		Thread cThread = new Thread(new ConsolidatorThread());
		cThread.start();
		System.out.println("Main thread on hold");
		cThread.join();
		System.out.println("Main Thread completed");
	}
}
