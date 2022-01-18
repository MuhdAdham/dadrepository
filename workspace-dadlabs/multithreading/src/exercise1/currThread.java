package exercise1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class currThread extends Thread {
	
	public void printNumbers (String currThread) {
		
		LocalTime time = LocalTime.now();
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
		String tFd = time.format(tf);
		
		for(int i=0; i<10; i++)
		{
			System.out.println("No. " + i + " : " + currThread + " at " + tFd);;
		}
		
	}
	
	public void run() {
		
		//Get current thread
		Thread currThread = Thread.currentThread();
		
		printNumbers(currThread.getName());
	}

}
