package operator.study;

public class BitwiseOperators {
	private int variable1;
	private int variable2;
	
	public BitwiseOperators(){}
	
	public BitwiseOperators(int variable1,int variable2) {
		
	this.variable1=variable1;
	this.variable2=variable2;
	}
	
	public void setvariable1(int variable1) {
		this.variable1=variable1;
	}
	
	public int getvariable1() {
		return variable1;
	}
	
	public void setvariable2(int variable2) {
		this.variable2=variable2;
	}
	
	public int getvariable2() {
		return variable2;
	}
	
	public int andOperationOnVariable() {
		return variable1&variable2;
	}
	
	public int orOperationOnVariable() {
		return variable1|variable2;
	}
	
	public int xorOperationOnVariable() {
		return variable1^variable2;
	}
	
	public int leftShiftOperationOnVariable() {
		return variable1<<1;
	}
	
	public int rightShiftOperationOnVariable() {
		return variable2>>1;
	}
	
	public int unsignedRightOperationOnVariable() {
		return variable2>>>1;
	}
	
	
	
	
	

}
