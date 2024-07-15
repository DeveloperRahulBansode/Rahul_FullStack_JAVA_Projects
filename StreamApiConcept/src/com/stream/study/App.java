package com.stream.study;

import java.util.Arrays;
import java.util.stream.IntStream;

public class App {
	public static void main(String[] args) {
		int[] intArray = { 3, 2, 4, 5, 7, 8, 6, 9, 1 };

		IntStream intstream = Arrays.stream(intArray);
		//FILTER
//		// Intermediate function //Terminal function
		intstream.filter(no -> no % 2 == 0)
					.filter(number -> number > 2)
						.filter(number->number>4)
							.forEach(no -> System.out.println(no));
		

		//MAP
		IntStream intstream1 = Arrays.stream(intArray);
		intstream1.filter(no->no%2==0).map(no->no+1).forEach(no->System.out.println(no));

	}

}