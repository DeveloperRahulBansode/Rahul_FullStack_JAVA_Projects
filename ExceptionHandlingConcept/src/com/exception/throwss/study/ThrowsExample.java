package com.exception.throwss.study;

public class ThrowsExample {
	public static void main(String[] args) {

		try {
			division(10, 0);
		} catch (Exception e) {
			//obj msg,line number print
			e.printStackTrace();
			System.out.println(e.getMessage());//only msg print 
			//stack element with msg and linenumber
			StackTraceElement[] element=e.getStackTrace();
			for(StackTraceElement ex:element) {
				System.out.println(ex.getMethodName()+"."+ex.getLineNumber());
			}
		}

//		division(10, 0);
	}

	public static void division(int num1, int num2) {
		if (num2 == 0) {
			throw new RuntimeException("can not divide");
		}
	}

}
