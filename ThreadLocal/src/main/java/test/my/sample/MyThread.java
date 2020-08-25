package test;

public class MyThread extends Thread{
	
	private ProcessingClass t1;
	public MyThread(ProcessingClass t) {
		t1 = t;
	}
	
	public void run() {
		ThreadID.get();
		t1.process();
	}

}
