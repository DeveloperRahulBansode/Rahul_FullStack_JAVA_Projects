package com.genericclassess.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericMain {
	
	public static void main(String[] args) {
		List<Integer> intList=new ArrayList<>();
		ObjectBox<Integer> intBox=new ObjectBox<>();
		intBox.setList(intList);
		
		
		boolean result =intBox.addElement(10);
		boolean result1 =intBox.addElement(40);
		boolean result2=intBox.addElement(30);
		System.out.println(intList);
		
		List<String> strList=new ArrayList<>();
		ObjectBox<String> strBox=new ObjectBox<>();
		strBox.setList(strList);
		
		strBox.addElement("rahul");
		strBox.addElement("Pratik");
		strBox.addElement("Pranav");
		strBox.addElement("Krishna");
		
		System.out.println(strList);
		
		// the <?> mark that automatically identify your data in in which type
		List<?> resuList1=intBox.getList();
		List<?> strList1=strBox.getList();
		
		intBox.zForEach();
		strBox.zForEach();
		
		System.out.println(); 
		
		zsort(intBox);
		zsort(strBox);
		
		List<Student> stuList=new ArrayList<>();
		ObjectBox<Student> stuBox=new ObjectBox<>();
		stuBox.setList(stuList);
		
		
		stuList.add(new Student(1,"Bansode"));
		stuList.add(new Student(4,"Jige"));
		stuList.add(new Student(3,"Sali"));
		
		stuBox.zForEach();
		zsort(stuBox);
		
		
		
		
	}
	//object sorting using comparable only
	public static <Z extends Comparable<Z>> void zsort(ObjectBox<Z> zList) {
		Collections.sort(zList.getList());
		System.out.println(zList.getList());
	}

}
