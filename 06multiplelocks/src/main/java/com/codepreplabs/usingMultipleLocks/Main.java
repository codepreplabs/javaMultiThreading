package com.codepreplabs.usingMultipleLocks;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Processor processor = new Processor();
		
		Thread t1 = new Thread(processor);
		Thread t2 = new Thread(processor);
		
		t1.start();
		t2.start();
	}
}
