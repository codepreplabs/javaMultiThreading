package com.codepreplabs.usingrunnable;

public class UsingRunnable implements Runnable {

	public void run() {

		for (int i = 0; i < 15; i++) {
			try {
				System.out.println("Thread with id: "
						+ Thread.currentThread().getName() + " running" + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new UsingRunnable());
		thread1.setName("Jack");
		thread1.start();
		Thread thread2 = new Thread(new UsingRunnable());
		thread2.setName("Jill");
		thread2.start();
	}
}
