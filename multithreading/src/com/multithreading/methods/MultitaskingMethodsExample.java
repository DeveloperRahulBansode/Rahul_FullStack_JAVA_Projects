package com.multithreading.methods;

public class MultitaskingMethodsExample {

	public static void main(String[] args) {
		System.out.println("main method Start Exicution");
		
		
		Thread thread1=new Thread(()->{
		
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(100);
					System.out.println(i+" "+"Thread1");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		Thread thread2=new Thread(()->{
			
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(100);
					System.out.println(i+""+"Thread2");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		});Thread thread3=new Thread(()->{
		
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(100);
					System.out.println(i+""+ "Thread3");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		thread2.start();
		thread3.start();
		
		System.out.println("main method END Exicution");
		
		
	}
}
