package com.codepreplabs.producer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable {

	private Lock lock;
	private Condition condition;
	
	public Producer(Lock lock, Condition condition) {
		this.lock = lock;
		this.condition = condition;
	}

	public Producer(Lock lock) {
		this.lock = lock;
	}

	public void run() {
		produce();
	}
	
	private void produce(){
		lock.lock();
		try{
			System.out.println("Inside the producer");
			condition.await();
			System.out.println("Producer RESUMING...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}

}
