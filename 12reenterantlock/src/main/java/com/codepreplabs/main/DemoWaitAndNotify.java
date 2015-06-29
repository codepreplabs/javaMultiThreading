package com.codepreplabs.main;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.codepreplabs.consumer.Consumer;
import com.codepreplabs.producer.Producer;

public class DemoWaitAndNotify {
	
	private static Lock lock = new ReentrantLock();
	private static Condition condition = lock.newCondition();
	
	public static void main(String[] args) throws InterruptedException {
		
		Producer producerTask = new Producer(lock, condition);
		Consumer consumerTask = new Consumer(lock, condition);
		
		Thread producer= new Thread(producerTask);
		producer.setName("producer");
		
		Thread consumer = new Thread(consumerTask);
		consumer.setName("consumer");
		
		producer.start();
		consumer.start();
		
		producer.join();
		consumer.join();
		System.out.println("end of main");
		
	}
}
