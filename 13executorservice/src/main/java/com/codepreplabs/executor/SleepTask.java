package com.codepreplabs.executor;

import java.util.concurrent.Callable;

public class SleepTask implements Callable<Integer> {

	public Integer call() throws Exception {
		
		int millis = 4000;
		System.out.println("Thread is going to sleep");
		Thread.sleep(millis);
		return millis;
	}

}
