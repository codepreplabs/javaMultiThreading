package com.codepreplabs.threads;

public class DemoSynchronized {

	private static Account account = new Account();

	public static void main(String[] args) {

		Runnable runnable = () -> {
			for (int i = 0; i < 5; i++) {
				DemoSynchronized.makeWithdrawal(10);
				if (account.getBalance() < 0) {
					System.out.println("account is overdrawn!");
				}
			}
		};

		Thread fred = new Thread(runnable);
		fred.setName("fred");
		Thread lucy = new Thread(runnable);
		lucy.setName("lucy");

		fred.start();
		lucy.start();

	}

	public static synchronized void makeWithdrawal(int amount) {

		if (account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw "
					+ account.getBalance());
		}
	}

}
