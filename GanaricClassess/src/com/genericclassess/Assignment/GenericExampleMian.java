package com.genericclassess.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GenericExampleMian {
	
	public static void main(String[] args) {
		
		//we can not create the class object of type String because 
		//is not type of Number class that parent class of all wrapper class
//		List<String> gList=new ArrayList<>();
//		GenericExample<String> strData=new GenericExample<>();
		
		
		List<Integer> intGList=new ArrayList<>();
		GenericExample<Integer> IntData=new GenericExample<>();
		boolean intdata=IntData.addElement(10);
		boolean intdata1=IntData.addElement(20);
		boolean intdata2=IntData.addElement(30);
		System.out.println(IntData.getList());
		
		
		//using Array and stream
		
		GenericExample<Integer> intGen=new GenericExample<>();
		intGen.setArray(10,40,30);
		intGen.getArray().sorted().forEach(System.out::println);
		
		
		
		
		
		
	}

}
