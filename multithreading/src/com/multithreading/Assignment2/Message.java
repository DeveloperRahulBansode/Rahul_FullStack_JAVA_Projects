package com.multithreading.Assignment2;

public class Message {

	public void printMsg(String msg) {
		System.out.print(msg);
		System.out.print("[");

		synchronized (this) {
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("Messege="+" " + msg);

		}
		System.out.print("]");

	}

}
