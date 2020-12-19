/**
 * 
 */
package com.thread.blockingqueue;

/**
 * @author Manoharan Jayabal
 *
 */
public class Food {
	
	 private String foodName;
	 private String price;
	 
	 public Food(String foodName,String price) {
		 this.foodName = foodName;
		 this.price = price;
	 }
	 
	 
	 public String getFoodName() {
		 return this.foodName;
	 }

	 
	 public String getPrice() {
		 return this.price;
	 }
	 
	 public String toString() {
		 return this.foodName;
	 }
}
