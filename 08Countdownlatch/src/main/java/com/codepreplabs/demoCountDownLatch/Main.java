package com.codepreplabs.demoCountDownLatch;

import java.util.concurrent.CountDownLatch;


public class Main {

	public static void main(String[] args) throws InterruptedException {

		final CountDownLatch latch = new CountDownLatch(3);
		
		Thread cacheService = new Thread(new Service("CacheService", 1000, latch));
		Thread alertService = new Thread(new Service("AlertService", 1000, latch));
		Thread validationService = new Thread(new Service("ValidationService", 1000, latch));
		
		cacheService.start();
		validationService.start();
		alertService.start();
		
		try{
			latch.await();
			System.out.println("All services are up and application boot initiated!");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
}
