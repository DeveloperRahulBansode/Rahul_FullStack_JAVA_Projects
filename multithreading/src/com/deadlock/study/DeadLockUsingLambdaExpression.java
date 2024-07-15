package com.deadlock.study;

public class DeadLockUsingLambdaExpression {
	public static void main(String[] args) {
		Object lock1 = new Object();
		Object lock2 = new Object();

		new Thread(() -> {
			synchronized (lock1) {
				System.out.println("Thread-1 acquires lock2");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("Thread-2 acquires lock1");

				}

			}
		}).start();

		new Thread(() -> {
			synchronized (lock2) {
				System.out.println("Thread-2 acquires lock1");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("Thread-1 acquires lock2");

				}

			}
		}).start();

	}
}