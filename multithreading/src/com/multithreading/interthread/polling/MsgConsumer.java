package com.multithreading.interthread.polling;

public class MsgConsumer implements Runnable {

	MsgPrinting print;

	public MsgConsumer(MsgPrinting print) {
		super();
		this.print = print;
	}

	public void getMessege() {
		String msg1="";
		while(!msg1.equals("0")) {
		String msg = print.getMsg();
		System.out.println("Get: "+msg);
	}
	}
	@Override
	public void run() {
		getMessege();
	}

}
