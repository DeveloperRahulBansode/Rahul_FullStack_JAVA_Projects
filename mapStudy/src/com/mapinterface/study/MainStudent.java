package com.mapinterface.study;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MainStudent {
	public static void main(String[] args) {

		Map<Student, Float> stuMap = new LinkedHashMap<>();

		stuMap.put(new Student(1, "rahul"), 15000F);
		stuMap.put(new Student(2, "pratik"), 20000F);
		stuMap.put(new Student(3, "vinayak"), 55000F);
		stuMap.put(new Student(4, "pranav"), 35000F);
		stuMap.put(new Student(5, "krishna"), 25000F);

		// Itertion

		stuMap.forEach((k, v) -> System.out.println("key:" + k + " " + "value:" + v));

		// for loop
		for (Student data : stuMap.keySet())
			System.out.println(data);

		for (Float salary : stuMap.values())
			System.out.println(salary);

		for (Entry<Student, Float> info : stuMap.entrySet())
			System.out.println(info);

		// using ForEach

		stuMap.keySet().forEach(System.out::print);
		stuMap.values().forEach(System.out::print);
		stuMap.entrySet().forEach(System.out::print);

		// using stream and try

		try (Stream<Student> stuStream = stuMap.keySet().stream()) {
			System.out.println(stuStream);
		}
		try (Stream<Float> floatStream = stuMap.values().stream()) {
			System.out.println(floatStream);
		}
		try (Stream<Entry<Student, Float>> entryStream = stuMap.entrySet().stream()) {
			System.out.println(entryStream);
		}

		// Iterator

		Iterator<Student> stuIterator = stuMap.keySet().iterator();
		while (stuIterator.hasNext())
			System.out.println(stuIterator.next());

		Iterator<Float> floatIterator = stuMap.values().iterator();
		while (floatIterator.hasNext())
			System.out.println(floatIterator.next());
		
		Iterator<Entry<Student,Float>> entryIterator = stuMap.entrySet().iterator();
		while (entryIterator.hasNext())
			System.out.println(entryIterator.next());
		
		//compute increase value (Fees) by 0.5% using key(Student)
		Iterator<Student> stuIterator1 = stuMap.keySet().iterator();
		 while(stuIterator1.hasNext()) {
			Student temp=stuIterator1.next(); 
			stuMap.compute(temp, (k,v)->v+(v*0.05F));
		 }
		 stuMap.forEach((k,v)->System.out.println("Key="+k+" "+"Value="+v));
	}

}
