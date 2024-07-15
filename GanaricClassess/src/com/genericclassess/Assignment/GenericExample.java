package com.genericclassess.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GenericExample<T extends Number> {

	private T t;
	private List<T> TList=new ArrayList<>();
	private T[] tArray;
	
	public void setArray(T... tArray) {
		this.tArray=tArray;
	}
	public Stream<T> getArray(){
		return Arrays.stream(tArray);
	}

	public void setList(List<T> zList) {
		this.TList = zList;

	}

	public List<T> getList() {
		return TList;

	}

	public boolean addElement(T t) {
		return TList.add(t);

	}

	public void zForEach() {
		TList.forEach(System.out::println);
	}

}
