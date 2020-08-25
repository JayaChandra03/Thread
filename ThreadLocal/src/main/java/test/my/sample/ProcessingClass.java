package test;

public class ProcessingClass {
	
	
	public  synchronized  void process() {
		int val = ThreadID.get();
		System.out.println(Thread.currentThread().getName()+" - "+ val);
		System.out.println(ThreadID.get());
		
	}

}
