package com.codepreplabs.usingThradPools;


public class Processor implements Runnable {

	private int processId;

	public Processor() {
		// TODO Auto-generated constructor stub
	}

	public Processor(int i) {
		this.processId = i;
	}

	public void run() {
		
		System.out.println(processId+" started execution "+Thread.currentThread().getId());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(processId+" completed execution "+Thread.currentThread().getId());
		
	}

}
