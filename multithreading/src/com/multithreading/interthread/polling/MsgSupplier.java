package com.multithreading.interthread.polling;

public class MsgSupplier implements Runnable {
	
	private MsgPrinting print;

	public MsgSupplier(MsgPrinting print) {
		super();
		this.print = print;
	}
	
	public void set() {
		String[] names= {"Rahul","Pratik","Pranav","Krishna","Vinayak","0"};
		for(String name:names)
			print.setMsg(name);
		
	}

	@Override
	public void run() {
		set();
	}

}
