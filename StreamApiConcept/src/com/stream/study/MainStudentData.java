package com.stream.study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class MainStudentData {
	public static void main(String[] args) {

		Student[] studentArray = new Student[5];

		studentArray[0] = new Student(1, "Rahul", 21);
		studentArray[1] = new Student(2, "Pratik", 22);
		studentArray[2] = new Student(3, "Pranav", 21);
		studentArray[3] = new Student(4, "Krishna", 24);
		studentArray[4] = new Student(5, "Aalap", 25);

		// print MIN or max element using terminal
		Stream<Student> studentStream = Arrays.stream(studentArray);
		Optional<Integer> max=studentStream.map(obj -> obj.getAge()).distinct().sorted(Comparator.reverseOrder())
		.filter(e->e>20).min(Comparable::compareTo);
		if(!max.isEmpty())
			System.out.println(max);
		studentStream.close();
		
		// use toArray to convert object to String
		Stream<Student> studentStream1 = Arrays.stream(studentArray);
		String[] nameArray=studentStream1.map(Student::getName).toArray(String[]::new);
		for(String name:nameArray)
			System.out.println(name);
		
//		Stream<Student> studentStream2 = Arrays.stream(studentArray);
//		Stream<String> nameArray1=studentStream2.map(Student::getName).peek(System.out::println);
//		
		
	}

}
