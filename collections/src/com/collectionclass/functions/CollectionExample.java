package com.collectionclass.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
	
	public static void main(String[] args) {
		
		List<Integer> intList=new ArrayList<>();
		
		//Initial capacity
//		List<Integer> intList1=new ArrayList<>(5);
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		//Reverse Element
		Collections.reverse(intList);
		System.out.println(intList);
		
		//shuffle Element
		Collections.shuffle(intList);
		System.out.println(intList);
		
		//left rotate element
		Collections.rotate(intList, 1);
		System.out.println(intList);

		
        //find index position of element
		int index=Collections.binarySearch(intList, 1);
		System.out.println(index);
		
		//find Maximum value
		int max=Collections.max(intList);
		System.out.println(max);
		
		//find Minimum value
		int min=Collections.min(intList);
		System.out.println(min);
		

	}

}
