package com.codepreplabs.main;

import com.codepreplabs.consumer.Consumer;
import com.codepreplabs.producer.Producer;

public class DemoWaitAndNotify {
	
	private static Object lockObject = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		
		Producer producerTask = new Producer(lockObject);
		Consumer consumerTask = new Consumer(lockObject);
		
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
