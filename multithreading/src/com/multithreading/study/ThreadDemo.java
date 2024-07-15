package com.multithreading.study;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		printHello();

	}

	private void printHello() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + " "+ "Hello" + i);
		}
	}

}
