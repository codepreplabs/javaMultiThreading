package com.codepreplabs.stoppingThread;

import java.util.Scanner;

class Task implements Runnable {

	boolean stopThread = true;

	public void run() {
		
		while(stopThread){
			System.out.println("running.....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void exit(boolean exitStatus) {
		this.stopThread = exitStatus;
		System.out.println("Exiting thread");
	}
}

public class StoppingThread {

	private static Scanner scanner;

	public StoppingThread() {

	}

	public static void main(String[] args) throws InterruptedException {
		
		Task task = new Task();
		Thread thread = new Thread(task);
		thread.start();
		
		scanner = new Scanner(System.in);
		if(scanner.hasNextLine()){
			task.exit(false);
		}
	}
}
