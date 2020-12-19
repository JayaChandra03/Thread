/**
 * 
 */
package com.thread.blockingqueue;

import java.util.Random;

/**
 * @author Manoharan Jayabal
 *
 */
public class FoodFactory implements Factory<Food>{
	
	private String[] foods = {"chinese","Indian","mexican","italian spicy"};
	
	private Random r = new Random();
	public Food produce() {
		return new Food(foods[ r.nextInt(4)],Math.random()%5.00+"");
	}

}
