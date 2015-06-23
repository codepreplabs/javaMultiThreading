package com.codepreplabs.main;

import java.util.LinkedList;

import com.codepreplabs.consumer.Consumer;
import com.codepreplabs.producer.Producer;

public class DemoProducerConsumer {
	
	private static LinkedList<Integer> integers = new LinkedList<Integer>();
	private static int LIMIT = 10;
	private static Object lock = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		
		Producer producerTask = new Producer(integers, LIMIT, lock);
		Consumer consumerTask = new Consumer(integers, LIMIT, lock);
		
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
