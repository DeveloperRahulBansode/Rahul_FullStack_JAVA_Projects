package com.exception.study;

import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Exceptiondemo {
	public static void main(String[] args) {

		try {
			int number = 10 / 0;
			// catch use to catch the Exception for handle
		} catch (ArithmeticException e) {
			System.out.println(e);

		}

//		int num1=10/0;
		System.out.println("hii");
		try {
			division(10, 0);
		} catch (ArithmeticException e) {
			System.out.println(e);

		}
//		getDate("18.06.2024");
//		
//		
//		try{
//			System.out.println(getDate("18.06.24"));
//
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//			
//		}

		int[] intArray= {2,0};
		IntStream intStream=null;
		try {
			intStream=Arrays.stream(intArray);
			intStream.sorted().forEach(System.out::print);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			intStream.close();

		}
	}

	public static void division(int num1, int num2) {
		System.out.println(num1 / num2);
	}

//	public static Date getDate(String dateString) throws ParseException {
//		SimpleDateFormat dateFormat=new SimpleDateFormat("dd.MM.yy");
//		return dateFormat.parse(dateString);
//	}

}
