package com.objectclass.study;

public class ObjectClassExp {

	public static void main(String[] args) {
		
		Student student=new Student(1,"rahul");
		System.out.println(student.toString());
		
		Student student1=new Student(1,"rahul");
		System.out.println(student1.hashCode());
		System.out.println(student.hashCode());

		System.out.println(student1.equals(student));

	}
}
