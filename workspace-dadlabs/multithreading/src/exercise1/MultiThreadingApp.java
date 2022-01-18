package exercise1;

public class MultiThreadingApp {
	
	public static void main(String[]args) {
		
		//create object of thread with current time
		Thread th1 = new currThread();
		Thread th2 = new currThread();
		
		
		//create object of thread name
		Thread currThread1 = new Thread(th1, "currThread1");
		Thread currThread2 = new Thread(th2, "currThread2");
		
		
		//execute thread
		currThread1.start();
		currThread2.start();
		
	}

}
