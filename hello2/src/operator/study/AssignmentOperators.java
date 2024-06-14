package operator.study;

public class AssignmentOperators {
	int operand1;
	int operand2;
	
	public AssignmentOperators() {}
	
	public AssignmentOperators(int operand1,int operand2) {
		this.operand1=operand1;
		this.operand2=operand2;
	}
	
	public void getOperand1(int operand1) {
		this.operand1=operand1;
	}
	public int setOperand1() {
		return operand1;
	}
	
	public void getOperand2(int operand2) {
		this.operand2=operand2;
	}
	public int setOperand2() {
		return operand2;
	}
	
	public int addCompoundAssignmentOperator() {
		return operand1+=operand2;
	}
	
	public int subCompoundAssignmentOperator() {
		return operand1-=operand2;	
	}
	
	public int mulCompoundAssignmentOperator(){
		return operand1*=operand2;
	}
	
	
	public int divCompoundAssignmentOperator() {
		return operand1/=operand2;	
	}
	
	
	
}
