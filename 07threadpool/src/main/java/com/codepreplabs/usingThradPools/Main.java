package com.codepreplabs.usingThradPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService service = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 10; i++) {
			service.submit(new Processor(i));
		}
		
		service.shutdown();
	}
}
