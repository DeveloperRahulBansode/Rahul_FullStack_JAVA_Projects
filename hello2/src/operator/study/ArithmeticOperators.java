package operator.study;

public class ArithmeticOperators {
	float operand1;
	float operand2;
	
	public ArithmeticOperators() {
		
	}

	public ArithmeticOperators(float operand1,float operand2) {
		this.operand1=operand1;
		this.operand2=operand2;
	}
		
	public float getoperand1() {
		return operand1;
	}
	
	public void setoperand1(float operand1) {
		this.operand1=operand1;
			
	}	
	
	public float getoperand2() {
		return operand2;
	}
	
	public void setoperand2(float operand2) {
		
		this.operand2=operand2;
			
	}	
	
	public float addOperand() {
		return operand1+operand2;
	}
	
	public float subOperand() {
		return operand1-operand2;
		
	}
	
	public float divOperand() {
		return operand1*operand2;
	}
	
	public float modOperand() {
		return operand1%operand2;
	}
	
	
	}
	

