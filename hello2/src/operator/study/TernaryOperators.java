package operator.study;

public class TernaryOperators {
	
	private int operand1;
	private int operand2;
	
	public TernaryOperators() {}
	
	public TernaryOperators(int operand1,int operand2) {
		this.operand1=operand1;
		this.operand2=operand2;
	}
	
	public void setOperand1(int operand1) {
		this.operand1=operand1;
	}
	public float getoperand1() {
		return operand1;
	}
	public void setOperand2(int operand2) {
		this.operand2=operand2;
	}
	public float getoperand2() {
		return operand2;
	}
	
	public float tarnaryOperator() {
		return (operand1>operand2)? operand1:operand2;
	}

	
}
