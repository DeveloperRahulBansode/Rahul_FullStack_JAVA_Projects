package com.multithreading.study;

public class ThreadCreation extends Thread{
	
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(10+i);
			
		}
		
	}
	
	public static void main(String[] args) {
		ThreadCreation thread=new ThreadCreation();
		ThreadCreation thread2=new ThreadCreation();
		thread.run();
		thread2.start();
	}
	
}

