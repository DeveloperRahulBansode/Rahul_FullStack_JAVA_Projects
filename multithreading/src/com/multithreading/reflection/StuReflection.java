package com.multithreading.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StuReflection {
	public static void main(String[] args) {

		Class<Student> classStudent = Student.class;

		try {
			Student student = classStudent.getDeclaredConstructor().newInstance(args);

			student.setStuId(1);
			student.setStuNname("rahul");
			System.out.println(student);

			Method[] methods = classStudent.getDeclaredMethods();
			for (Method method : methods)
				System.out.println(method.getName());

			System.out.println();
			Field[] fields = classStudent.getDeclaredFields();
			for (Field field : fields)
				System.out.println(field.getName());

			Method setName = classStudent.getDeclaredMethod("setStuNname", String.class);
			setName.invoke(student, "pratik");
			System.out.println(student);

			Method setStuId = classStudent.getDeclaredMethod("setStuId", Integer.class);
			setStuId.invoke(student, 20);
			System.out.println(student);

			Method method = classStudent.getDeclaredMethod("toString1", Integer.class, String.class);
			method.setAccessible(true);
			method.invoke(student, 10, "rahul");
			System.out.println(student);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
