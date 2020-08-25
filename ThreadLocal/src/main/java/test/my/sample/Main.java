
/**
 * 
 */
package test;

/**
 * @author jayabal.manoharan
 *
 */
public class Main {

	public static void main(String[] args) {
		ProcessingClass p = new ProcessingClass();
		MyThread t1 = new MyThread(p);
		t1.start();
		MyThread t2 = new MyThread(p);
		t2.start();
	}
}
