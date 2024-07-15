package com.exception.trythrowresourse.study;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TryWithResourcesExample {
	public static void main(String[] args) {

		int[] intArray = new int[2];
		try (IntStream intstream = Arrays.stream(intArray);
			IntStream intstream1 = Arrays.stream(intArray);
			IntStream intstream2 = Arrays.stream(intArray)) {
		}
		try {
			
		}catch(Exception e) {
			
		}

	}

}
