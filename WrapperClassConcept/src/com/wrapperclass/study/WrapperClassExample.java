package com.wrapperclass.study;

public class WrapperClassExample {
	public static void main(String[] args) {
		
		
		Integer number=Integer.valueOf(10);///Boxing
		
		int tempVal=20;
		Integer number1=tempVal;
		
		System.out.println(number);
		
		int tempVal1=Integer.valueOf(number);//un boxing
		tempVal=number;//auto un boxing
		Integer num1=10;
		Integer num2=10;
		
		// convert SString into Integer use ParseInt
		Integer number3=Integer.parseInt("123");
		System.out.println(number3+2);
		
		//convert values to other primitive type
		//LONG
		Long longVal=10L;
		float floatVal=longVal.floatValue();//LONG to FLOAT Implicitly
		System.out.println(floatVal);
		
		//Boolean To conver Only string not other
		Boolean flag=true;
		String flagString=flag.toString();
		System.out.println(flagString);
		
		Boolean.parseBoolean("True");
		int intVal=number1.valueOf("20");
		
		int value=Integer.compare(10, 20);
		//first number less than second the negative value or first is grater than second then Positive result is show
		//if both are same then 0 value show
		System.out.println(value);
		
		boolean d=num1.equals(num2);
		System.out.println(d);//true
		
		
		
		
		add(num1,num2);
		
	}
	
	
	public static void add(int num1,int num2) {
		System.out.println("Addition="+(num1+num2)
				);
	}

}
