package com.string.study;

public class StringBufferandBuilder {

	public static void main(String[] args) {
		//
		StringBuffer sbuf=new StringBuffer("rahul");
		System.out.println(sbuf.capacity());
		System.out.println(sbuf.length());
		System.out.println(sbuf.reverse());


		
		//
		StringBuilder sbil=new StringBuilder("pratik");
		System.out.println(sbil.capacity());
		System.out.println(sbil.length());
		System.out.println();
		System.out.println(sbil.reverse());
		System.out.println(sbil.append("pratik jige"));
		System.out.println(sbil.append(" harami"));
		System.out.println(sbil.insert(1, "pratik jige"));
		
		
		//toString
		System.out.println();
		
	System.out.println(sbil.toString());
	
	//equal
	StringBuilder sbil1=new StringBuilder("rahul bansode");
	if(sbil1.equals(sbil)) {
		System.out.println("both are equal");
	}
	else  
		System.out.println("no");


		
		
		
		
		
	}
}
