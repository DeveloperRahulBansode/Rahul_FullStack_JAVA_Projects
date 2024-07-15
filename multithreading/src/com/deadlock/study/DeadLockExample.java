package com.deadlock.study;

public class DeadLockExample {

	public Thread getThread1(Object lock1, Object lock2) {
		return new Thread(new RunnebleLock1(lock1, lock2));

	}

	public Thread getThread2(Object lock1, Object lock2) {
		return new Thread(new RunnebleLock2(lock1, lock2));

	}

	class RunnebleLock1 implements Runnable {
		Object lock1;
		Object lock2;

		public RunnebleLock1(Object lock1, Object lock2) {
			this.lock1 = lock1;
			this.lock2 = lock2;
		}

		@Override
		public void run() {
			synchronized (lock1) {

				System.out.println("Thrread-1 Acquire Lock1");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (lock2) {
					System.out.println("Thread-1 Acquire Lock2");
				}

			}

		}

	}

	class RunnebleLock2 implements Runnable {
		Object lock1;
		Object lock2;

		public RunnebleLock2(Object lock1, Object lock2) {
			this.lock1 = lock1;
			this.lock2 = lock2;
		}

		@Override
		public void run() {
			synchronized (lock2) {

				System.out.println("Thread-2 Acquire Lock2");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (lock1) {
					System.out.println("Thead-2 Acquire Lock1");
				}

			}

		}

	}

	public static void main(String[] args) {

		Object lock1 = new Object();
		Object lock2 = new Object();

		DeadLockExample dl = new DeadLockExample();

		Thread thread1 = dl.getThread1(lock1, lock2);
		Thread thread2 = dl.getThread2(lock1, lock2);

		thread1.start();
		thread2.start();
		
		
		String data=thread1.getName();
		System.out.println(data);
		boolean data1=thread1.isAlive();
		System.out.println(data1);
		

	}

}
