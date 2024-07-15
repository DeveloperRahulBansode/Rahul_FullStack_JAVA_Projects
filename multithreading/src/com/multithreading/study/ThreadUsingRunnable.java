package com.multithreading.study;

public class ThreadUsingRunnable {
	
	public static void main(String[] args) {
		RunableDemo rundemo=new RunableDemo();
		RunableDemo rundemo1=new RunableDemo();

		Thread thread1=new Thread(rundemo);
		Thread thread2=new Thread(rundemo1);

		thread1.start();
		thread2.start();
	}

}
