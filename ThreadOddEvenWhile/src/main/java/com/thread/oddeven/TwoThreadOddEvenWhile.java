/**
 * 
 */
package com.thread.oddeven;


/**
 * @author Manoharan Jayabal
 *
 */


class CounterFlag{
	public  volatile int c=1;
	public volatile boolean stop = false;
}


class OddThread extends Thread {

	private CounterFlag c;

	public OddThread(CounterFlag c) {
		 this.c = c;
	}

	@Override
	public void run() {
		while (true) {
			while (c.stop)
				;
			System.out.println(c.c);
			c.c++;
			c.stop = true;

		}
	}

}

class EvenThread extends Thread {

	private CounterFlag c;

	public EvenThread(CounterFlag c) {
		 this.c = c;
	}

	@Override
	public void run() {
		while (true) {
			while (!c.stop);
			System.out.println(c.c);
			c.c++;
			c.stop = false;
		}

	}
}

public class TwoThreadOddEvenWhile {
	public static void main(String[] args) {
		CounterFlag c = new CounterFlag();
		OddThread odd = new OddThread(c);
		odd.setName("Odd");
		EvenThread even = new EvenThread(c);
		even.setName("Even");
		odd.start();
		even.start();
	}

}
