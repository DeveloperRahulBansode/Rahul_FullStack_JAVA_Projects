package com.garbagecollector.study;

public class MainGarbageCollection {
	@Override
	protected void finalize() throws Throwable{
		System.err.println("gc");
		super.finalize();
	}
	
	
	public static void main(String[] args) {
		printStudent();
		System.gc();
		
	}
	
	public static void printStudent() {
		Student student1=new Student();
		System.out.println(student1);
		
		
	}
}
