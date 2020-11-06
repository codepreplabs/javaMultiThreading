package com.codepreplabs.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newCachedThreadPool();
		SleepTask task = new SleepTask();
		
		Future<Integer> result = service.submit(task);
		service.shutdown();
		
		try {
			System.out.println("Result is: "+ result.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
