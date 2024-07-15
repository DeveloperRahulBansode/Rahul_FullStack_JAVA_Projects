
package menudeiven.program;

import java.util.Scanner;

public class ArithmetiCalculator {
	
	private int operand1;
	private int operand2;


	
	public ArithmetiCalculator() {}
	
	public ArithmetiCalculator(int operand1,int operand2) {
		this.operand1=operand1;
		this.operand2=operand2;	
	}
	
	public void setOperand1(int operand1) {
		this.operand1=operand1;
	}
	public int getOperand1() {
		return operand1;
	}
	public void setOperand2(int operand2) {
		this.operand2=operand2;
	}
	public int getOperand2() {
		return operand2;
	}
	public int addOperand() {
		return operand1+operand2;
	}
	public int subOperand() {
		return operand1-operand2;
	}
	public int mulOperand() {
		return operand1*operand2;
	}
	public int divOperaand() {
		return operand1/operand2;
	}
	public int modOperand() {
		return operand1%operand2;
	}
	
	public int printMenu(Scanner scanner) {
		System.out.println("1 : ADDITION");
		System.out.println("2 : SUBTRACTION");
		System.out.println("3 : MULTIPLICATION");
		System.out.println("4 : DIVISION");
		System.out.println("5 : MODULES");
		System.out.println("6 : EXIT");
		
	    int choice=scanner.nextInt();
	    return choice;
		
	}
	
	
	

}
