package com.multithreading.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class empReflection {

	public static void main(String[] args) {

		Class<Employee> empClass = Employee.class;

		try {
			Employee employee = empClass.getDeclaredConstructor().newInstance(args);

			employee.setEmpId(101);
			employee.setEmpName("Rahul");
			employee.setEmpSalary(150000F);
			System.out.println(employee);

			Method[] methods = empClass.getDeclaredMethods();
			for (Method method : methods)
				System.out.println(method.getName());

			System.out.println();
			Field[] fields = empClass.getDeclaredFields();
			for (Field field : fields)
				System.out.println(field.getName());

			Method empid = empClass.getDeclaredMethod("setEmpId", Integer.class);
			empid.invoke(employee, 420);
			System.out.println(employee);

			Method empName = empClass.getDeclaredMethod("setEmpName", String.class);
			empName.invoke(employee, "Pratik");
			System.out.println(employee);

			Method empSalary = empClass.getDeclaredMethod("setEmpSalary", Float.class);
			empSalary.invoke(employee, 420F);
			System.out.println(employee);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
