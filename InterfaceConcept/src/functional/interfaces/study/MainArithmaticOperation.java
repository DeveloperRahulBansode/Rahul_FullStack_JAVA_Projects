package functional.interfaces.study;

public class MainArithmaticOperation {
	public static void main(String[] args) {
		ArithmaticOperation addition=(num1,num2)->num1+num2;
		ArithmaticOperation subtraction=(num1,num2)->num1-num2;
		ArithmaticOperation multiplication=(num1,num2)->num1*num2;
		ArithmaticOperation division=(num1,num2)->num1/num2;
		ArithmaticOperation modulus=(num1,num2)->num1%num2;
		
		System.out.println("Addition="+addition.operation(10,20));
		System.out.println("Subtraction="+subtraction.operation(10,20));
		System.out.println("Multiplication="+multiplication.operation(10,20));
		System.out.println("Division="+division.operation(10,20));
		System.out.println("Modulus="+modulus.operation(10,20));

		
		
		
	}

}
