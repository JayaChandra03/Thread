/**
 * 
 */
package com.thread.blockingqueue;

/**
 * @author Manoharan Jayabal
 *
 */
public  interface Factory<T> {
	
	T produce();
	
}
