package com.mapinterface.study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class HashmapExample {

	public static void main(String[] args) {

		Map<Integer, String> pincodeMap = new HashMap<>();

		pincodeMap.put(421306, "kalyan east");
		pincodeMap.put(400612, "Thane");
		pincodeMap.put(400074, "Mumbai");
		pincodeMap.put(421301, "kalyan west");
		pincodeMap.put(400089, "Chembur");

		// Duplicate entry not allow if some duplicate value is
		// in your list then its get same location and replace with 2nd value

		pincodeMap.forEach((k, v) -> System.out.println("Pincode:" + k + " " + "City:" + v));
		// Ad for loop for the get element of Integer type pincode using Keyset()
		// Iteration
		for (Integer pincode : pincodeMap.keySet())
			System.out.println(pincode);

		// Ad for loop for the get element of String type city using value() Iteration
		for (String city : pincodeMap.values())
			System.out.println(city);

		// iterate throng Entry that returns key and Values data
		for (Entry<Integer, String> entry : pincodeMap.entrySet())
			System.out.println(entry);

		// direct using for each
		pincodeMap.keySet().forEach(System.out::println);
		pincodeMap.values().forEach(System.out::println);
		pincodeMap.entrySet().forEach(System.out::println);

		// using try
		try (Stream<Integer> pinStream = pincodeMap.keySet().stream()) {
			System.out.println(pinStream);
		}
		try (Stream<String> cityStream = pincodeMap.values().stream()) {
			System.out.println(cityStream);
		}
		try (Stream<Entry<Integer, String>> entStream = pincodeMap.entrySet().stream()) {
			System.out.println(entStream);
		}

		// using Iterator

		Iterator<Integer> pinIterator = pincodeMap.keySet().iterator();
		while (pinIterator.hasNext()) {
			System.out.println(pinIterator.next());
		}
		Iterator<String> cityIterator = pincodeMap.values().iterator();
		while (cityIterator.hasNext()) {
			System.out.println(cityIterator.next());
		}
		Iterator<Entry<Integer, String>> entryIterator = pincodeMap.entrySet().iterator();
		while (entryIterator.hasNext()) {
			System.out.println(entryIterator.next());
		}
		
		//methods
		//compute method provide 2 key value and provide one value in return
		pincodeMap.compute(421306, (k,v)->v.toUpperCase());
		System.out.println(pincodeMap.get(421306));
		
		//if key value not present then add new add key value
		pincodeMap.computeIfAbsent(420,Integer::toBinaryString);
		System.out.println(pincodeMap.get(420));
		pincodeMap.forEach((k,v)->System.out.println("key"+k+" "+"value"+v));
		
		

	}
}
