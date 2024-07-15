package com.multithreading.interthread.polling;

public class App {
	public static void main(String[] args) {
		MsgPrinting msgprint= new MsgPrinting();
		
//		Thread consumer=new Thread(new MsgConsumer(msgprint));
//		Thread supplier=new Thread(new MsgSupplier(msgprint));
		
		MsgConsumer consumer=new MsgConsumer(msgprint);
		MsgSupplier supply=new MsgSupplier(msgprint);
		
		new Thread(()->supply.set()).start();
		new Thread(()->consumer.getMessege()).start();

		
//		consumer.start();
//		supplier.start();

		
		
	}

}
