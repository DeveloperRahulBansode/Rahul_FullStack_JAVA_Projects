package hello1.first.program;

public class arith {
	int operand1;
	int operand2;
	
	public arith() {
		operand1=20;
		operand2=30;
		
	}
	
	public arith(int num1,int num2) {
		operand1=num1;
		operand2=num2;
		
	}
	
	public int addoperand() {
		return operand1+operand2;
	}
	
	public int suboperand() {
		return operand1-operand2;
	}
	public int muloperand() {
		return operand1*operand2;
	}
	public int divoperand(){
		return operand1/operand2;
	
	}
	public int modoperand() {
		return operand1%operand2;
	}
}
