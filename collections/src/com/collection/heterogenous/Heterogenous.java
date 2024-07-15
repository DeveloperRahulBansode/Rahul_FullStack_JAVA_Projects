package com.collection.heterogenous;

import java.util.ArrayList;
import java.util.List;

public class Heterogenous {
	
	public static void main(String[] args) {
		//collection List Object
		List<Object> list=new ArrayList<>(5);
		
		list.add(10);
		list.add("rahul");
		list.add(new Employee(1,"emp1"));
		
		System.out.println(list);
		
		
		int[] intArray= {1,2,3};
		int lenght=intArray.length;
		
		
		
		
		
		
		
	}
	
	

}
