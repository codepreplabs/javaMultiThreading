package com.codepreplabs.usingthread;

import java.util.Scanner;

class Process implements Runnable {

	private volatile boolean runStatus = true;

	public void run() {
		while (runStatus) {
			System.out.println("Process is running!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutDown() {
		runStatus = false;
	}
}

public class VolatileDemo extends Thread {

	private static Scanner scanner;

	public static void main(String[] args) {

		Process process1 = new Process();

		Thread processRunner1 = new Thread(process1);
		Thread processRunner2 = new Thread(process1);

		processRunner1.start();
		processRunner2.start();

		System.out.println("Click enter to stop");
		scanner = new Scanner(System.in);
		scanner.nextLine();

		process1.shutDown();

	}
}
