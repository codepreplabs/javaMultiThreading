package com.codepreplabs.consumer;

import java.util.LinkedList;

public class Consumer implements Runnable {

	private LinkedList<Integer> integers;
	private int LIMIT;
	private Object lock;

	public Consumer(LinkedList<Integer> integers, int LIMIT, Object lock) {
		this.integers = integers;
		this.LIMIT = LIMIT;
		this.lock = lock;
	}

	public void run() {

		while(true){
			consume();
		}
		
	}
	
	public void consume(){
		
		synchronized (lock) {
			
			while(integers.size() == 0){
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if(integers.size() > 0){
				integers.removeLast();
				System.out.println("Removing the element "+integers.size());
				lock.notify();
			}
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
