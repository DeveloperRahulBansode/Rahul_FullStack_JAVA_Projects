package com.multithreading.interthread.polling;

public class MsgPrinting {

	private String msg;
	private boolean isready;

	public MsgPrinting(String msg) {
		super();
		this.msg = msg;
	}

	public MsgPrinting() {
		super();
	}

	public String getMsg() {
		synchronized (this) {
			while (!isready) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			isready = false;
			notifyAll();
			return msg;
		}

	}

	public void setMsg(String msg) {

		synchronized (this) {
			while (isready) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			isready = true;
			this.msg = msg;
			System.out.println("set:" + msg);
			notifyAll();
		}

	}

}
