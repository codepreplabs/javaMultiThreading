package com.codepreplabs.demoCountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Service implements Runnable {
	
	private String name;
	private int timeToStart;
	private CountDownLatch latch;

	public Service(String name, int timeToStart, CountDownLatch latch) {
		super();
		this.name = name;
		this.timeToStart = timeToStart;
		this.latch = latch;
	}

	public void run() {
		
		try {
			System.out.println("Starting "+name);
			Thread.sleep(timeToStart);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();
	}

}
