package Java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable emailTask = () -> System.out.println("Sending Email...");
		Runnable logTask = () -> System.out.println("Loggine Activity....");
		
		executor.submit(emailTask);
		executor.submit(logTask);
		
		executor.shutdown();
	}

}
