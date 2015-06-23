package com.codepreplabs.producer;

import java.util.LinkedList;
import java.util.Random;

public class Producer implements Runnable {

	private LinkedList<Integer> integers;
	private int LIMIT;
	private Object lock;

	public Producer(LinkedList<Integer> integers, int LIMIT, Object lock) {
		this.integers = integers;
		this.LIMIT = LIMIT;
		this.lock = lock;
	}

	public void run() {

		while(true){
			produce();
		}

	}
	
	public void produce(){
		int value = 0;
		synchronized (lock) {
			while (integers.size() == 10) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			integers.add(value++);
			lock.notify();
		}
	}

}
