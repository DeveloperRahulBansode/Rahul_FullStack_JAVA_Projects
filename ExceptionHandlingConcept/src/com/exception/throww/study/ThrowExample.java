package com.exception.throww.study;

public class ThrowExample {

	public static void main(String[] args) {

		try {
			division(10, 0);
		} catch (Exception e) {
			System.out.println(e);
		}
		//division(10,20);

	}

	public static void division(int num1, int num2) throws Exception,RuntimeException,IndexOutOfBoundsException {
		if (num2 == 0) {
			throw new Exception("Can not devide By zero");
		}
	}

}
