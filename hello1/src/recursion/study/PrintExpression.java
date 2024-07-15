package recursion.study;

public class PrintExpression {

	public static void printExpression(String expression, int number) {
		if (number <= 0) {
			System.out.println(expression);
			return;
		}       

		if (expression.equals("")) {
			expression = number + "";
		} else {
			expression = expression + "+" + number;
		}
		switch (number) {
		case 1 -> printExpression(expression, number - 1);

		default -> {
			printExpression(expression, number - 1);
			printExpression(expression, number - 2);
		}

		}

	}
}
