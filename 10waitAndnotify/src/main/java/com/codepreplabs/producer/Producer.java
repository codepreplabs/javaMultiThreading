package com.codepreplabs.producer;

public class Producer implements Runnable {

	private Object lock;

	public Producer(Object lock) {
		this.lock = lock;
	}

	public void run() {
		produce();
	}
	
	private void produce(){
		synchronized (lock) {
			System.out.println("Inside the producer");
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Producer RESUMING...");
		}
	}

}
