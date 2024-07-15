package hello1.first.program;

public class Arithmatic {
	
	int operand1;
	int operand2;
	
public Arithmatic() {
	operand1=20;
	operand2=10;
	
}


public void addOperand() {
	System.out.println("Addition is="+(operand1+operand2));
}

public void subOperand() {
	System.out.println("Subtraction is="+(operand1-operand2));
}

public void mulOperand() {
	System.out.println("Multiplication is="+(operand1*operand2));
}

public void divOperand() {
	System.out.println("DIvision is="+(operand1/operand2));
	
}
public void modOperand() {
	System.out.println("MOdulas is="+(operand1%operand2));
	
}
	
}
