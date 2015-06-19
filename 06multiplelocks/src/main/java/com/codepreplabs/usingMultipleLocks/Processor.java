package com.codepreplabs.usingMultipleLocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Processor implements Runnable{
	
	Object lock1 = new Object();
	Object lock2 = new Object();
	
	private Random random = new Random();
	
	List<Integer> resource1 = new ArrayList<Integer>();
	List<Integer> resource2 = new ArrayList<Integer>();
	
	public void stageOne(){
		
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			resource1.add(random.nextInt(200));
		}
	}
	
	public synchronized void stageTwo(){
		
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			resource2.add(random.nextInt(200));
		}
	}
	
	public void process(){
		
		for(int i = 0; i < 1000; i++){
			stageOne();
			stageTwo();
		}
	}

	public void run() {
		
		long start = System.currentTimeMillis();
		process();
		long stop = System.currentTimeMillis();
		System.out.println("Time taken: "+(stop - start));
		System.out.println("resource1: "+resource1.size()+"; resource2: "+resource2.size());
		
	}
	
	
}
