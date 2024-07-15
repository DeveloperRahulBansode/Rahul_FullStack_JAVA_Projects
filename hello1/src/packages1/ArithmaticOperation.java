package packages1;

public class ArithmaticOperation {
	int operand1;
	int operand2;
	
	
 ArithmaticOperation() {
	operand1=10;
	operand2=20;
}

 ArithmaticOperation(int num1, int num2){
	 operand1=num1;
	 operand2=num2;
	 
	 
 }
 void addoperand() {
	System.out.println("Add="+(operand1+operand2));
}

void suboperand() {
	System.out.println("Sub="+(operand1-operand2));
}

 void muloperand() {
	System.out.print("Mul="+(operand1*operand2));
}
 void divoperand() {
	System.out.print("Div="+(operand1/operand2));
}

}
