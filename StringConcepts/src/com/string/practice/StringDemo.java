package com.string.practice;

public class StringDemo {
	public static void main(String[] args) {
		
		String str="Shelu 410101,GVAIET college";
		String str1="shelu 410101,GVAIET college";
		System.out.println(str.charAt(2)=='a');
		//to convert your string to charArray 
		char[] strArray=str.toCharArray();
		
		if(str.equals(str1)) 
			System.out.println("Both obj are equals");
		else
			System.out.println("Both obj are not equals");

		//first check character are equals or not as ascending order
		//second compare length the char
		System.out.println(str.compareTo(str1));
		
		// substring method used to cut the string as index of start and end position
		System.out.println(str.substring(6, 12));
		
		//return true whatever if string value is uppercase and lowercase casing doesn't matter
		if(str.equalsIgnoreCase(str1))
			System.out.println("Equal");
		else
			System.out.println("not Equal");
		
	}

}
