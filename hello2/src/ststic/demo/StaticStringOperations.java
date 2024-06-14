package ststic.demo;

import java.util.Arrays;

public class StaticStringOperations {

	// METHOD FOR COUNT VOVELS IN STRING
	public static void staticVovelCounter(String name) {

		int counterA = 0;
		int counterE = 0;
		int counterI = 0;
		int counterO = 0;
		int counterU = 0;
		int counterConsonent = 0;

		char[] nameArray = name.toCharArray();

		for (int i = 0; i < nameArray.length; i++) {
			switch (nameArray[i]) {
			case 'A' -> counterA++;
			case 'a' -> counterA++;

			case 'E' -> counterE++;
			case 'e' -> counterE++;

			case 'I' -> counterI++;
			case 'i' -> counterI++;

			case 'O' -> counterO++;
			case 'o' -> counterO++;

			case 'U' -> counterU++;
			case 'u' -> counterU++;

			default -> counterConsonent++;
			}

		}
		System.out.println("A:" + counterA);
		System.out.println("E:" + counterE);
		System.out.println("I:" + counterI);
		System.out.println("O:" + counterO);
		System.out.println("U:" + counterU);
		System.out.println(+counterConsonent);

	}

	// METHOD FOR MATCH STRING
	public static void matchString(String name) {
		if (name.matches("[A-Z][a-z]{1,29}")) {
			System.out.println("valid Name");

		} else {
			System.out.println("Invalid Name");
		}
	}

	// METHOD FOR REVERSE STRING
	public static void reverseString(String name) {

		char[] nameArray = name.toCharArray();

		int left = 0;
		int right = nameArray.length - 1;
		while (left < right) {
			char temp = nameArray[left];
			nameArray[left] = nameArray[right];
			nameArray[right] = temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(nameArray));
	}
	
	//STRINNG SPLIT AND JOIN
	public static void splitAndJoinString(String address) {
		String[] addComponent = address.split(" ");

		String newAddress = String.join("->", addComponent);

		System.out.println(newAddress);

	}

}
