package com.collection.gerericclass;

public class GenericClassDemo {
	
	
	public static void main(String[] args) {
		
		add(10,20);
		add(10,00);
		add(10,30);
		add(10,40);
		add(10,80);
		add(10,20);
		
		
		//Duplicate
		//generic class
		Generic2<Integer,String> intGen=new Generic2<>(1,"Rahul");
		
		System.out.println(intGen.getData1()+" "+intGen.getData2());
		System.out.println(intGen.getData2());


		
		
	}

	public static void add(int no1, int no2) {
		System.out.println(no1+no2);
		
	}

}
