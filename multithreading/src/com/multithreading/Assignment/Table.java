package com.multithreading.Assignment;

public class Table {

	private int table;

	public Table(int table) {
		super();
		this.table = table;
	}

	public Table() {
		super();
	}

	public int getTable() {
		return table;
	}

	public void setTable(int table) {
		this.table = table;
	}

	public void printTable(int tableNo) {
		System.out.println("Table No:" + tableNo);
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(tableNo * i);

			}
		}

	}

}
