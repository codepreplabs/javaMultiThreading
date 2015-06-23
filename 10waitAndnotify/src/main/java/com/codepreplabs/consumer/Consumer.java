package com.codepreplabs.consumer;

import java.util.Scanner;



public class Consumer implements Runnable {

	private Object lock;
	private Scanner scanner;

	public Consumer(Object lock) {
		this.lock = lock;
	}

	public void run() {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (lock) {
			
			System.out.println("Starting consumer..... click enter to continue");
			scanner = new Scanner(System.in);
			scanner.nextLine();
			System.out.println("Consumer started");
			lock.notify();
			
		}

	}

}
