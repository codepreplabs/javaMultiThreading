package com.codepreplabs.usingthread;

public class UsingThreadClass extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 15; i++) {
			try {
				System.out.println("Thread with is: "+Thread.currentThread().getId()+" running"+i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		UsingThreadClass class1 = new UsingThreadClass();
		UsingThreadClass class2 = new UsingThreadClass();
		
		class1.start();
		class2.start();
	}

}
