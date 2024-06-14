package operator.study;

public class MainForOperations {
public static void main(String args[]) {
	
	ArithmeticOperators operator=new ArithmeticOperators(50,60);
	
	float addition=operator.addOperand();
	System.out.println("Addition is="+addition);
	
	float subtraction=operator.subOperand();
	System.out.println("Subtraction is="+subtraction);
	
	float division=operator.divOperand();
	System.out.println("Division is="+division);
	
	float modulus=operator.modOperand();
	System.out.println("Modulus is="+modulus);
	
	//Logical Operators
	
	LogicalOperators loperator=new LogicalOperators('R','V',20,50);
	
	System.out.println("Operand1 is less than Operand2=" + loperator.lessThanOnOperand());
	System.out.println("Operand1 is grater than Operand2=" +loperator.greaterThanOnOperand());
	System.out.println("Operand1 is less than EqualTo Operand2="+loperator.lessThanEqualtoOnOperand());
	System.out.println("Operand1 is grater than EqualTo Operand2="+loperator.graterThanEqualtoOnOperand());
	System.out.println("Operand1 is EqualTo Operand2="+loperator.equalToOnOperand());
	System.out.println("Operand1 is Not EqualTo Operand2="+loperator.notEqualToOnOperand());
	
	//NOT,AND,OR
	System.out.println("if Operand3 is Greater than Operand4"+loperator.notonOperand());
	System.out.println("only Both expression returns True"+loperator.andOnOperand());
	System.out.println("only if any expression returns True"+loperator.orOnOperand());
	
	//Assignment Operators
	AssignmentOperators aoperator=new AssignmentOperators(100,200);
	
	System.out.println(""+aoperator.addCompoundAssignmentOperator());
	System.out.println(""+aoperator.subCompoundAssignmentOperator());
	System.out.println(""+aoperator.mulCompoundAssignmentOperator());
	System.out.println(""+aoperator.divCompoundAssignmentOperator());
	
	//BitWise Operations
	BitwiseOperators boperator=new BitwiseOperators();
	
	boperator.setvariable1(2);
	boperator.setvariable2(-3);
	System.out.println(boperator.andOperationOnVariable());
	System.out.println(boperator.orOperationOnVariable());
	System.out.println(boperator.xorOperationOnVariable());
	System.out.println(boperator.leftShiftOperationOnVariable());
	System.out.println(boperator.rightShiftOperationOnVariable());
	System.out.println(boperator.unsignedRightOperationOnVariable());
	
	//Unary Operations
	UnaryOperators uoperator=new UnaryOperators();
	
	uoperator.setVariable3(10);
	System.out.println(uoperator.preIncrementOnVariable3());
	System.out.println(uoperator.postIncreamentOnVariable3());
	System.out.println(uoperator.preDecrementOnVariable3());
	System.out.println(uoperator.postDecrementVariable3());
	
	System.out.println(uoperator.preDecrementOnVariable3()+uoperator.postIncreamentOnVariable3());
	
	// Ternary Operators
	TernaryOperators toperator=new TernaryOperators();
	
	toperator.setOperand1(10);
	toperator.setOperand2(20);
	System.out.println(toperator.tarnaryOperator());

	
	//swap two numbers
	
	SwapTwoNumbers swap=new SwapTwoNumbers(10,30);
	//Using variable
	swap.beforeSwap();
	swap.swapUsingThreeVariable();
	swap.afterSwap();
	//without using variable
	swap.beforeSwap();
	swap.swapWithoutUsingThreeVariable();
	swap.afterSwap();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}