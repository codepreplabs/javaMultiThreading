package com.codepreplabs.consumer;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {

	private Lock lock;
	private Scanner scanner;
	private Condition condition;

	public Consumer(Lock lock, Condition condition) {
		this.lock = lock;
		this.condition = condition;
	}

	public void run() {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		lock.lock();

		try {
			System.out
					.println("Starting consumer..... click enter to continue");
			scanner = new Scanner(System.in);
			scanner.nextLine();
			System.out.println("Consumer started");
			condition.signal();
		} finally {
			lock.unlock();
		}
	}
}
