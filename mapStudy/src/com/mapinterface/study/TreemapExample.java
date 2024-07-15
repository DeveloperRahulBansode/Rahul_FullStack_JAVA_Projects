package com.mapinterface.study;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreemapExample {
	
	public static void main(String[] args) {
		
		NavigableMap<Student, Float> naviStud=new TreeMap<>();
		
		naviStud.put(new Student(1, "rahul"), 15000F);
		naviStud.put(new Student(2, "pratik"), 20000F);
		naviStud.put(new Student(3, "vinayak"), 55000F);
		naviStud.put(new Student(4, "pranav"), 35000F);
		naviStud.put(new Student(5, "krishna"), 25000F);
		
		naviStud.forEach((k,v)->System.out.println("Key="+k+" "+"value="+v));

		
		
	}

}
