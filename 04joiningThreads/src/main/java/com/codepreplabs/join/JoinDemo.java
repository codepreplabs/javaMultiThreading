package com.codepreplabs.join;

class Task implements Runnable{

	public void run() {
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" completed");
	}
	
}

public class JoinDemo{
	
	
	public JoinDemo() {
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Task task = new Task();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		Thread t3 = new Thread(task);
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
	}
}
