package com.multithreading.synchronization;


public class PrintMsg {
	private String msg;
	
	public PrintMsg(String msg) {
		this.msg=msg;
	}
	
	//syncronize use to way method Synchronize  to add after accesspacifire Synchronize
	public  void printMessege() {
		synchronized (this) {
			for(int i=0;i<10;i++) {
				System.out.println(msg+1);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
