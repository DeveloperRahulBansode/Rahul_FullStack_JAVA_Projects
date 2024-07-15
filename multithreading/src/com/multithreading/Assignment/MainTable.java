package com.multithreading.Assignment;

public class MainTable {
	public static void main(String[] args) {

		Table t1 = new Table();

//		RunnableTableDemo runneble1=new RunnableTableDemo(t1);
		new Thread(() -> t1.printTable(10)).start();

//		RunnableTableDemo runneble2=new RunnableTableDemo(t1);
		new Thread(() -> t1.printTable(20)).start();

		// thread creation

		new Thread(() -> {
			for (int i = 0; i <= 10; i++)
				System.out.println("i=" + i);
		}).start();
	}

}
