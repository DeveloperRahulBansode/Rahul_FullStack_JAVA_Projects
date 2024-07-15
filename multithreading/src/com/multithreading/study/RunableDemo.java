package com.multithreading.study;

public class RunableDemo implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			printRunnable(i);
		}
	}

	private void printRunnable(int i) {
		System.out.println("Runnable"+i);
	}
	
	

}
