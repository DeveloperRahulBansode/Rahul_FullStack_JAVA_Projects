package com.stream.study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class MainStudent {
	public static void main(String[] args) {

		Student[] studentArray = new Student[5];

		studentArray[0] = new Student(1, "Rahul", 21);
		studentArray[1] = new Student(2, "Pratik", 22);
		studentArray[2] = new Student(3, "Pranav", 21);
		studentArray[3] = new Student(4, "Krishna", 24);
		studentArray[4] = new Student(5, "Aalap", 25);

		// print the name
		Stream<Student> studentStream = Arrays.stream(studentArray);
		studentStream.map(element -> element.getName()).filter(name -> name.charAt(0) == 'P')
				.forEach(name -> System.out.println(name));
		studentStream.close();

		// print Even(if condition is True) Roll number using Stream
		Stream<Student> studentStream1 = Arrays.stream(studentArray);
		studentStream1.map(list -> list.getRollNo()).filter(list -> list % 2 == 0)
				.forEach(list -> System.out.println(list));
		studentStream1.close();

		// Print Odd (if condition is TRUE) Roll no using FIlTER
		Stream<Student> studentStream2 = Arrays.stream(studentArray);
		studentStream2.filter(obj -> obj.getRollNo() % 2 != 0).forEach(obj -> System.out.println(obj));
		studentStream2.close();

		// print Distinct(remove duplicate value of age) return unique value in
		// Ascending order
		Stream<Student> studentStream3 = Arrays.stream(studentArray);
		studentStream3.map(obj -> obj.getAge()).distinct().sorted().forEach(obj -> System.out.println(obj));
		studentStream3.close();

		// print Distinct(remove duplicate value of age) return unique value in
		// Descending order
		Stream<Student> studentStream4 = Arrays.stream(studentArray);
		studentStream4.map(obj -> obj.getAge()).distinct().sorted(Comparator.reverseOrder())
				.forEach(obj -> System.out.println(obj));
		studentStream4.close();
		
		//print age and sort in descending order also use skip that skip some element and give remaining output
		Stream<Student> studentStream5 = Arrays.stream(studentArray);
		studentStream5.map(obj -> obj.getAge()).distinct().sorted(Comparator.reverseOrder())
		.filter(e->e>20).skip(2).forEach(obj -> System.out.println(obj));
		studentStream4.close();

	}

}
