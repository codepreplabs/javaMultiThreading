package com.codepreplabs.semaphore;

import java.util.concurrent.Semaphore;

public class Connection {

	private static Connection instance = new Connection();
	private int connections;
	private Semaphore semaphore = new Semaphore(10, true);

	private Connection() {

	}

	public static Connection getInstance() {
		return instance;
	}

	public void connect() {
		try {
			semaphore.acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		try {
			doConnect();
		} finally {
			semaphore.release();
		}
	}

	public void doConnect() {

		synchronized (this) {
			connections++;
			System.out.println("Current connections: " + connections);
		}

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		synchronized (this) {
			connections--;
		}
	}
}
