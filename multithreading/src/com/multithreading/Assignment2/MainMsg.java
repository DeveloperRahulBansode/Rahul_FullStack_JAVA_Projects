package com.multithreading.Assignment2;


public class MainMsg {
	
	public static void main(String[] args) {
		
		Message msg=new Message();
		
		new Thread(()->msg.printMsg("a"),"Thread =1").start();
		new Thread(()->msg.printMsg("abc"),"Thread =2").start();
		new Thread(()->msg.printMsg("ab"),"Thread =3").start();

		
		
	}

}
