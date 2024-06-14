package abstraction.study.assignment;

public class MainArithmeticOperation {
	public static void main(String[] args) {

		ArithmeticOperation add = new Addition();
		ArithmeticOperation sub = new Subtraction();
		ArithmeticOperation mul = new Multiplication();
		ArithmeticOperation div = new Division();
		ArithmeticOperation mod = new Modules();

		
		System.out.println("Addition=" + add.operation(10, 20));
		System.out.println("Subtraction=" + sub.operation(50, 10));
		System.out.println("Multiplication=" + mul.operation(40, 24));
		System.out.println("Division=" + div.operation(80, 20));
		System.out.println("Modulus=" + mod.operation(50, 5));
		System.out.println();

		// Anonymous class define
		// Invoke constructor of Abstract class

		System.out.println("Anonymous class for Arithmetic Operation");
		// Addition
		ArithmeticOperation add1 = new ArithmeticOperation() {
			@Override
			public int operation(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println("Addition" + add1.operation(20, 10));
		// Subtraction
		ArithmeticOperation sub1 = new ArithmeticOperation() {
			@Override
			public int operation(int num1, int num2) {
				return num1 - num2;
			}
		};
		System.out.println("Subtraction=" + sub1.operation(50, 40));

		ArithmeticOperation mul1 = new ArithmeticOperation() {

			@Override
			public int operation(int num1, int num2) {
				return num1 * num2;
			}
		};
		System.out.println("Multiplication" + mul1.operation(60, 35));

		// Division
		ArithmeticOperation div1 = new ArithmeticOperation() {

			@Override
			public int operation(int num1, int num2) {
				return num1 / num2;
			}
		};
		System.out.println("Division=" + div1.operation(80, 50));

		// modulus
		ArithmeticOperation mod1 = new ArithmeticOperation() {
			@Override
			public int operation(int num1, int num2) {
				return num1 % num2;
			}
		};
		System.out.println("Modulus=" + mod1.operation(100, 10));

	}

}
