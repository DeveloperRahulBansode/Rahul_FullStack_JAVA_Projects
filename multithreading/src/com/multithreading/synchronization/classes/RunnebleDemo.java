package com.multithreading.synchronization.classes;

public class RunnebleDemo implements Runnable {

	private String printMsg;
	

	public RunnebleDemo(String printMsg) {
		this.printMsg = printMsg;
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			printRunnable(i);
		}
	}

	private void printRunnable(int i) {
		System.out.println(i);
	}
	

}
